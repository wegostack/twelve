package cn.wego.stack.twelve.core.scheduler.queue;

import cn.wego.stack.twelve.core.invoker.worker.SimpleJobWorker;
import cn.wego.stack.twelve.core.scheduler.SchedulerContext;
import cn.wego.stack.twelve.core.utils.ThreadPoolManager;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class DefaultSchedulerQueue implements SchedulerQueue {
    private static final Queue<SchedulerContext> schedulerQueue = new LinkedList<>();

    @Override
    public boolean offer(SchedulerContext context) {
        return schedulerQueue.offer(context);
    }

    @Override
    public void init() {
        ThreadPoolExecutor mainThreadPool = ThreadPoolManager.getThreadPool(ThreadPoolManager.SCHEDULER_BOSS_THREAD_POOL);
        mainThreadPool.execute(() -> {
            SchedulerContext context = schedulerQueue.poll();
            ThreadPoolExecutor threadPool = ThreadPoolManager.getThreadPool(ThreadPoolManager.SCHEDULER_WORKER_THREAD_POOL);
            threadPool.execute(() -> {
                SimpleJobWorker simpleJobWorker = new SimpleJobWorker();
                simpleJobWorker.execute(context);
            });
        });
    }
}
