package cn.wego.stack.twelve.core.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class TwelveRunListeners {
    private static final Logger LOGGER = LoggerFactory.getLogger(TwelveRunListeners.class);

    public void starting() {
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("twelve server is starting");
        }

    }

    public void loadJob() {

    }

    public void fininshed() {

    }

    public void shutDown() {

    }

    public void schedulerInitFinished() {

    }
}
