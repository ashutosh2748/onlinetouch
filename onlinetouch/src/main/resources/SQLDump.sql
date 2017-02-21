-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: cs544
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'South Jakaylaburgh','NorthCarolina','60615 Althea Creek Apt. 367',''),(2,'Lake Arlie','NorthDakota','1105 Roberto Fords Suite 237',''),(3,'Mantemouth','District of Columbia','701 Ara Fort',''),(4,'East Brady','Minnesota','511 Tillman Mountains',''),(5,'Cassandramouth','Maine','51851 Marquardt Run Apt. 111',''),(6,'West Felixfurt','Ohio','10815 Osinski Route',''),(7,'Natashaberg','Maryland','2686 Jarred Trail Suite 867',''),(8,'New Tanya','Oregon','8298 Witting Freeway Suite 425',''),(9,'Goodwinfort','Kansas','7229 Koss Extensions',''),(10,'East Victoriaside','Wyoming','509 Becker Mountain Suite 380',''),(11,'Crystelton','Mississippi','8045 Kertzmann Land Suite 082',''),(12,'Nadertown','Florida','3150 Colleen Fall',''),(13,'Skilesborough','Wisconsin','1316 Armstrong Manor Suite 830',''),(14,'Ritabury','District of Columbia','684 Stark Cape Apt. 622',''),(15,'Everardomouth','Delaware','63496 Owen Well Suite 865',''),(16,'Krisstad','WestVirginia','3612 Alexanne Trail Apt. 319',''),(17,'Jasperstad','Arkansas','4128 Vance Street Suite 669',''),(18,'New Weldon','Texas','0587 Janick Terrace Apt. 892',''),(19,'Kerlukeburgh','Kansas','9336 Rosenbaum Mill',''),(20,'Hodkiewiczbury','Arkansas','438 Corine Lake Apt. 002','');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `bank`
--

LOCK TABLES `bank` WRITE;
/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `brand`
--

LOCK TABLES `brand` WRITE;
/*!40000 ALTER TABLE `brand` DISABLE KEYS */;
/*!40000 ALTER TABLE `brand` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `card`
--

LOCK TABLES `card` WRITE;
/*!40000 ALTER TABLE `card` DISABLE KEYS */;
/*!40000 ALTER TABLE `card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES ('CompositeCategory',1,'','tenetur',1),('CategoryLeaf',2,'\0','tempora',1),('CompositeCategory',3,'\0','dolores',2),('CategoryLeaf',4,'\0','similique',2),('CompositeCategory',5,'','veritatis',3),('CompositeCategory',6,'\0','rem',4),('CompositeCategory',7,'','et',4),('CompositeCategory',8,'','a',5),('CategoryLeaf',9,'\0','temporibus',6),('CompositeCategory',10,'','molestiae',5),('CategoryLeaf',11,'','sit',4),('CompositeCategory',12,'\0','dolorem',3),('CompositeCategory',13,'','non',5),('CategoryLeaf',14,'\0','ex',7),('CompositeCategory',15,'\0','amet',8),('CategoryLeaf',16,'','ipsum',9),('CompositeCategory',17,'\0','velit',7),('CompositeCategory',18,'','quod',6),('CategoryLeaf',19,'','reiciendis',4),('CategoryLeaf',20,'','aut',3);
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `childcategories`
--

LOCK TABLES `childcategories` WRITE;
/*!40000 ALTER TABLE `childcategories` DISABLE KEYS */;
INSERT INTO `childcategories` VALUES (1,2),(1,3),(3,4),(3,5),(3,6);
/*!40000 ALTER TABLE `childcategories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `credit_card`
--

LOCK TABLES `credit_card` WRITE;
/*!40000 ALTER TABLE `credit_card` DISABLE KEYS */;
/*!40000 ALTER TABLE `credit_card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `customer_payment_methods`
--

LOCK TABLES `customer_payment_methods` WRITE;
/*!40000 ALTER TABLE `customer_payment_methods` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_payment_methods` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `customer_shipping_address`
--

LOCK TABLES `customer_shipping_address` WRITE;
/*!40000 ALTER TABLE `customer_shipping_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_shipping_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `cutomer_order`
--

LOCK TABLES `cutomer_order` WRITE;
/*!40000 ALTER TABLE `cutomer_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `cutomer_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `debit_card`
--

LOCK TABLES `debit_card` WRITE;
/*!40000 ALTER TABLE `debit_card` DISABLE KEYS */;
/*!40000 ALTER TABLE `debit_card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `inventory_manager`
--

LOCK TABLES `inventory_manager` WRITE;
/*!40000 ALTER TABLE `inventory_manager` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventory_manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `order_line`
--

LOCK TABLES `order_line` WRITE;
/*!40000 ALTER TABLE `order_line` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_line` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `payment_method`
--

LOCK TABLES `payment_method` WRITE;
/*!40000 ALTER TABLE `payment_method` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment_method` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `shipping_info`
--

LOCK TABLES `shipping_info` WRITE;
/*!40000 ALTER TABLE `shipping_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `shipping_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `shopping_cart`
--

LOCK TABLES `shopping_cart` WRITE;
/*!40000 ALTER TABLE `shopping_cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `shopping_cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ware_house`
--

LOCK TABLES `ware_house` WRITE;
/*!40000 ALTER TABLE `ware_house` DISABLE KEYS */;
/*!40000 ALTER TABLE `ware_house` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `ware_house_inventories`
--

LOCK TABLES `ware_house_inventories` WRITE;
/*!40000 ALTER TABLE `ware_house_inventories` DISABLE KEYS */;
/*!40000 ALTER TABLE `ware_house_inventories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `web_user`
--

LOCK TABLES `web_user` WRITE;
/*!40000 ALTER TABLE `web_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `web_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `web_user_roles`
--

LOCK TABLES `web_user_roles` WRITE;
/*!40000 ALTER TABLE `web_user_roles` DISABLE KEYS */;
/*!40000 ALTER TABLE `web_user_roles` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-20 22:47:41
