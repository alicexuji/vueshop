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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_brand`
--

LOCK TABLES `tb_brand` WRITE;
/*!40000 ALTER TABLE `tb_brand` DISABLE KEYS */;
INSERT INTO `tb_brand` VALUES (1,'比乐','狗粮',1,NULL,NULL),(2,'宝路','狗粮',1,NULL,NULL),(3,'petmaster','狗粮',1,NULL,NULL),(4,'麦富迪','狗粮',1,NULL,NULL),(5,'恩倍多','驱虫药',1,NULL,NULL),(6,'优莱仕','牵引绳',1,NULL,NULL),(7,'Flexi福莱希','牵引绳',1,NULL,NULL),(8,'Gemon','零食',1,NULL,NULL),(9,'福来恩','驱虫药',1,NULL,NULL),(10,'拜耳','驱虫药',1,NULL,NULL);
/*!40000 ALTER TABLE `tb_brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_cart`
--

DROP TABLE IF EXISTS `tb_cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_cart` (
  `count` int DEFAULT NULL,
  `goodsId` int DEFAULT NULL,
  `goods_name` varchar(255) DEFAULT NULL,
  `goods_picurl` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  `price` decimal(10,0) DEFAULT NULL,
  `checked` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cart`
--

LOCK TABLES `tb_cart` WRITE;
/*!40000 ALTER TABLE `tb_cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_cart` ENABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_order`
--

LOCK TABLES `tb_order` WRITE;
/*!40000 ALTER TABLE `tb_order` DISABLE KEYS */;
INSERT INTO `tb_order` VALUES (1,'202012152030151601','jack',0,1,'ayumi888','2020-12-15 22:33:27',NULL,200,'2020-11-14 18:22:19','2020-11-15 18:10:45','2020-11-15 23:21:58','jack','13817878722','上海市浦东新区陆家嘴1号',NULL,NULL),(2,'202012152030151604','rose',2,2,'tb666','2020-09-20 13:26:30',NULL,81,'2020-07-15 23:22:32','2020-07-16 17:17:59','2020-07-17 17:14:05','lily','18989898899','上海市黄浦区愚园路30号','圆通快递','65432345'),(16,'1608899813300','张华',NULL,NULL,'Lily','2020-12-25 20:36:53',NULL,184,NULL,NULL,NULL,'张华','18989898899','上海市浦东新区陆家嘴1号',NULL,NULL);
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
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_product`
--

LOCK TABLES `tb_product` WRITE;
/*!40000 ALTER TABLE `tb_product` DISABLE KEYS */;
INSERT INTO `tb_product` VALUES (1,1,1,'比乐狗粮中大型犬成犬','5000',500.00,'中大型犬成犬粮10kg','https://img.alicdn.com/imgextra/i1/2206345553294/O1CN01Y0X8Kg1aChHMLrAM1_!!2206345553294.jpg_430x430q90.jpg','2020-12-14 21:33:07','2020-12-14 21:33:07',1,'比乐'),(2,1,3,'PetMaster 深海鱼鸡肉味全犬种成犬粮 1.5kg','30',79.00,'光泽被毛 增强免疫 含叶酸 补充营养 保护视力','https://img2.epetbar.com/common/upload/commonfile/2020/08/20/170153_736999.jpg','2020-12-14 21:33:07','2020-12-14 21:33:07',1,'PetMaster'),(3,1,4,'麦富迪 多种营养平衡中大型犬成犬粮 15kg','100',229.00,'升级装 牛肉+鱼肉+蛋黄+蔬果 多种食材 营养均衡 强健体魄','https://img2.epetbar.com/common/upload/commonfile/2020/011/25/112030_180837.jpg','2020-12-14 21:33:07','2020-12-14 21:33:07',1,'麦富迪'),(4,5,1,'狗狗磨牙组合玩具 磨牙洁齿 预防撕家 发声解闷','80',19.90,'解闷神器 防止拆家 磨牙洁齿 经典不掉队 实心高弹力球 巡回训练','https://img2.epetbar.com/common/upload/commonfile/2020/04/08/194331_291579.jpg','2020-12-14 21:33:07','2020-12-14 21:33:07',1,''),(5,4,NULL,'鸡肉罐头','80',105.00,'顽皮Wanpy 鸡肉+蔬菜配方 狗罐头 375g *24罐','https://img2.epetbar.com/nowater/2020-12/21/14/b645c25f0e87230600f94828a9383edd.jpg','2020-12-14 21:33:07','2020-12-14 21:33:07',1,NULL),(7,4,4,'牛肉粒','100',29.90,'北美原野系列菲力牛肉狗零食 360g/袋','https://img2.epetbar.com/2018-10/17/10/65c60607c00127ac7f7f01b7506701f4.jpg','2020-12-14 21:50:48','2020-12-14 21:50:48',1,'麦富迪'),(8,6,5,'体内驱虫药','22',16.00,'犬用体内驱虫药 吡喹酮片 100mg*1片','https://img2.epetbar.com/common/upload/commonfile/2020/12/18/143847_152794.jpg','2020-12-14 22:05:58','2020-12-14 22:05:58',1,'恩倍多'),(9,2,6,'尼龙牵引绳','10',18.00,'L号红色尼龙织带狗牵引绳 绳宽2.5cm/长135cm','https://img2.epetbar.com/common/upload/commonfile/2020/05/20/183415_718508.jpg','2020-12-14 21:33:07','2020-12-14 21:33:07',1,'优莱仕'),(10,3,NULL,'嬉皮狗hipidog M号毛球围巾卫衣 适合5-8斤体重','68',35.00,'胸围42cm、背长30cm 抓绒面料 冬日保暖','https://img2.epetbar.com/common/upload/commonfile/2020/011/12/0103635_310577.jpg','2020-12-25 19:04:04','2020-12-25 19:04:04',1,NULL),(11,3,NULL,'宠物带帽蝴蝶结波点雨衣','33',40.00,'四脚连帽雨衣 松紧脚口 防水效果好','https://img2.epetbar.com/2015-06/12/33394c53d64af779ec3e6e011ca836c2.jpg','2020-12-25 19:04:04','2020-12-25 19:04:04',1,NULL),(12,3,NULL,'宝宝猪连体衣553米白S','76',37.00,'萌萌猪猪造型 毛绒绒超可爱','https://img2.epetbar.com/2018-09/29/13/3f3e9fad7db297345cf67dd5b7fdd1db.jpg@!200w-c','2020-12-25 19:04:04','2020-12-25 19:04:04',1,NULL),(13,3,NULL,'Touchdog 犬专用渐变针织毛衣 暗黑色 S号','56',132.60,'渐变花纹 针织毛线 柔软细腻','https://img2.epetbar.com/goods/sales/20190917142859_244844.jpg','2020-12-25 19:04:04','2020-12-25 19:04:04',1,NULL),(14,2,7,'火星人波点系列 伸缩牵引绳 带状粉色 M号5m/25kg','21',102.90,'锥形回收槽 防止牵绳缠结 可搭配LED发光系统和多功能盒 镀铬挂钩','https://img2.epetbar.com/2018-03/23/17/417456ab8e478c5fae5e0bc7c4d865bd.jpg','2020-12-25 19:04:04','2020-12-25 19:04:04',1,'Flexi福莱希'),(15,2,6,'S号烈焰红A型可调节SBR胸背套装 调节范围30-50cm','65',26.90,'标准绳长120cm，绳宽1.5cm 发泡拉带吸汗防滑防爆冲 尼龙织带结实耐用','https://img2.epetbar.com/common/upload/commonfile/2020/05/21/0104945_14230.jpg@!200w-c','2020-12-25 19:04:04','2020-12-25 19:04:04',1,'优莱仕'),(16,2,7,'外星人系列 伸缩牵引带 带状L号','12',262.00,'8米带状 可承重50kg以内宠物 蓝色','https://img2.epetbar.com/2017-07/22/19/5f87f0e45f29e3d2125eedc0648bd18c.jpg@!200w-c','2020-12-25 19:04:04','2020-12-25 19:04:04',1,'Flexi福莱希'),(17,4,8,'意大利原装进口Gemon 极萌湿粮系列 羊肉味狗罐头 400g','80',105.00,'成年犬专享 羊肉具有健脾养肝作用 适口性佳','https://img2.epetbar.com/common/upload/commonfile/2020/01/13/152603_498093.jpg@!200w-c','2020-12-14 21:33:07','2020-12-14 21:33:07',1,'Gemon'),(18,4,NULL,'自然香酥带肉牛棒骨 L号','88',18.90,'甄选内蒙肥牛 磨牙/洁齿/补充营养 盒装与简装（无纸盒）随机发 建议6月以上狗狗食用','https://img2.epetbar.com/nowater/2020-12/21/14/184efcf2f1ce33c3ff207ae4446e608d.jpg@!200w-c','2020-12-14 21:33:07','2020-12-14 21:33:07',1,''),(19,4,4,'麦富迪 狗狗零食 清口香系列 清口香奶棒 220g','101',12.90,'清洁口腔 清新口气 五星设计易咬合 耐磨耐咬 易消化','https://img2.epetbar.com/nowater/2020-12/21/14/27d3d48b00c6102ec9e30e37c5daf45e.jpg@!200w-c','2020-12-14 21:33:07','2020-12-14 21:33:07',1,'麦富迪'),(20,5,NULL,'【发声棉绒 亲肤触感】Fukufuku 小象棉绒玩具 24cm','80',15.90,'柔软棉绒 亲肤不伤爪 四季可玩','https://img2.epetbar.com/common/upload/commonfile/2020/09/15/181457_162698.jpg@!200w-c','2020-12-14 21:33:07','2020-12-14 21:33:07',1,''),(21,5,NULL,'经典益智系列 S号不发声蓝色网球狗玩具 1只装','220',4.90,'美国益智玩具/安全材质','https://img2.epetbar.com/common/upload/commonfile/2020/05/28/183827_138235.jpg@!200w-c','2020-12-14 21:33:07','2020-12-14 21:33:07',1,''),(22,5,NULL,'宠物绳球玩具 球直径约6cm','333',3.90,'健康棉绳 洁齿耐咬 拉绳设计 互动逗趣','https://img2.epetbar.com/goods/sales/20190528140825_521143.jpg@!200w-c','2020-12-14 21:33:07','2020-12-14 21:33:07',1,''),(23,6,9,'福来恩 第二代犬滴剂 8周以上 小型 体重10KG以下 单支装','46',52.00,'梅里亚出品 有效驱除跳蚤/蜱虫 对虫卵/幼虫均有效','https://img2.epetbar.com/common/upload/commonfile/2020/12/25/134744_589422.jpg@!200w-c','2020-12-14 22:05:58','2020-12-14 22:05:58',1,'福来恩'),(24,6,9,'福来恩 8周以上 中型 体重10-20KG 3支/盒','61',149.00,'体外驱虫药 驱虫 跳蚤/蜱虫 杀虫卵/幼虫','https://img2.epetbar.com/common/upload/commonfile/2020/12/25/134657_428537.jpg@!200w-c','2020-12-14 22:05:58','2020-12-14 22:05:58',1,'福来恩'),(25,6,10,'拜耳Bayer 拜宠爽犬用体外驱虫滴剂 25-50kg 4ml/支','29',69.00,'适用于体重25-50kg犬只 预防蜱、蚤、虱 抑制白蛉、厩蝇、蚊子叮咬','https://img2.epetbar.com/common/upload/commonfile/2020/12/18/150816_89531.jpg@!200w-c','2020-12-14 22:05:58','2020-12-14 22:05:58',1,'拜耳');
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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','123456','13918891675','mmc@163.com','男','管理员','https://gd4.alicdn.com/imgextra/i1/3209047371/O1CN01TY6JTM24Jy2J6WkyO_!!3209047371.jpg_400x400.jpg'),(15,'sara','123456',NULL,NULL,NULL,NULL,NULL),(16,'Lily','123456',NULL,NULL,NULL,NULL,NULL);
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

-- Dump completed on 2020-12-25 20:46:06
