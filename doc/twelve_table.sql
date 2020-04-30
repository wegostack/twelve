DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
 `id` BIGINT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(100) NOT NULL COMMENT "任务名字",
 `app` VARCHAR(100) DEFAULT NULL,
 `cron` VARCHAR(20) DEFAULT NULL,
 `enable` VARCHAR(40) DEFAULT NULL COMMENT "enable",
 `create_time` DATE COMMENT "create time",
 `modify_time` DATE COMMENT "修改时间",
  PRIMARY KEY (`id`)
);