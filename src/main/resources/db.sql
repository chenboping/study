CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(20) NOT NULL DEFAULT '-1' COMMENT '用户id',
  `nickName` varchar(20) NOT NULL DEFAULT '小狗' COMMENT '用户昵称',
  `sex` int NOT NULL DEFAULT '0' COMMENT '性别',
  `mobile` varchar(36) NOT NULL DEFAULT '-1' COMMENT '手机号',
  `email` varchar(36) DEFAULT '-1' COMMENT '邮箱',
  `password` varchar(20) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表'