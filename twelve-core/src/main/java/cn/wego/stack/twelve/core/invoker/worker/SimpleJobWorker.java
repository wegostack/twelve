package cn.wego.stack.twelve.core.invoker.worker;

import cn.wego.stack.twelve.core.scheduler.SchedulerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class SimpleJobWorker implements IWorker {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleJobWorker.class);

    @Override
    public void execute(SchedulerContext context) {
        // todo
    }
}
