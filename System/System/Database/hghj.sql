-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 02, 2018 at 10:38 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `schoolmsdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE IF NOT EXISTS `admin` (
  `a_id` varchar(10) NOT NULL,
  `name` varchar(25) NOT NULL,
  `address` varchar(50) NOT NULL,
  `tp` varchar(12) NOT NULL,
  `uname` varchar(10) NOT NULL,
  `pword` varchar(10) NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`a_id`, `name`, `address`, `tp`, `uname`, `pword`) VALUES
('001', 'Admin', 'Admin_location', '000-0000000', 'adm', 'adm');

-- --------------------------------------------------------

--
-- Table structure for table `altt`
--

DROP TABLE IF EXISTS `altt`;
CREATE TABLE IF NOT EXISTS `altt` (
  `s_id` varchar(10) NOT NULL,
  `year` int(4) NOT NULL,
  `semester` varchar(10) NOT NULL,
  `avg` float NOT NULL,
  `place` int(3) NOT NULL,
  `sub_i` int(3) NOT NULL,
  `sub_ii` int(3) NOT NULL,
  `sub_iii` int(3) NOT NULL,
  `english` int(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

DROP TABLE IF EXISTS `class`;
CREATE TABLE IF NOT EXISTS `class` (
  `class_id` varchar(10) NOT NULL,
  `class_name` varchar(10) NOT NULL,
  `stu_no` int(3) NOT NULL,
  `cls_catagory` varchar(10) NOT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gceal`
--

DROP TABLE IF EXISTS `gceal`;
CREATE TABLE IF NOT EXISTS `gceal` (
  `s_id` varchar(10) NOT NULL,
  `indexno` varchar(10) NOT NULL,
  `year` int(4) NOT NULL,
  `rank` int(5) NOT NULL,
  `z_score` float NOT NULL,
  `sub_i` varchar(3) NOT NULL,
  `sub_ii` varchar(3) NOT NULL,
  `sub_iii` varchar(3) NOT NULL,
  `english` varchar(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gceol`
--

DROP TABLE IF EXISTS `gceol`;
CREATE TABLE IF NOT EXISTS `gceol` (
  `s_id` varchar(10) NOT NULL,
  `indexno` varchar(10) NOT NULL,
  `year` int(4) NOT NULL,
  `maths` varchar(3) NOT NULL,
  `science` varchar(3) NOT NULL,
  `english` varchar(3) NOT NULL,
  `sinhala` varchar(3) NOT NULL,
  `religon` varchar(3) NOT NULL,
  `history` varchar(3) NOT NULL,
  `g_i` varchar(3) NOT NULL,
  `g_ii` varchar(3) NOT NULL,
  `g_iii` varchar(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `grade_five_gov`
--

DROP TABLE IF EXISTS `grade_five_gov`;
CREATE TABLE IF NOT EXISTS `grade_five_gov` (
  `s_id` varchar(10) NOT NULL,
  `indexno` int(10) NOT NULL,
  `year` int(4) NOT NULL,
  `marks` int(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `nap`
--

DROP TABLE IF EXISTS `nap`;
CREATE TABLE IF NOT EXISTS `nap` (
  `n_id` varchar(10) NOT NULL,
  `f_name` varchar(25) NOT NULL,
  `l_name` varchar(25) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `age` int(3) NOT NULL,
  `dob` varchar(12) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `tp` varchar(12) NOT NULL,
  `address` varchar(100) NOT NULL,
  `marage` varchar(10) NOT NULL,
  `ac_no` varchar(15) NOT NULL,
  `bank` varchar(20) NOT NULL,
  `post` varchar(20) NOT NULL,
  `nic` varchar(15) NOT NULL,
  PRIMARY KEY (`n_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `oltt`
--

DROP TABLE IF EXISTS `oltt`;
CREATE TABLE IF NOT EXISTS `oltt` (
  `s_id` varchar(10) NOT NULL,
  `year` int(4) NOT NULL,
  `semester` varchar(10) NOT NULL,
  `avg` float NOT NULL,
  `place` int(3) NOT NULL,
  `maths` int(3) NOT NULL,
  `science` int(3) NOT NULL,
  `english` int(3) NOT NULL,
  `sinhala` int(3) NOT NULL,
  `religon` int(3) NOT NULL,
  `history` int(3) NOT NULL,
  `g_i` int(3) NOT NULL,
  `g_ii` int(3) NOT NULL,
  `g_iii` int(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `primarytt`
--

DROP TABLE IF EXISTS `primarytt`;
CREATE TABLE IF NOT EXISTS `primarytt` (
  `s_id` varchar(10) NOT NULL,
  `year` int(4) NOT NULL,
  `semester` varchar(5) NOT NULL,
  `avg` float NOT NULL,
  `place` int(3) NOT NULL,
  `maths` int(3) NOT NULL,
  `sinhala` int(3) NOT NULL,
  `english` int(3) NOT NULL,
  `enviranment` int(3) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `s_id` varchar(5) NOT NULL,
  `f_name` varchar(10) NOT NULL,
  `l_name` varchar(10) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `tp` varchar(12) NOT NULL,
  `age` int(3) NOT NULL,
  `dob` varchar(12) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `o_name` varchar(25) NOT NULL,
  `o_address` varchar(50) NOT NULL,
  `o_tp` varchar(12) NOT NULL,
  `category` varchar(10) NOT NULL,
  `class` varchar(10) NOT NULL,
  `class_teacher` varchar(50) NOT NULL,
  `file_no` varchar(10) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher` (
  `t_id` varchar(10) NOT NULL,
  `f_name` varchar(20) NOT NULL,
  `l_name` varchar(20) NOT NULL,
  `full_name` varchar(50) NOT NULL,
  `age` int(3) NOT NULL,
  `dob` varchar(15) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `tp` varchar(15) NOT NULL,
  `address` varchar(50) NOT NULL,
  `marage` varchar(10) NOT NULL,
  `ac_no` varchar(20) NOT NULL,
  `bank` varchar(20) NOT NULL,
  `subject` varchar(20) NOT NULL,
  `nic` varchar(20) NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
