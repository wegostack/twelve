package cn.wego.stack.twelve.core.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhengjianglong
 * @since 2020-05-01
 */
public class DateUtils {

    public static final String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";

    public String format(Date date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }
}
