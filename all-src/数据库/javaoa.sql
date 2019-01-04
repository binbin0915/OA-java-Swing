/*
 Navicat MySQL Data Transfer

 Source Server         : web
 Source Server Type    : MySQL
 Source Server Version : 50561
 Source Host           : 111.230.198.57:3306
 Source Schema         : javaoa

 Target Server Type    : MySQL
 Target Server Version : 50561
 File Encoding         : 65001

 Date: 23/12/2018 15:10:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for logindata
-- ----------------------------
DROP TABLE IF EXISTS `logindata`;
CREATE TABLE `logindata`  (
  `username` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(24) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of logindata
-- ----------------------------
INSERT INTO `logindata` VALUES ('', '');
INSERT INTO `logindata` VALUES ('541701', '123456');
INSERT INTO `logindata` VALUES ('541702', '123456');
INSERT INTO `logindata` VALUES ('541703', '123456');
INSERT INTO `logindata` VALUES ('admin', '000000');
INSERT INTO `logindata` VALUES ('sys', '123456');

-- ----------------------------
-- Table structure for messdata
-- ----------------------------
DROP TABLE IF EXISTS `messdata`;
CREATE TABLE `messdata`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `text` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `time` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `from` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `up` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of messdata
-- ----------------------------
INSERT INTO `messdata` VALUES ('2000', '今晚办公楼666开会', '2018/12/23 15:08:45', 'mmciel', '1');
INSERT INTO `messdata` VALUES ('2001', '今晚办公楼664开会', '2018/12/23 15:08:57', 'mmciel', '1');
INSERT INTO `messdata` VALUES ('2002', '明天kotlin发布更新', '2018/12/23 15:09:30', 'mmciel', '0');
INSERT INTO `messdata` VALUES ('2003', '下午03号项目交付', '2018/12/23 15:09:58', 'mmciel', '0');

-- ----------------------------
-- Table structure for userdata
-- ----------------------------
DROP TABLE IF EXISTS `userdata`;
CREATE TABLE `userdata`  (
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `number` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ad` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pos` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `adress` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `qq` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`username`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of userdata
-- ----------------------------
INSERT INTO `userdata` VALUES ('541701', '10003', '秋意寒', '17', '女', '1', 'ceo', '科学大道136', '10086', '2342412');
INSERT INTO `userdata` VALUES ('541702', '10004', '嘿嘿嘿', '17', '男', '1', 'cto', '科学大道136', '10087', '1223123');
INSERT INTO `userdata` VALUES ('541703', '10005', '帘安', '17', '男', '1', 'cfo', '科学大道136', '10089', '1231231');
INSERT INTO `userdata` VALUES ('admin', '10002', 'admin', '17', '女', '1', 'admin', '科学大道136', '10088', '5645666');
INSERT INTO `userdata` VALUES ('sys', '10000', 'mmciel', '16', '男', '1', 'system', '科学大道136', '10000', '9965756');

SET FOREIGN_KEY_CHECKS = 1;
