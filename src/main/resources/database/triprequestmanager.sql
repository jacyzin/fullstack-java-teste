-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: triprequestmanager
-- ------------------------------------------------------
-- Server version	5.7.21-log

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
-- Table structure for table `aereo`
--

DROP TABLE IF EXISTS `aereo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aereo` (
  `id_aereo` int(11) NOT NULL,
  `cia_menor_tarifa` varchar(100) DEFAULT NULL,
  `codigo_fornecedor` varchar(15) DEFAULT NULL,
  `data_reserva` datetime DEFAULT NULL,
  `data_vencimento` datetime DEFAULT NULL,
  `localizador` varchar(15) DEFAULT NULL,
  `localizador_gds` bit(1) DEFAULT NULL,
  `maior_tarifa` double DEFAULT NULL,
  `menor_tarifa` double DEFAULT NULL,
  `nome_reservador` varchar(100) DEFAULT NULL,
  `source` varchar(15) DEFAULT NULL,
  `solicitacao_viagem_id` int(11) NOT NULL,
  PRIMARY KEY (`id_aereo`),
  KEY `FKer1tiu62ub1srdt5ys9t0ifkb` (`solicitacao_viagem_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `aereo_seguimento`
--

DROP TABLE IF EXISTS `aereo_seguimento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aereo_seguimento` (
  `id_aereo_seguimento` int(11) NOT NULL,
  `cidade_destino` varchar(150) DEFAULT NULL,
  `cidade_origem` varchar(150) DEFAULT NULL,
  `data_chegada` datetime DEFAULT NULL,
  `data_saida` datetime DEFAULT NULL,
  `destino` varchar(10) DEFAULT NULL,
  `localizador_cia` varchar(50) DEFAULT NULL,
  `milhas` double DEFAULT NULL,
  `origem` varchar(10) DEFAULT NULL,
  `pais_destino` varchar(2) DEFAULT NULL,
  `pais_origem` varchar(2) DEFAULT NULL,
  `seguimento_cancelado` bit(1) DEFAULT NULL,
  `aereo_id` int(11) NOT NULL,
  PRIMARY KEY (`id_aereo_seguimento`),
  KEY `FKkslcjtwmo86u5hhon6ldvyg3` (`aereo_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `passageiro`
--

DROP TABLE IF EXISTS `passageiro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `passageiro` (
  `id_passageiro` int(11) NOT NULL,
  `acompanhante` bit(1) DEFAULT NULL,
  `cargo` varchar(50) DEFAULT NULL,
  `celular` varchar(15) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `data_nascimento` datetime DEFAULT NULL,
  `ddd_cel` varchar(2) DEFAULT NULL,
  `ddd_telefone` varchar(2) DEFAULT NULL,
  `departamento` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `empresa` varchar(50) DEFAULT NULL,
  `matricula` varchar(50) DEFAULT NULL,
  `nome` varchar(20) DEFAULT NULL,
  `nome_completo` varchar(150) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `sobrenome` varchar(100) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `terceiro` bit(1) DEFAULT NULL,
  `tipo_documento` varchar(30) DEFAULT NULL,
  `tipo_registro` varchar(50) DEFAULT NULL,
  `valor_documento` varchar(50) DEFAULT NULL,
  `vip` bit(1) DEFAULT NULL,
  `solicitacao_viagem_id` int(11) NOT NULL,
  PRIMARY KEY (`id_passageiro`),
  KEY `FKse4ho0nvamwcgv4wgsjowcl7l` (`solicitacao_viagem_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `solicitacao_viagem`
--

DROP TABLE IF EXISTS `solicitacao_viagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `solicitacao_viagem` (
  `id_solicitacao_viagem` int(11) NOT NULL,
  `resultado_consulta_ws` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id_solicitacao_viagem`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-02 10:48:54
