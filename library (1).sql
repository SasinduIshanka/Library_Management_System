-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2021 at 07:31 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `BookID` varchar(20) NOT NULL,
  `studentID` varchar(20) NOT NULL,
  `issuedate` text NOT NULL,
  `duedate` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`BookID`, `studentID`, `issuedate`, `duedate`) VALUES
('15', '45', 'Sat Aug 14 15:56:16 IST 2021', 'Sat Aug 14 15:56:18 IST 2021');

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

CREATE TABLE `issuebook` (
  `BookID` varchar(20) NOT NULL,
  `studentID` varchar(20) NOT NULL,
  `issuedate` text NOT NULL,
  `duedate` text NOT NULL,
  `returnbook` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `newbook`
--

CREATE TABLE `newbook` (
  `BookID` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` varchar(20) NOT NULL,
  `Publisher` varchar(20) NOT NULL,
  `year` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `newbook`
--

INSERT INTO `newbook` (`BookID`, `name`, `price`, `Publisher`, `year`) VALUES
('12', 'madol', '450', 'mr', '200'),
('14', 'kml', '456', 'kml', '2020'),
('15', 'civil', '450', 'mr', '2004'),
('ggg', 'ggg', 'hyh', 'hh', 'jj');

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `Fn` varchar(200) NOT NULL,
  `Ln` varchar(200) NOT NULL,
  `Un` varchar(200) NOT NULL,
  `pwd` varchar(200) NOT NULL,
  `mail` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`Fn`, `Ln`, `Un`, `pwd`, `mail`) VALUES
('kp', 'kp', 'kp', '0000', 'kp@gmail.com'),
('kh', 'kh', 'kh', '1234', 'kh@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentID` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `parentName` varchar(20) NOT NULL,
  `CourseName` varchar(20) NOT NULL,
  `BranchName` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentID`, `name`, `parentName`, `CourseName`, `BranchName`) VALUES
('1', 'jn', 'j', 'B.Tech', 'DCSD'),
('12', 'kamal', 'father', 'B.Tech', 'DCSD'),
('13', 'jeff', 'mr', 'B.Tech', 'DCSD'),
('14', 'shashee', 'chuty', 'B.Tech', 'DSE'),
('15', 'shashee', 'sa', 'B.Tech', 'DCSD'),
('45', 'sumane', 'fg', 'B.Tech', 'DCSD');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `issuebook`
--
ALTER TABLE `issuebook`
  ADD PRIMARY KEY (`BookID`),
  ADD KEY `test` (`studentID`);

--
-- Indexes for table `newbook`
--
ALTER TABLE `newbook`
  ADD PRIMARY KEY (`BookID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `issuebook`
--
ALTER TABLE `issuebook`
  ADD CONSTRAINT `test` FOREIGN KEY (`studentID`) REFERENCES `student` (`studentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
