package cn.wego.stack.twelve.twelve.model;

/**
 * @author zhengjianglong
 * @since 2020-04-30
 */
public class Job {
    private Long id;
    private String name;
    private String app;
    private String cron;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
}
