package cn.wego.stack.twelve.controller;

import cn.wego.stack.twelve.core.trigger.CronTrigger;
import cn.wego.stack.twelve.twelve.model.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
@Controller
@Component
public class JobController {

    @Autowired
    private CronTrigger cronTrigger;

    @PostConstruct
    public void init() {
        Job job = new Job();
        job.setApp("test");
        job.setName("name");
        cronTrigger.addJob(job);
    }

    @RequestMapping
    public String addJob() {

        return "";
    }
}
