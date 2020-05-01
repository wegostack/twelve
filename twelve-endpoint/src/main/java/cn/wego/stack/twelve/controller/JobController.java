package cn.wego.stack.twelve.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
@Controller
@Component
public class JobController {

    @RequestMapping
    public String addJob() {
        return "";
    }
}
