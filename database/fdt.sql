-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 21, 2018 at 07:04 PM
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
-- Table structure for table `fdt`
--

CREATE TABLE `fdt` (
  `No_of_People` varchar(20) NOT NULL,
  `When_cooked` varchar(20) NOT NULL,
  `Description` varchar(20) NOT NULL,
  `Packed_or_not` varchar(20) NOT NULL,
  `Temperature` varchar(20) NOT NULL,
  `Annadhan_id` varchar(20) NOT NULL,
  `Pickup_location` varchar(20) NOT NULL,
  `Status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fdt`
--

INSERT INTO `fdt` (`No_of_People`, `When_cooked`, `Description`, `Packed_or_not`, `Temperature`, `Annadhan_id`, `Pickup_location`, `Status`) VALUES
('rg', 'rge', 'rge', 'ge', 'eg', 'rg', 'rg', 'rg'),
('rg', 'rge', 'rge', 'ge', 'eg', 'rjhjkg', 'rg', 'rg'),
('rg', 'rge', 'rge', 'ge', 'eg', 'rjkg', 'rg', 'rg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fdt`
--
ALTER TABLE `fdt`
  ADD PRIMARY KEY (`Annadhan_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
