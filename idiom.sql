/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : idiom

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 29/01/2022 19:14:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_idiom
-- ----------------------------
DROP TABLE IF EXISTS `tb_idiom`;
CREATE TABLE `tb_idiom` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `answer` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `group_id` int(11) DEFAULT NULL,
  `img_url` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of tb_idiom
-- ----------------------------
BEGIN;
INSERT INTO `tb_idiom` VALUES (1, '百里挑一', 1, 'http://www.hydcd.com/cy/fkccy/images/CF94617-50.png', 1);
INSERT INTO `tb_idiom` VALUES (3, '隔岸观火', 1, 'http://www.hydcd.com/cy/fkccy/images/CF94621.png', 1);
INSERT INTO `tb_idiom` VALUES (4, '卧薪尝胆', 1, 'http://www.hydcd.com/cy/fkccy/images/CF94621-50.png', 1);
INSERT INTO `tb_idiom` VALUES (5, '四通八达', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_2_20180729024923481.png', 1);
INSERT INTO `tb_idiom` VALUES (6, '网开一面', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_3_20180729024923544.png', 1);
INSERT INTO `tb_idiom` VALUES (7, '鱼贯而入', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_1_20180729024923372.png', 1);
INSERT INTO `tb_idiom` VALUES (8, '头重脚轻', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_4_20180729024923606.png', 1);
INSERT INTO `tb_idiom` VALUES (9, '鱼目混珠', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_6_20180729024923731.png', 1);
INSERT INTO `tb_idiom` VALUES (10, '胆大包天', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_9_2018072902494275.png', 1);
INSERT INTO `tb_idiom` VALUES (11, '破口大骂', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_10_20180729024942137.png', 1);
INSERT INTO `tb_idiom` VALUES (12, '天外有天', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_11_20180729024951262.png', 1);
INSERT INTO `tb_idiom` VALUES (13, '表里如一', 1, 'http://image109.360doc.com/DownloadImg/2018/07/2914/139801472_12_20180729024951294.png', 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
