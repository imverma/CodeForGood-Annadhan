-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 22, 2018 at 02:45 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 7.2.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `annadhan`
--

-- --------------------------------------------------------

--
-- Table structure for table `active_drive_table`
--

CREATE TABLE `active_drive_table` (
  `Drive_id` varchar(20) NOT NULL,
  `No_Of_Volunteers_required` int(5) NOT NULL,
  `No_of_Volunteers_Accepted` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `active_drive_table`
--

INSERT INTO `active_drive_table` (`Drive_id`, `No_Of_Volunteers_required`, `No_of_Volunteers_Accepted`) VALUES
('fgf', 5, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `active_drive_table`
--
ALTER TABLE `active_drive_table`
  ADD KEY `Drive_id` (`Drive_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `active_drive_table`
--
ALTER TABLE `active_drive_table`
  ADD CONSTRAINT `active_drive_table_ibfk_1` FOREIGN KEY (`Drive_id`) REFERENCES `fdt` (`Drive_id`),
  ADD CONSTRAINT `active_drive_table_ibfk_2` FOREIGN KEY (`Drive_id`) REFERENCES `fdt` (`Drive_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
