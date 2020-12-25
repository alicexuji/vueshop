-- MySQL dump 10.13  Distrib 8.0.22, for macos10.15 (x86_64)
--
-- Host: localhost    Database: vueshop
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_brand`
--

DROP TABLE IF EXISTS `tb_brand`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_brand` (
  `id` int NOT NULL AUTO_INCREMENT,
  `brand_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `display` tinyint DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_brand`
--

LOCK TABLES `tb_brand` WRITE;
/*!40000 ALTER TABLE `tb_brand` DISABLE KEYS */;
INSERT INTO `tb_brand` VALUES (1,'比乐','狗粮',1,NULL,NULL),(2,'宝路','狗粮',1,NULL,NULL);
/*!40000 ALTER TABLE `tb_brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_category`
--

DROP TABLE IF EXISTS `tb_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_category` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `display` tinyint DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_category`
--

LOCK TABLES `tb_category` WRITE;
/*!40000 ALTER TABLE `tb_category` DISABLE KEYS */;
INSERT INTO `tb_category` VALUES (1,'狗粮','进口狗粮 国产狗粮 冻干狗粮小型犬专用 大型犬专用 大型犬幼犬专用 夏日清火',1,'2020-12-12 14:56:57','2020-12-12 14:56:59'),(2,'牵引','牵引绳 胸带 项圈等',1,'2020-12-17 21:38:04',NULL),(3,'服饰','卫衣 毛衣 雨衣',1,'2020-12-17 21:38:07',NULL),(4,'狗狗零食','磨牙洁齿 肉制零食 点心饮料 罐头湿粮 冻干零食',1,'2020-12-12 14:56:57','2020-12-12 14:56:59'),(5,'宠物玩具','棉制玩具 橡胶玩具 塑料玩具 ',1,'2020-12-17 21:28:45',NULL),(6,'狗狗护理','体内体外驱虫 耳部护理 眼部护理 口鼻护理 皮肤护理',1,'2020-12-12 14:56:57','2020-12-12 14:56:59');
/*!40000 ALTER TABLE `tb_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_order`
--

DROP TABLE IF EXISTS `tb_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `orderSn` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `receiver_keyword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `status` int DEFAULT NULL,
  `pay_type` int DEFAULT NULL,
  `member_username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `total_amount` decimal(10,0) DEFAULT '0',
  `payment_time` datetime DEFAULT NULL,
  `delivery_time` datetime DEFAULT NULL,
  `receive_time` datetime DEFAULT NULL,
  `receiver_name` varchar(20) DEFAULT NULL,
  `receiver_phone` varchar(20) DEFAULT NULL,
  `format_address` varchar(50) DEFAULT NULL,
  `delivery_company` varchar(50) DEFAULT NULL,
  `deliverySn` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_order`
--

LOCK TABLES `tb_order` WRITE;
/*!40000 ALTER TABLE `tb_order` DISABLE KEYS */;
INSERT INTO `tb_order` VALUES (1,'202012152030151601','jack',0,1,'ayumi888','2020-12-15 22:33:27',NULL,200,'2020-11-14 18:22:19','2020-11-15 18:10:45','2020-11-15 23:21:58','jack','13817878722','上海市浦东新区陆家嘴1号',NULL,NULL),(2,'202012152030151604','rose',2,2,'tb666','2020-09-20 13:26:30',NULL,81,'2020-07-15 23:22:32','2020-07-16 17:17:59','2020-07-17 17:14:05','lily','18989898899','上海市黄浦区愚园路30号','圆通快递','65432345'),(3,'234354544','monica',2,2,'tb8999','2020-09-20 13:26:30',NULL,81,'2020-07-15 23:22:32','2020-12-17 14:07:07',NULL,'nomica','18989898899','上海市黄浦区愚园路30号','顺丰快递','788');
/*!40000 ALTER TABLE `tb_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_product`
--

DROP TABLE IF EXISTS `tb_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `category_id` int DEFAULT NULL,
  `brand_id` int DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `sale` varchar(50) DEFAULT NULL,
  `sell_price` decimal(10,2) DEFAULT '0.00',
  `description` varchar(255) DEFAULT NULL,
  `pic_url` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `publish_status` int DEFAULT NULL,
  `brand_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_product`
--

LOCK TABLES `tb_product` WRITE;
/*!40000 ALTER TABLE `tb_product` DISABLE KEYS */;
INSERT INTO `tb_product` VALUES (1,1,1,'比乐狗粮中大型犬成犬','5000',500.00,'中大型犬成犬粮10kg','https://img.alicdn.com/imgextra/i1/2206345553294/O1CN01Y0X8Kg1aChHMLrAM1_!!2206345553294.jpg_430x430q90.jpg',NULL,NULL,0,'比乐'),(2,1,1,'PetMaster 深海鱼鸡肉味全犬种成犬粮 1.5kg','30',79.00,'光泽被毛 增强免疫 含叶酸 补充营养 保护视力','https://img2.epetbar.com/common/upload/commonfile/2020/08/20/170153_736999.jpg',NULL,NULL,1,'比乐'),(3,1,1,'麦富迪 多种营养平衡中大型犬成犬粮 15kg','100',229.00,'升级装 牛肉+鱼肉+蛋黄+蔬果 多种食材 营养均衡 强健体魄','https://img2.epetbar.com/common/upload/commonfile/2020/011/25/112030_180837.jpg',NULL,NULL,1,'比乐'),(4,5,1,'狗狗磨牙组合玩具 磨牙洁齿 预防撕家 发声解闷','80',19.90,'解闷神器 防止拆家 磨牙洁齿 经典不掉队 实心高弹力球 巡回训练','https://img2.epetbar.com/common/upload/commonfile/2020/04/08/194331_291579.jpg',NULL,NULL,1,'比乐'),(5,4,NULL,'鸡肉罐头','80',105.00,'顽皮Wanpy 鸡肉+蔬菜配方 狗罐头 375g *24罐','https://img2.epetbar.com/nowater/2020-12/21/14/b645c25f0e87230600f94828a9383edd.jpg','2020-12-14 21:33:07','2020-12-14 21:33:07',1,NULL),(7,4,NULL,'牛肉粒','100',29.90,'麦富迪 北美原野系列菲力牛肉狗零食 360g/袋','https://img2.epetbar.com/2018-10/17/10/65c60607c00127ac7f7f01b7506701f4.jpg','2020-12-14 21:50:48','2020-12-14 21:50:48',NULL,NULL),(8,6,NULL,'体内驱虫药','22',16.00,'恩倍多 犬用体内驱虫药 吡喹酮片 100mg*1片','https://img2.epetbar.com/common/upload/commonfile/2020/12/18/143847_152794.jpg','2020-12-14 22:05:58','2020-12-14 22:05:58',NULL,NULL),(9,2,NULL,'尼龙牵引绳','10',18.00,'优莱仕 L号红色尼龙织带狗牵引绳 绳宽2.5cm/长135cm','https://img2.epetbar.com/common/upload/commonfile/2020/05/20/183415_718508.jpg',NULL,NULL,1,NULL);
/*!40000 ALTER TABLE `tb_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `mobile` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `icon` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','123456','13918891675','mmc@163.com','男','管理员','https://gd4.alicdn.com/imgextra/i1/3209047371/O1CN01TY6JTM24Jy2J6WkyO_!!3209047371.jpg_400x400.jpg'),(2,'lisi2','123456','13918891675','mmc@163.com','m','lisi1',NULL),(3,'lisi3','123456','13918891675','mmc@163.com','m','lisi1',NULL),(4,'lisi4','123456','13918891675','mmc@163.com','m','lisi1',NULL),(5,'lisi5','123456','13918891675','mmc@163.com','m','lisi1',NULL),(6,'lisi6','123456','13918891675','mmc@163.com','m','lisi1',NULL),(7,'lisi7','123456','13918891675','mmc@163.com','m','lisi1',NULL),(8,'lisi8','123456','13918891675','mmc@163.com','m','lisi1',NULL),(9,'lisi9','123456','13918891675','mmc@163.com','m','lisi1',NULL),(10,'lisi10','123456','13918891675','mmc@163.com','m','lisi1',NULL),(11,'lisi11','123456','13918891675','mmc@163.com','m','lisi1',NULL),(12,'lisi12','123456','13918891675','mmc@163.com','m','lisi1',NULL),(13,'lisi13','123456','13918891675','mmc@163.com','m','lisi1',NULL),(14,'lisi14','123456','13918891675','mmc@163.com','m','lisi1',NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-23 17:32:15
