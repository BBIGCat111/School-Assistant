/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : school assistant

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 31/08/2020 20:52:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for memory
-- ----------------------------
DROP TABLE IF EXISTS `memory`;
CREATE TABLE `memory`  (
  `stu_id` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `memoryData` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`stu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of memory
-- ----------------------------
INSERT INTO `memory` VALUES ('2220161451', '11111');

SET FOREIGN_KEY_CHECKS = 1;
