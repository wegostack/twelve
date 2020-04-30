package cn.wego.stack.twelve;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.wego.stack.twelve"})
@MapperScan("cn.wego.stack.twelve.dal.dao")
public class TwelveApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(TwelveApplication.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(TwelveApplication.class, args);
        } catch (Throwable e) {
            LOGGER.error("twelve application start exception:", e);
        }
    }
}
