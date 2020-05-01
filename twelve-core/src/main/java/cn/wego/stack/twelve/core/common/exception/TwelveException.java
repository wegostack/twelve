package cn.wego.stack.twelve.core.common.exception;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class TwelveException extends RuntimeException {

    public TwelveException(String message) {
        super(message);
    }

    public TwelveException(Throwable cause) {
        super(cause);
    }
}
