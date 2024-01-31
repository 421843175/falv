/*
 Navicat Premium Data Transfer

 Source Server         : my
 Source Server Type    : MySQL
 Source Server Version : 50521
 Source Host           : localhost:3306
 Source Schema         : fa

 Target Server Type    : MySQL
 Target Server Version : 50521
 File Encoding         : 65001

 Date: 28/02/2023 13:14:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for lvinfo
-- ----------------------------
DROP TABLE IF EXISTS `lvinfo`;
CREATE TABLE `lvinfo`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for retype
-- ----------------------------
DROP TABLE IF EXISTS `retype`;
CREATE TABLE `retype`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of retype
-- ----------------------------
INSERT INTO `retype` VALUES ('user', 'xingshi', '水电费');
INSERT INTO `retype` VALUES ('user', 'mingshi', '水电费');

-- ----------------------------
-- Table structure for reuser
-- ----------------------------
DROP TABLE IF EXISTS `reuser`;
CREATE TABLE `reuser`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `file` tinyint(1) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of reuser
-- ----------------------------
INSERT INTO `reuser` VALUES ('user', '0', '水电费胜多负少的', 0);
INSERT INTO `reuser` VALUES ('user', '1', '的顺丰到付', 0);
INSERT INTO `reuser` VALUES ('user', '1', '我爱他啊', 0);
INSERT INTO `reuser` VALUES ('user', '1', '你好啊', 0);
INSERT INTO `reuser` VALUES ('user', '1', '水电费水电费', 0);
INSERT INTO `reuser` VALUES ('user', '0', '水电费水电费', 0);
INSERT INTO `reuser` VALUES ('user', '1', '发水电费地方', 0);
INSERT INTO `reuser` VALUES ('user', '1', '水电费水电费', 0);
INSERT INTO `reuser` VALUES ('user', '1', '神鼎飞丹砂', 1);
INSERT INTO `reuser` VALUES ('user', '0', '水电费水电费', 1);
INSERT INTO `reuser` VALUES ('user', '0', '第三方第三方', 0);
INSERT INTO `reuser` VALUES ('user', '0', 'dsf', 0);

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `power` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES (1, 'user', 'c8b2f17833a4c73bb20f88876219ddcd', 0);
INSERT INTO `userinfo` VALUES (2, 'admin', '14e1b600b1fd579f47433b88e8d85291', 1);
INSERT INTO `userinfo` VALUES (3, 'u', '14e1b600b1fd579f47433b88e8d85291', 0);
INSERT INTO `userinfo` VALUES (4, 'himeng', '14e1b600b1fd579f47433b88e8d85291', 0);
INSERT INTO `userinfo` VALUES (5, 'tyy', '0c30684c3f97cfe01ce7e2d12c2a20d6', 0);
INSERT INTO `userinfo` VALUES (6, 'wange', 'd8f393d46a1e77912114a4af40edd5e4', 0);

-- ----------------------------
-- Table structure for usermassage
-- ----------------------------
DROP TABLE IF EXISTS `usermassage`;
CREATE TABLE `usermassage`  (
  `username` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `message` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of usermassage
-- ----------------------------
INSERT INTO `usermassage` VALUES ('user', 'sdf', '2023-02-2615:38:21');
INSERT INTO `usermassage` VALUES ('user', 'sfsd', '2023-02-2615:39:39');
INSERT INTO `usermassage` VALUES ('user', '我爱他', '2023-02-2615:40:45');
INSERT INTO `usermassage` VALUES ('user', '胜多负少', '2023-02-2615:41:32');
INSERT INTO `usermassage` VALUES ('user', '水电费第三方', '2023-02-2615:41:42');
INSERT INTO `usermassage` VALUES ('user', 'sdfsdfsd ', '2023-02-2615:44:01');
INSERT INTO `usermassage` VALUES ('user', '‘胜多负少的’', '2023-02-2615:44:11');
INSERT INTO `usermassage` VALUES ('user', 'or union', '2023-02-2615:44:18');
INSERT INTO `usermassage` VALUES ('user', '我爱他', '2023-02-2615:45:58');
INSERT INTO `usermassage` VALUES ('user', '水电费水电费', '2023-02-2615:47:13');
INSERT INTO `usermassage` VALUES ('user', '水电费', '2023-02-2615:47:54');
INSERT INTO `usermassage` VALUES ('user', '胜多负少', '2023-02-2615:49:48');
INSERT INTO `usermassage` VALUES ('user', '水电费', '2023-02-2615:50:41');
INSERT INTO `usermassage` VALUES ('user', '似懂非懂', '2023-02-2615:50:43');
INSERT INTO `usermassage` VALUES ('user', '的省份身份', '2023-02-2615:50:52');
INSERT INTO `usermassage` VALUES ('user', '胜多负少的', '2023-02-2615:52:52');
INSERT INTO `usermassage` VALUES ('user', '水电费', '2023-02-2615:53:03');
INSERT INTO `usermassage` VALUES ('user', '你好帅啊', '2023-02-2615:53:06');
INSERT INTO `usermassage` VALUES ('user', '是否是', '2023-02-2615:53:29');
INSERT INTO `usermassage` VALUES ('user', 'df ', '2023-02-2721:11:00');
INSERT INTO `usermassage` VALUES ('user', 'sdf', '2023-02-2721:11:03');
INSERT INTO `usermassage` VALUES ('user', 'sdf', '2023-02-2811:08:11');
INSERT INTO `usermassage` VALUES ('user', 'aav', '2023-02-2811:08:14');

-- ----------------------------
-- Table structure for userread
-- ----------------------------
DROP TABLE IF EXISTS `userread`;
CREATE TABLE `userread`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `body` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `read` tinyint(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userread
-- ----------------------------
INSERT INTO `userread` VALUES (1, 'user', 'dsf', '1sdf', 1);
INSERT INTO `userread` VALUES (2, 'user', '这是标题', '这是内容', 1);

-- ----------------------------
-- Table structure for userrelname
-- ----------------------------
DROP TABLE IF EXISTS `userrelname`;
CREATE TABLE `userrelname`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `relname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `nick` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` int(255) NULL DEFAULT NULL,
  `birth` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `info` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userrelname
-- ----------------------------
INSERT INTO `userrelname` VALUES ('user', 'dsfdsdfs', 'sdf', 1, '2022-02-09', 'esdfr');

SET FOREIGN_KEY_CHECKS = 1;
