package cn.wego.stack.twelve.core.scheduler.queue;

import cn.wego.stack.twelve.core.scheduler.worker.DefaultSchedulerWorker;
import cn.wego.stack.twelve.core.trigger.SchedulerEvent;
import cn.wego.stack.twelve.core.utils.ThreadPoolManager;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class DefaultSchedulerQueue implements SchedulerQueue {
    private static final Queue<SchedulerEvent> schedulerQueue = new LinkedList<>();

    @Override
    public boolean offer(SchedulerEvent context) {
        return schedulerQueue.offer(context);
    }

    @Override
    public void init() {
        ThreadPoolExecutor mainThreadPool = ThreadPoolManager.getThreadPool(ThreadPoolManager.SCHEDULER_BOSS_THREAD_POOL);
        mainThreadPool.execute(() -> {
            SchedulerEvent context = schedulerQueue.poll();
            ThreadPoolExecutor threadPool = ThreadPoolManager.getThreadPool(ThreadPoolManager.SCHEDULER_WORKER_THREAD_POOL);
            threadPool.execute(() -> {
                DefaultSchedulerWorker simpleJobWorker = new DefaultSchedulerWorker();
                simpleJobWorker.execute(context);
            });
        });
    }
}
