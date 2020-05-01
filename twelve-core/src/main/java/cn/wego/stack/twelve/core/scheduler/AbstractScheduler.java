package cn.wego.stack.twelve.core.scheduler;

import cn.wego.stack.twelve.core.scheduler.router.IRouter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

import javax.xml.ws.spi.Invoker;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public abstract class AbstractScheduler implements IScheduler {
    private Logger LOGGER = LoggerFactory.getLogger(AbstractScheduler.class);

    protected IRouter router;
    protected Invoker invoker;

    @Override
    public void schedule() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            preparedSchedule();

            doSchedule();

            postSchedule();

        } catch (Throwable e) {
            LOGGER.error("schedule job exception", e);

            processScheduleException();

        } finally {
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("schedule job spend {} ms", stopWatch.getTotalTimeMillis());
            }
        }
    }

    protected abstract void doSchedule();

    protected abstract void processScheduleException();

    protected abstract void preparedSchedule();

    protected abstract void postSchedule();
}
