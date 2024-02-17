-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 22, 2021 at 03:13 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atmsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounttb`
--

DROP TABLE IF EXISTS `accounttb`;
CREATE TABLE IF NOT EXISTS `accounttb` (
  `AccNum` int(11) NOT NULL,
  `AccName` varchar(255) NOT NULL,
  `FaName` varchar(255) NOT NULL,
  `Dob` varchar(255) NOT NULL,
  `Phone` varchar(255) NOT NULL,
  `Address` varchar(255) NOT NULL,
  `Education` varchar(255) NOT NULL,
  `Occupation` varchar(255) NOT NULL,
  `Balance` int(11) NOT NULL,
  `pin` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `transactiontb`
--

DROP TABLE IF EXISTS `transactiontb`;
CREATE TABLE IF NOT EXISTS `transactiontb` (
  `Tid` int(11) NOT NULL,
  `AccNum` int(11) NOT NULL,
  `Type` int(11) NOT NULL,
  `TDate` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
