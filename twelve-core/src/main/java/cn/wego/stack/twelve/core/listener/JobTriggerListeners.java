package cn.wego.stack.twelve.core.listener;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public interface JobTriggerListeners {

    void delayEvent();

    void prepareTrigger();

    void beforeTriger();

    void postTrigger();

    void triggerSuccess();

    void triggerFailed();

    void callback();
}
