package cn.wego.stack.twelve.core.utils;

import java.util.Map;
import java.util.concurrent.*;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class ThreadPoolManager {
    private static Map<String, ThreadPoolExecutor> threadPools = new ConcurrentHashMap<>();

    public static final String SCHEDULER_BOSS_THREAD_POOL = "SCHEDULER_BOSS_THREAD_POOL";
    public static final String SCHEDULER_WORKER_THREAD_POOL = "SCHEDULER_WORKER_THREAD_POOL";

    static {
        creatThreadPool(SCHEDULER_BOSS_THREAD_POOL, 1, 1, 0);
        creatThreadPool(SCHEDULER_WORKER_THREAD_POOL, 30, 20, 5000);
    }

    private static void creatThreadPool(String name, int maxPoolSize, int corePoolSize, int queueCapacity) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(corePoolSize, maxPoolSize, 60, TimeUnit.SECONDS,
                createQueue(queueCapacity), new NameThreadFactory(name),
                new ThreadPoolExecutor.AbortPolicy());
        threadPools.put(name, threadPool);
    }

    private static BlockingQueue<Runnable> createQueue(int queueCapacity) {
        if (queueCapacity > 0) {
            return new LinkedBlockingQueue<Runnable>(queueCapacity);
        } else {
            return new SynchronousQueue<>();
        }
    }

    public static ThreadPoolExecutor getThreadPool(String name) {
        return threadPools.get(name);
    }
}
