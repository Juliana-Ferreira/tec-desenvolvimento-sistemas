-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 15, 2022 at 02:03 PM
-- Server version: 5.7.36
-- PHP Version: 8.0.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atividadeag06`
--

-- --------------------------------------------------------

--
-- Table structure for table `alunoconcluinte`
--

CREATE TABLE `alunoconcluinte` (
  `idalunoconcluinte` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `nota1` float NOT NULL,
  `nota2` float NOT NULL,
  `nota3` float NOT NULL,
  `nota4` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alunoconcluinte`
--

INSERT INTO `alunoconcluinte` (`idalunoconcluinte`, `nome`, `nota1`, `nota2`, `nota3`, `nota4`) VALUES
(1, 'Eduarda', 10, 10, 9, 10),
(2, 'Paulo', 10, 9, 8, 9),
(3, 'Igo', 10, 8, 10, 10),
(4, 'Guilherm', 10, 9, 8, 7),
(5, 'Henrique', 9, 9, 8, 7),
(6, 'Nilson', 10, 9, 10, 9),
(7, 'Ana', 9, 9, 8, 8),
(8, 'Amanda', 8, 9, 9, 8),
(9, 'Carlos', 6, 6, 5, 6),
(10, 'Pedro', 8, 8, 8, 7);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alunoconcluinte`
--
ALTER TABLE `alunoconcluinte`
  ADD PRIMARY KEY (`idalunoconcluinte`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `alunoconcluinte`
--
ALTER TABLE `alunoconcluinte`
  MODIFY `idalunoconcluinte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
