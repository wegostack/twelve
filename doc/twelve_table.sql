DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
 `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(100) NOT NULL COMMENT "任务名字",
 `app` VARCHAR(100) DEFAULT NULL,
 `trigger_type` VARCHAR(20) NOT NULL COMMENT "触发类型",
 `trigger_conf` VARCHAR(100) DEFAULT NULL COMMENT "触发配置",
 `enable` VARCHAR(40) DEFAULT NULL COMMENT "enable",
 `create_time` DATE COMMENT "create time",
 `modify_time` DATE COMMENT "修改时间",
  PRIMARY KEY (`id`)
);