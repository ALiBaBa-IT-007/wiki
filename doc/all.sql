DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo`
(
    `id`   bigint NOT NULL comment 'id',
    `name` varchar(50) comment '名称',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  default
      CHARACTER SET = utf8mb4 comment = '测试';

INSERT INTO `demo` (id, name)
VALUES (1, '测试');