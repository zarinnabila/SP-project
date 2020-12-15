-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 14, 2020 at 03:10 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurant_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `NAME` varchar(20) DEFAULT NULL,
  `ID` varchar(25) DEFAULT NULL,
  `SECTION` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`NAME`, `ID`, `SECTION`) VALUES
('ZARIN TASNIM NABILA', '192-15-13054', 'O4'),
('NOSHIN TABASSUM', '192-15-13204', 'O4'),
('SUMAIYA AKTER', '192-15-13188', 'O4');

-- --------------------------------------------------------

--
-- Table structure for table `food`
--

CREATE TABLE `food` (
  `ID` int(11) NOT NULL,
  `FOOD_TYPE` varchar(15) DEFAULT NULL,
  `FOOD_NAME` varchar(20) DEFAULT NULL,
  `FOOD_PORTION` varchar(10) DEFAULT NULL,
  `FOOD_PRICE` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `food`
--

INSERT INTO `food` (`ID`, `FOOD_TYPE`, `FOOD_NAME`, `FOOD_PORTION`, `FOOD_PRICE`) VALUES
(1, 'DESSERT', 'CUP CAKE', '4', 100),
(2, 'DRINKS', 'LACCHI', '1', 60),
(3, 'MAIN COURSE', 'FRIED RICE', '1:4', 300),
(5, 'DRINKS', 'PEPSI', '1', 20);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `food`
--
ALTER TABLE `food`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `food`
--
ALTER TABLE `food`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
