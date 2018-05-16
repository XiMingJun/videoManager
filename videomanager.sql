
-- 用户表
CREATE TABLE `videomanager`.`user`(
  `user_id` bigint(10) PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '用户id',
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
`gender` tinyint(1) NULL DEFAULT 1 COMMENT '性别 0 女，1 男',
`portrait` varchar(30)  COMMENT '头像',
  `birthday` datetime(0) NULL  COMMENT '出生日期',
  `is_delete` tinyint(1) NULL DEFAULT 0 COMMENT '是否删除 0 未删除，1 已删除',
  `gmt_create` datetime(0) NULL  COMMENT '注册时间',
  `gmt_modified` datetime(0) NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '上次更新时间'
);

-- 管理员表
CREATE TABLE `videomanager`.`admin_user`(
  `admin_id` bigint(10) PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '管理员id',
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '密码',
  `is_delete` tinyint(1) NULL DEFAULT 0 COMMENT '是否删除 0 未删除，1 已删除',
  `gmt_create` datetime(0) NULL  COMMENT '账号产生时间',
  `gmt_modified` datetime(0) NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '上次更新时间'
);

-- 讲师表
CREATE TABLE `videomanager`.`teacher` (
  `teacher_id` bigint(10)  PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '讲师id',
  `name` varchar(20) NOT NULL COMMENT '讲师姓名',
  `gender` tinyint(1) NULL DEFAULT 1 COMMENT '性别 0 女，1 男',
  `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '上次更新时间',
  `portrait` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '头像',
  `is_delete` tinyint(1) NULL DEFAULT 0 COMMENT '是否删除 0 未删除，1 已删除',
  `gmt_create` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `description` varchar(255) NULL COMMENT '简介',
  `job` varchar(50) NULL COMMENT '职务',
  `create_admin` bigint(10) NULL COMMENT '创建操作员',
  `modified_admin` bigint(10) NULL COMMENT '修改操作员'
);

-- 视频表

CREATE TABLE `videomanager`.`video`  (

`video_id` bigint(10)  PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '视频id',

`course_id` bigint(10) NULL COMMENT '课程id',

`teacher_id` bigint(10) NULL COMMENT '讲师id',

`title` varchar(30) NULL COMMENT '标题',

`video_length` int(20) NULL COMMENT '视频长度',

`cover` varchar(255) NULL COMMENT '视频封面',

`video_address` varchar(255) NULL COMMENT '视频地址',

`description` varchar(255) NULL COMMENT '视频简介',

`gmt_create` datetime(0) NULL COMMENT '视频新增时间',

`create_userId` bigint(10) NULL COMMENT '操作管理员用户',

`gmt_update` datetime(0) NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '修改时间',

`is_delete` tinyint(1) NULL DEFAULT 0 COMMENT '是否删除 0 未删除，1 已删除'
);

-- 课程表
CREATE TABLE `videomanager`.`course` (
  `course_id` bigint(10) PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '课程id',
  `gmt_create` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '上次更新时间',
  `create_admin` bigint(10) NULL DEFAULT NULL COMMENT '创建操作员',
  `modified_admin` bigint(10) NULL DEFAULT NULL COMMENT '修改操作员',
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '简介',
  `subject_id` bigint(10) NULL COMMENT '学科id'
);

-- 学科表
CREATE TABLE `videomanager`.`subject`  (
  `subject_id` bigint(10) PRIMARY key AUTO_INCREMENT NOT NULL COMMENT '学科id',
  `gmt_create` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `gmt_modified` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '上次更新时间',
  `create_admin` bigint(10) NULL DEFAULT NULL COMMENT '创建操作员',
  `modified_admin` bigint(10) NULL DEFAULT NULL COMMENT '修改操作员',
  `title` varchar(50) NULL COMMENT '学科名称'
 
);

INSERT INTO admin_user(`name`,`password`) VALUES('admin','12345');

ALTER TABLE course  ADD `is_delete` tinyint(1) NULL DEFAULT 0 COMMENT '是否删除 0 未删除，1 已删除';
ALTER TABLE `subject`  ADD `is_delete` tinyint(1) NULL DEFAULT 0 COMMENT '是否删除 0 未删除，1 已删除';

INSERT INTO course(create_admin,title,description,subject_id) 
VALUES
(1,'javaWeb','javaWeb基础课程',1),
(1,'java','java基础课程',1),
(1,'hadoop','hadoop基础课程',1),
(1,'scala','scala基础课程',1),
(2,'色彩搭配','色彩搭配基础课程',1),
(2,'设计','UI设计基础',1),
(3,'VR','VR基础课程',1),
(4,'python基础','python基础课程',1);

INSERT INTO `subject`(create_admin,gmt_create,title) 
VALUES
(1,CURRENT_TIME,'大数据'),
(1,CURRENT_TIME,'UI'),
(1,CURRENT_TIME,'VR'),
(1,CURRENT_TIME,'Python人工智能');


INSERT INTO teacher(`name`,gmt_create,description,job,create_admin)
VALUES
('BD_赵',CURRENT_TIME,'大数据赵老师','讲师',1),
('UI_钱',CURRENT_TIME,'UI 钱老师','讲师',1),
('VR_孙',CURRENT_TIME,'VR孙老师','讲师',1),
('Python_李',CURRENT_TIME,'python李老师','讲师',1)
;

INSERT INTO video(course_id,teacher_id,title,description,create_userId,gmt_create)
VALUES
(1,1,'servlet基础','介绍servlet基础用法',1,CURRENT_TIME),
(2,1,'for循环','介绍for循环',1,CURRENT_TIME),
(5,2,'色彩学','色彩学基础',1,CURRENT_TIME),
(8,4,'servlet基础','介绍servlet基础用法',1,CURRENT_TIME);

