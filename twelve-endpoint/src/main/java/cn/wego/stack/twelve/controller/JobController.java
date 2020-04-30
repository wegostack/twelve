package cn.wego.stack.twelve.controller;

import cn.wego.stack.twelve.core.trigger.CronTrigger;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private CronTrigger cronTrigger;

    @RequestMapping
    public String addJob() {
        return "";
    }
}
