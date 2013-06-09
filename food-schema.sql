-- MySQL dump 10.13  Distrib 5.5.31, for debian-linux-gnu (i686)
--
-- Host: localhost    Database: food
-- ------------------------------------------------------
-- Server version	5.5.31-0ubuntu0.12.10.1

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
-- Table structure for table `Flavor`
--

DROP TABLE IF EXISTS `Flavor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Flavor` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `depict` varchar(100) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Indent`
--

DROP TABLE IF EXISTS `Indent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Indent` (
  `iid` int(11) NOT NULL AUTO_INCREMENT,
  `order_time` bigint(20) NOT NULL,
  `uid` varchar(20) NOT NULL,
  PRIMARY KEY (`iid`),
  KEY `FK82CEDCCCD15F7835` (`uid`),
  CONSTRAINT `FK82CEDCCCD15F7835` FOREIGN KEY (`uid`) REFERENCES `User` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Menu`
--

DROP TABLE IF EXISTS `Menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Menu` (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `depict` varchar(100) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `picture` varchar(50) DEFAULT NULL,
  `price` float NOT NULL,
  `rid` int(11) NOT NULL,
  PRIMARY KEY (`mid`),
  KEY `FK24897FB0AED0E4` (`rid`),
  CONSTRAINT `FK24897FB0AED0E4` FOREIGN KEY (`rid`) REFERENCES `Restaurant` (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Restaurant`
--

DROP TABLE IF EXISTS `Restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Restaurant` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(50) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `phone` varchar(15) NOT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `uid` varchar(20) NOT NULL,
  `activated` int(1) NOT NULL,
  `last_login` bigint(20) NOT NULL,
  `online` int(1) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `menu_flavor_list`
--

DROP TABLE IF EXISTS `menu_flavor_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu_flavor_list` (
  `flid` int(11) NOT NULL AUTO_INCREMENT,
  `isMenu` int(11) DEFAULT NULL,
  `fid` int(11) DEFAULT NULL,
  `mid` int(11) DEFAULT NULL,
  PRIMARY KEY (`flid`),
  KEY `FK92649EBFD6C4D039` (`fid`),
  KEY `FK92649EBFD15B83C1` (`mid`),
  CONSTRAINT `FK92649EBFD15B83C1` FOREIGN KEY (`mid`) REFERENCES `Menu` (`mid`),
  CONSTRAINT `FK92649EBFD6C4D039` FOREIGN KEY (`fid`) REFERENCES `Flavor` (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `order_log`
--

DROP TABLE IF EXISTS `order_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order_log` (
  `olid` int(11) NOT NULL AUTO_INCREMENT,
  `quality` int(11) NOT NULL,
  `iid` int(11) NOT NULL,
  `mid` int(11) NOT NULL,
  `rid` int(11) NOT NULL,
  `quantity` int(4) NOT NULL,
  `subtotal` int(4) NOT NULL,
  `speed` int(1) NOT NULL,
  PRIMARY KEY (`olid`),
  KEY `FKE8AE02D3DC00B18A` (`iid`),
  KEY `FKE8AE02D3B0AED0E4` (`rid`),
  KEY `FKE8AE02D3D15B83C1` (`mid`),
  CONSTRAINT `FKE8AE02D3B0AED0E4` FOREIGN KEY (`rid`) REFERENCES `Restaurant` (`rid`),
  CONSTRAINT `FKE8AE02D3D15B83C1` FOREIGN KEY (`mid`) REFERENCES `Menu` (`mid`),
  CONSTRAINT `FKE8AE02D3DC00B18A` FOREIGN KEY (`iid`) REFERENCES `Indent` (`iid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user_flavor_list`
--

DROP TABLE IF EXISTS `user_flavor_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_flavor_list` (
  `uflid` int(11) NOT NULL AUTO_INCREMENT,
  `fid` int(11) DEFAULT NULL,
  `uid` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`uflid`),
  KEY `FKCC9E332BD15F7835` (`uid`),
  KEY `FKCC9E332BD6C4D039` (`fid`),
  CONSTRAINT `FKCC9E332BD15F7835` FOREIGN KEY (`uid`) REFERENCES `User` (`uid`),
  CONSTRAINT `FKCC9E332BD6C4D039` FOREIGN KEY (`fid`) REFERENCES `Flavor` (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-06-09 18:42:52
