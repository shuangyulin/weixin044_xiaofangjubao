/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - ssm54ujg
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm54ujg` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm54ujg`;

/*Table structure for table `chulijieguo` */

DROP TABLE IF EXISTS `chulijieguo`;

CREATE TABLE `chulijieguo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `shijianshijian` varchar(200) DEFAULT NULL COMMENT '事件时间',
  `shijianmiaoshu` varchar(200) DEFAULT NULL COMMENT '事件描述',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shijiandizhi` varchar(200) DEFAULT NULL COMMENT '事件地址',
  `chulizhuangtai` varchar(200) DEFAULT NULL COMMENT '处理状态',
  `chulixiangqing` longtext COMMENT '处理详情',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615386798619 DEFAULT CHARSET=utf8 COMMENT='处理结果';

/*Data for the table `chulijieguo` */

insert  into `chulijieguo`(`id`,`addtime`,`yonghuming`,`xingming`,`lianxifangshi`,`shijianshijian`,`shijianmiaoshu`,`tupian`,`shijiandizhi`,`chulizhuangtai`,`chulixiangqing`,`userid`) values (51,'2021-03-10 22:14:32','用户名1','姓名1','联系方式1','事件时间1','事件描述1','http://localhost:8080/ssm54ujg/upload/chulijieguo_tupian1.jpg','事件地址1','已处理','处理详情1',1),(52,'2021-03-10 22:14:32','用户名2','姓名2','联系方式2','事件时间2','事件描述2','http://localhost:8080/ssm54ujg/upload/chulijieguo_tupian2.jpg','事件地址2','已处理','处理详情2',2),(53,'2021-03-10 22:14:32','用户名3','姓名3','联系方式3','事件时间3','事件描述3','http://localhost:8080/ssm54ujg/upload/chulijieguo_tupian3.jpg','事件地址3','已处理','处理详情3',3),(54,'2021-03-10 22:14:32','用户名4','姓名4','联系方式4','事件时间4','事件描述4','http://localhost:8080/ssm54ujg/upload/chulijieguo_tupian4.jpg','事件地址4','已处理','处理详情4',4),(55,'2021-03-10 22:14:32','用户名5','姓名5','联系方式5','事件时间5','事件描述5','http://localhost:8080/ssm54ujg/upload/chulijieguo_tupian5.jpg','事件地址5','已处理','处理详情5',5),(56,'2021-03-10 22:14:32','用户名6','姓名6','联系方式6','事件时间6','事件描述6','http://localhost:8080/ssm54ujg/upload/chulijieguo_tupian6.jpg','事件地址6','已处理','处理详情6',6),(1615386798618,'2021-03-10 22:33:17','11','陈先生','13823866666','2021-03-10 22:25:39','消防栓破损','http://localhost:8080/ssm54ujg/upload/1615386348113.jpg','广州花园','已处理','收到你举报的信息后，我们马上派工作人员前往现场责令物业人员进行整改，现已整改完成',1615386271064);

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (1,'picture1','http://localhost:8080/ssm54ujg/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm54ujg/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm54ujg/upload/picture3.jpg'),(6,'homepage',NULL);

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='新闻资讯';

/*Data for the table `news` */

insert  into `news`(`id`,`addtime`,`title`,`introduction`,`picture`,`content`) values (61,'2021-03-10 22:14:32','标题1','简介1','http://localhost:8080/ssm54ujg/upload/news_picture1.jpg','内容1'),(62,'2021-03-10 22:14:32','标题2','简介2','http://localhost:8080/ssm54ujg/upload/news_picture2.jpg','内容2'),(63,'2021-03-10 22:14:32','标题3','简介3','http://localhost:8080/ssm54ujg/upload/news_picture3.jpg','内容3'),(64,'2021-03-10 22:14:32','标题4','简介4','http://localhost:8080/ssm54ujg/upload/news_picture4.jpg','内容4'),(65,'2021-03-10 22:14:32','标题5','简介5','http://localhost:8080/ssm54ujg/upload/news_picture5.jpg','内容5'),(66,'2021-03-10 22:14:32','标题6','简介6','http://localhost:8080/ssm54ujg/upload/news_picture6.jpg','内容6');

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,1,'abo','users','管理员','7olw1046kcf9rbrb1f8bgn2zyewu38t1','2021-03-10 22:19:46','2021-03-10 23:32:29'),(2,1615386271064,'11','yonghu','用户','mhoj1jtn70gaehb2yg6mwmglfcd7e3jl','2021-03-10 22:24:42','2021-03-10 23:29:54');

/*Table structure for table `tongjifenlei` */

DROP TABLE IF EXISTS `tongjifenlei`;

CREATE TABLE `tongjifenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shijianmiaoshu` varchar(200) DEFAULT NULL COMMENT '事件描述',
  `shijiandizhi` varchar(200) DEFAULT NULL COMMENT '事件地址',
  `xiaofangyinhuanfenlei` varchar(200) DEFAULT NULL COMMENT '消防隐患分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615386812601 DEFAULT CHARSET=utf8 COMMENT='统计分类';

/*Data for the table `tongjifenlei` */

insert  into `tongjifenlei`(`id`,`addtime`,`shijianmiaoshu`,`shijiandizhi`,`xiaofangyinhuanfenlei`) values (41,'2021-03-10 22:14:32','事件描述1','事件地址1','消防水'),(42,'2021-03-10 22:14:32','事件描述2','事件地址2','火灾自动报警'),(43,'2021-03-10 22:14:32','事件描述3','事件地址3','气体灭火'),(44,'2021-03-10 22:14:32','事件描述4','事件地址4','防排烟'),(45,'2021-03-10 22:14:32','事件描述5','事件地址5','应急疏散'),(46,'2021-03-10 22:14:32','事件描述6','事件地址6','防火分隔'),(1615386812600,'2021-03-10 22:33:31','消防栓破损','广州花园','消防水');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'abo','abo','管理员','2021-03-10 22:14:32');

/*Table structure for table `xiaofangyinhuanfenlei` */

DROP TABLE IF EXISTS `xiaofangyinhuanfenlei`;

CREATE TABLE `xiaofangyinhuanfenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `fenlei` varchar(200) DEFAULT NULL COMMENT '分类',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615386835991 DEFAULT CHARSET=utf8 COMMENT='消防隐患分类';

/*Data for the table `xiaofangyinhuanfenlei` */

insert  into `xiaofangyinhuanfenlei`(`id`,`addtime`,`fenlei`) values (1615386033277,'2021-03-10 22:20:33','消防水'),(1615386049319,'2021-03-10 22:20:48','火灾自动报警'),(1615386062139,'2021-03-10 22:21:01','气体灭火'),(1615386074165,'2021-03-10 22:21:14','防排烟'),(1615386106138,'2021-03-10 22:21:45','应急疏散'),(1615386133211,'2021-03-10 22:22:12','防火分隔'),(1615386835990,'2021-03-10 22:33:55','泡沫灭火');

/*Table structure for table `xiaofangyinhuanjubao` */

DROP TABLE IF EXISTS `xiaofangyinhuanjubao`;

CREATE TABLE `xiaofangyinhuanjubao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) DEFAULT NULL COMMENT '用户名',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `shijianshijian` datetime DEFAULT NULL COMMENT '事件时间',
  `shijianmiaoshu` longtext COMMENT '事件描述',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shijiandizhi` varchar(200) DEFAULT NULL COMMENT '事件地址',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1615386403421 DEFAULT CHARSET=utf8 COMMENT='消防隐患举报';

/*Data for the table `xiaofangyinhuanjubao` */

insert  into `xiaofangyinhuanjubao`(`id`,`addtime`,`yonghuming`,`xingming`,`lianxifangshi`,`shijianshijian`,`shijianmiaoshu`,`tupian`,`shijiandizhi`,`userid`) values (21,'2021-03-10 22:14:32','用户名1','姓名1','联系方式1','2021-03-10 22:14:32','事件描述1','http://localhost:8080/ssm54ujg/upload/xiaofangyinhuanjubao_tupian1.jpg','事件地址1',1),(22,'2021-03-10 22:14:32','用户名2','姓名2','联系方式2','2021-03-10 22:14:32','事件描述2','http://localhost:8080/ssm54ujg/upload/xiaofangyinhuanjubao_tupian2.jpg','事件地址2',2),(23,'2021-03-10 22:14:32','用户名3','姓名3','联系方式3','2021-03-10 22:14:32','事件描述3','http://localhost:8080/ssm54ujg/upload/xiaofangyinhuanjubao_tupian3.jpg','事件地址3',3),(24,'2021-03-10 22:14:32','用户名4','姓名4','联系方式4','2021-03-10 22:14:32','事件描述4','http://localhost:8080/ssm54ujg/upload/xiaofangyinhuanjubao_tupian4.jpg','事件地址4',4),(25,'2021-03-10 22:14:32','用户名5','姓名5','联系方式5','2021-03-10 22:14:32','事件描述5','http://localhost:8080/ssm54ujg/upload/xiaofangyinhuanjubao_tupian5.jpg','事件地址5',5),(26,'2021-03-10 22:14:32','用户名6','姓名6','联系方式6','2021-03-10 22:14:32','事件描述6','http://localhost:8080/ssm54ujg/upload/xiaofangyinhuanjubao_tupian6.jpg','事件地址6',6),(1615386403420,'2021-03-10 22:26:42','11','陈先生','13823866666','2021-03-10 22:25:39','消防栓破损','http://localhost:8080/ssm54ujg/upload/1615386348113.jpg','广州花园',1615386271064);

/*Table structure for table `yonghu` */

DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuming` varchar(200) NOT NULL COMMENT '用户名',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) NOT NULL COMMENT '姓名',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuming` (`yonghuming`)
) ENGINE=InnoDB AUTO_INCREMENT=1615386271065 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `yonghu` */

insert  into `yonghu`(`id`,`addtime`,`yonghuming`,`mima`,`xingming`,`touxiang`,`xingbie`,`lianxifangshi`) values (11,'2021-03-10 22:14:32','用户1','123456','姓名1','http://localhost:8080/ssm54ujg/upload/yonghu_touxiang1.jpg','男','13823888881'),(12,'2021-03-10 22:14:32','用户2','123456','姓名2','http://localhost:8080/ssm54ujg/upload/yonghu_touxiang2.jpg','男','13823888882'),(13,'2021-03-10 22:14:32','用户3','123456','姓名3','http://localhost:8080/ssm54ujg/upload/yonghu_touxiang3.jpg','男','13823888883'),(14,'2021-03-10 22:14:32','用户4','123456','姓名4','http://localhost:8080/ssm54ujg/upload/yonghu_touxiang4.jpg','男','13823888884'),(15,'2021-03-10 22:14:32','用户5','123456','姓名5','http://localhost:8080/ssm54ujg/upload/yonghu_touxiang5.jpg','男','13823888885'),(16,'2021-03-10 22:14:32','用户6','123456','姓名6','http://localhost:8080/ssm54ujg/upload/yonghu_touxiang6.jpg','男','13823888886'),(1615386271064,'2021-03-10 22:24:31','11','123456','陈先生','http://localhost:8080/ssm54ujg/upload/1615386307944.jpg','男','13823866666');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
