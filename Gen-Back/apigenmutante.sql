/*
SQLyog Ultimate v12.4.3 (64 bit)
MySQL - 10.1.26-MariaDB : Database - apigenmutante
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`apigenmutante` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

USE `apigenmutante`;

/*Table structure for table `gen` */

DROP TABLE IF EXISTS `gen`;

CREATE TABLE `gen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adn` tinyblob,
  `es_mutante` bit(1) NOT NULL,
  `individuo` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `esMutante` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `gen` */

insert  into `gen`(`id`,`adn`,`es_mutante`,`individuo`,`esMutante`) values 
(1,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAAt\0AATCAAt\0AACTAAt\0AACATAt\0GTACAAt\0ATACAA','\0','juan','\0'),
(2,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAAt\0AATCAAt\0AACTAAt\0AACATAt\0GTACAAt\0ATACAA','\0','juan','\0'),
(3,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAAt\0AATCAAt\0AACTAAt\0AACATAt\0GTACAAt\0ATACAA','','juan','\0'),
(4,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAAt\0AATCAAt\0AACTAAt\0AACATAt\0GTACAAt\0ATACAA','','pedro','\0'),
(5,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAAt\0AATCAAt\0AACTAAt\0AACATAt\0GTACAAt\0ATACAA','','pedro','\0'),
(6,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAAGTt\0AATCAGTAt\0AAAGCTAAt\0AAGACATAt\0GTAGTCAAt\0ATCGACAAt\0GTAGTCAAt\0ATCGACAA','','maria','\0'),
(7,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAAGTt\0AATCAGTAt\0AAAGCTAAt\0AAGACATAt\0GTAGTCAAt\0ATCGACAAt\0GTAGTCAAt\0ATCGACAA','','maria','\0'),
(8,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAt\0AATCAt\0AAAGCt\0AAGACt\0GTCAA','','maria','\0'),
(9,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CTACAt\0GATCAt\0GTAGCt\0CTGACt\0GTCAG','\0','maria','\0'),
(10,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0ATACAt\0GATCAt\0GTAGCt\0CTGACt\0GTCAG','','marcos','\0'),
(11,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0ATACAt\0GATCAt\0GTAGCt\0CTGACt\0GTCAG','\0','marcos','\0'),
(12,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0ATACAt\0GATCAt\0GTAGCt\0CTGACt\0GTCAG','\0','marcos','\0'),
(13,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0ATACAt\0GATCoAt\0GTAGCt\0CTGACt\0GTCAG','\0','marcos','\0'),
(14,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAAt\0AATCAt\0ATAGCt\0ATGACt\0ATCAG','','marcos','\0'),
(15,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AYAAAt\0AATCAt\0ATAGCt\0ATGACt\0ATCAG','\0','marcos','\0'),
(16,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AYAAAt\0AATCAt\0ATAGCt\0ATGACt\0ATCAG','\0','marcos','\0'),
(17,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0\0','\0','aaaa','\0'),
(18,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0aaaat\0aaaat\0aaaat\0aaaa','\0','aaaa','\0'),
(19,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0aaaat\0aaaat\0aaaat\0aaaa','\0','juanjuan','\0'),
(20,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0AAAAt\0AAAAt\0AAAA','\0','mARTIN','\0'),
(21,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0AAAAt\0AAAAt\0AAAA','\0','mARTINa','\0'),
(22,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0aaaat\0ggggt\0ttttt\0cccc','\0','gente','\0'),
(23,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0aaaa','\0','aaaa','\0'),
(24,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0aaaat\0aaaat\0aaaat\0aaaa','\0','Maria Maria','\0'),
(25,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0AAAAt\0AAAAt\0AAAA','\0','Maria JUAN','\0'),
(26,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0AAAAt\0AAAAt\0AAAA','\0','Maria JUAN','\0'),
(27,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0CCCCt\0AAAAt\0AAAAt\0AAAA','\0','Maria JUAN','\0'),
(28,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0AAAAt\0AAAAt\0AAAA','\0','Maria JUAN','\0'),
(29,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0AAAAt\0AAAAt\0AAAA','\0','Maria JUAN','\0'),
(30,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0AAAAt\0AAAAt\0AAAA','\0','Maria JUAN','\0'),
(31,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0AAAAt\0AAAAt\0AAAA','\0','Maria JUAN','\0'),
(32,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0GGGGt\0TTTTt\0CCCC','\0','Maria JUAN','\0'),
(33,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0GGGGt\0TTTTt\0TTTT','\0','Maria JUAN','\0'),
(34,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0GGGGt\0TTTTt\0TTTT','\0','Maria JUAN','\0'),
(35,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0GGGGt\0TTTTt\0TTTT','','Maria JUAN','\0'),
(36,'¬í\0ur\0[Ljava.lang.String;­ÒVçé{G\0\0xp\0\0\0t\0AAAAt\0GGGGt\0ttttt\0TTTT','\0','Maria JUAN','\0');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
