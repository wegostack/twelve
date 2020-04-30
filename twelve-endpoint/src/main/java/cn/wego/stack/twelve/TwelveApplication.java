package cn.wego.stack.twelve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"cn.wego.stack.twelve"})
public class TwelveApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwelveApplication.class, args);
    }
}
