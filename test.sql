/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50712
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50712
 File Encoding         : 65001

 Date: 30/09/2020 21:02:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of category
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES (2, 'Chó');
INSERT INTO `category` VALUES (3, 'Mèo');
INSERT INTO `category` VALUES (4, 'Bò sát');
INSERT INTO `category` VALUES (5, 'Côn trùng');
COMMIT;

-- ----------------------------
-- Table structure for order_detail
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` double(10,2) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) DEFAULT NULL,
  `total` double(255,0) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(10) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` tinyint(255) DEFAULT NULL COMMENT '0 - pending, 1 - processing, 2 -sent, 3- received, 4- canceled',
  `date_created` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of orders
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for products
-- ----------------------------
DROP TABLE IF EXISTS `products`;
CREATE TABLE `products` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `preview` varchar(255) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of products
-- ----------------------------
BEGIN;
INSERT INTO `products` VALUES (1, 'Chó Alaska', 500.00, 'Chó siêu ??p, sang x?n m?n', 'https://petmaster.vn/petroom/wp-content/uploads/2020/03/hinh-anh-cho-alaska.jpg', 2);
INSERT INTO `products` VALUES (2, 'Chó Phú Qu?c', 500.00, 'Siêu x?n m?n', 'https://azpet.com.vn/wp-content/uploads/2019/04/cho-phu-quoc-mau-ven-cop-1.jpg', 2);
INSERT INTO `products` VALUES (3, 'Chó mông c?c', 500.00, 'Sang x?n m?n', 'https://sieupet.com/sites/default/files/maltese_dog3_2.jpg', 2);
INSERT INTO `products` VALUES (4, 'Mèo ta', 25.00, 'Sang x?n m?n', 'https://i.ytimg.com/vi/bseFhJq7VWU/maxresdefault.jpg', 3);
INSERT INTO `products` VALUES (5, 'Mèo Anh', 10.00, 'T?m ??p', 'https://zoipet.com/wp-content/uploads/2020/03/meo-scottish.jpg', 3);
INSERT INTO `products` VALUES (6, 'Mèo Sphynx', 2000.00, 'Siêu ??p', 'https://petmaster.vn/petroom/wp-content/uploads/2020/04/meo-ai-cap.jpg', 3);
COMMIT;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of users
-- ----------------------------
BEGIN;
INSERT INTO `users` VALUES (1, 'admin', '21232f297a57a5a743894a0e4a801fc3');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
