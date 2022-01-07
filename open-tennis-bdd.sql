-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 07, 2022 at 08:50 AM
-- Server version: 10.3.28-MariaDB
-- PHP Version: 7.2.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `p2003245`
--

-- --------------------------------------------------------

--
-- Table structure for table `Arbitres`
--

CREATE TABLE `Arbitres` (
  `idArbitre` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `nationalite` varchar(255) NOT NULL,
  `typeArbitre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Arbitres`
--

INSERT INTO `Arbitres` (`idArbitre`, `nom`, `prenom`, `nationalite`, `typeArbitre`) VALUES
(1, 'Nieves', 'Claudia', 'United Kingdom', 'dictum sapien. Aenean massa. Integer'),
(2, 'Valentine', 'Jolie', 'United Kingdom', 'gravida nunc sed pede. Cum'),
(3, 'Hurst', 'Astra', 'Turkey', 'vel sapien imperdiet ornare. In'),
(4, 'Sampson', 'Aaron', 'Nigeria', 'semper egestas, urna justo faucibus'),
(5, 'Hill', 'Upton', 'South Korea', 'ligula. Aenean gravida nunc sed'),
(6, 'Lyons', 'Nicholas', 'Belgium', 'tincidunt dui augue eu tellus.'),
(7, 'Todd', 'Eve', 'France', 'adipiscing lobortis risus. In mi'),
(8, 'Lopez', 'Melvin', 'Sweden', 'egestas a, dui. Cras pellentesque.'),
(9, 'Mcclain', 'Jayme', 'Peru', 'iaculis, lacus pede sagittis augue,'),
(10, 'Stuart', 'Caldwell', 'Mexico', 'facilisis non, bibendum sed, est.'),
(11, 'Estes', 'Merritt', 'France', 'sapien. Nunc pulvinar arcu et'),
(12, 'Gardner', 'Duncan', 'Norway', 'dignissim tempor arcu. Vestibulum ut'),
(13, 'Valentine', 'Hedy', 'Netherlands', 'dignissim tempor arcu. Vestibulum ut'),
(14, 'Potter', 'Hayes', 'Colombia', 'luctus ut, pellentesque eget, dictum'),
(15, 'Roman', 'Aristotle', 'Italy', 'taciti sociosqu ad litora torquent'),
(16, 'Donaldson', 'Camille', 'Norway', 'dictum. Proin eget odio. Aliquam'),
(17, 'House', 'Randall', 'Nigeria', 'sit amet, dapibus id, blandit'),
(18, 'Flores', 'Katell', 'Norway', 'suscipit, est ac facilisis facilisis,'),
(19, 'Tucker', 'Colt', 'New Zealand', 'ornare, lectus ante dictum mi,'),
(20, 'Lloyd', 'Brandon', 'Belgium', 'enim non nisi. Aenean eget'),
(21, 'Mathews', 'Jada', 'United States', 'metus facilisis lorem tristique aliquet.'),
(22, 'Daniel', 'Asher', 'Mexico', 'Pellentesque ut ipsum ac mi'),
(23, 'Shields', 'Brittany', 'Vietnam', 'Vestibulum ut eros non enim'),
(24, 'Woods', 'Eric', 'Indonesia', 'at, egestas a, scelerisque sed,'),
(25, 'Matthews', 'Kenneth', 'Turkey', 'Suspendisse commodo tincidunt nibh. Phasellus'),
(26, 'Barlow', 'Nigel', 'Vietnam', 'nisl sem, consequat nec, mollis'),
(27, 'Duncan', 'Gabriel', 'United Kingdom', 'nunc est, mollis non, cursus'),
(28, 'Vaughn', 'MacKenzie', 'India', 'tellus non magna. Nam ligula'),
(29, 'Abbott', 'Fletcher', 'China', 'Vivamus molestie dapibus ligula. Aliquam'),
(30, 'Jefferson', 'Tana', 'New Zealand', 'metus sit amet ante. Vivamus'),
(31, 'Levine', 'Jemima', 'United Kingdom', 'lorem, luctus ut, pellentesque eget,'),
(32, 'Torres', 'Mona', 'New Zealand', 'orci. Phasellus dapibus quam quis'),
(33, 'Michael', 'Luke', 'Russian Federation', 'Praesent luctus. Curabitur egestas nunc'),
(34, 'Flynn', 'Tad', 'Peru', 'sed pede nec ante blandit'),
(35, 'Hamilton', 'George', 'France', 'sagittis felis. Donec tempor, est'),
(36, 'Langley', 'Scarlet', 'Italy', 'at augue id ante dictum'),
(37, 'Robles', 'Lydia', 'New Zealand', 'eu enim. Etiam imperdiet dictum'),
(38, 'Velazquez', 'Gillian', 'Italy', 'mauris elit, dictum eu, eleifend'),
(39, 'Johnson', 'Wyoming', 'Belgium', 'adipiscing fringilla, porttitor vulputate, posuere'),
(40, 'Lloyd', 'Ima', 'China', 'nunc. Quisque ornare tortor at'),
(41, 'Leblanc', 'Kai', 'Poland', 'in aliquet lobortis, nisi nibh'),
(42, 'Grimes', 'Dillon', 'Brazil', 'Sed congue, elit sed consequat'),
(43, 'Fields', 'Gannon', 'Ireland', 'luctus et ultrices posuere cubilia'),
(44, 'Tucker', 'Venus', 'Russian Federation', 'est. Nunc ullamcorper, velit in'),
(45, 'Ramsey', 'Octavia', 'China', 'non, feugiat nec, diam. Duis'),
(46, 'Vincent', 'Erich', 'Colombia', 'nisi sem semper erat, in'),
(47, 'Mcneil', 'Signe', 'Russian Federation', 'luctus vulputate, nisi sem semper'),
(48, 'Cook', 'Piper', 'Norway', 'risus. Duis a mi fringilla'),
(49, 'Benton', 'Kyle', 'Indonesia', 'a, facilisis non, bibendum sed,'),
(50, 'House', 'Chester', 'Austria', 'turpis vitae purus gravida sagittis.');

-- --------------------------------------------------------

--
-- Table structure for table `FicheVIP`
--

CREATE TABLE `FicheVIP` (
  `idFiche` int(11) NOT NULL,
  `nom` varchar(254) DEFAULT NULL,
  `prenom` varchar(254) DEFAULT NULL,
  `dateNaissance` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `FicheVIP`
--

INSERT INTO `FicheVIP` (`idFiche`, `nom`, `prenom`, `dateNaissance`) VALUES
(1, 'Osborne', 'Lareina', '0000-00-00 00:00:00'),
(2, 'Sutton', 'Nathaniel', '0000-00-00 00:00:00'),
(3, 'Daniels', 'Christian', '0000-00-00 00:00:00'),
(4, 'Richard', 'Julie', '0000-00-00 00:00:00'),
(5, 'Delacruz', 'Colby', '0000-00-00 00:00:00'),
(6, 'Byrd', 'Melissa', '2003-04-11 00:00:00'),
(7, 'Todd', 'Charde', '0000-00-00 00:00:00'),
(8, 'Cruz', 'Hasad', '0000-00-00 00:00:00'),
(9, 'Howe', 'Hanna', '0000-00-00 00:00:00'),
(10, 'Joyce', 'Laura', '0000-00-00 00:00:00'),
(11, 'Buckley', 'Heather', '0000-00-00 00:00:00'),
(12, 'Kane', 'Samuel', '0000-00-00 00:00:00'),
(13, 'Burch', 'Oliver', '2015-08-01 00:00:00'),
(14, 'Johns', 'Carlos', '0000-00-00 00:00:00'),
(15, 'Davis', 'Elizabeth', '2012-03-03 00:00:00'),
(16, 'Craig', 'Breanna', '0000-00-00 00:00:00'),
(17, 'Doyle', 'Byron', '0000-00-00 00:00:00'),
(18, 'Buck', 'Kareem', '0000-00-00 00:00:00'),
(19, 'Gutierrez', 'Rhiannon', '0000-00-00 00:00:00'),
(20, 'Dean', 'Roth', '0000-00-00 00:00:00'),
(21, 'Alston', 'Howard', '0000-00-00 00:00:00'),
(22, 'Marquez', 'Tatiana', '0000-00-00 00:00:00'),
(23, 'Gross', 'Mason', '0000-00-00 00:00:00'),
(24, 'Bird', 'Mara', '2003-09-10 00:00:00'),
(25, 'Villarreal', 'Colby', '0000-00-00 00:00:00'),
(26, 'Mitchell', 'Juliet', '2018-10-10 00:00:00'),
(27, 'Oliver', 'Dominic', '0000-00-00 00:00:00'),
(28, 'O\'donnell', 'Cain', '2012-12-05 00:00:00'),
(29, 'Smith', 'Orson', '0000-00-00 00:00:00'),
(30, 'Cummings', 'Aristotle', '0000-00-00 00:00:00'),
(31, 'Wade', 'Carly', '0000-00-00 00:00:00'),
(32, 'Sharpe', 'Callum', '0000-00-00 00:00:00'),
(33, 'O\'donnell', 'Dylan', '2023-07-15 00:00:00'),
(34, 'Burke', 'Vaughan', '2014-01-17 00:00:00'),
(35, 'Rush', 'Rhoda', '0000-00-00 00:00:00'),
(36, 'West', 'Neil', '0000-00-00 00:00:00'),
(37, 'Sparks', 'Victor', '0000-00-00 00:00:00'),
(38, 'Stuart', 'Wallace', '0000-00-00 00:00:00'),
(39, 'Tucker', 'Ivor', '0000-00-00 00:00:00'),
(40, 'Hart', 'Kirby', '0000-00-00 00:00:00'),
(41, 'Jefferson', 'Maxwell', '0000-00-00 00:00:00'),
(42, 'Garza', 'Herman', '2016-04-07 00:00:00'),
(43, 'Kinney', 'Jesse', '0000-00-00 00:00:00'),
(44, 'Salazar', 'Quinn', '0000-00-00 00:00:00'),
(45, 'Livingston', 'Buffy', '2021-02-01 00:00:00'),
(46, 'Gross', 'Avram', '0000-00-00 00:00:00'),
(47, 'Booth', 'Paloma', '2007-00-18 00:00:00'),
(48, 'Small', 'Kirby', '0000-00-00 00:00:00'),
(49, 'Ruiz', 'Isabelle', '0000-00-00 00:00:00'),
(50, 'Morse', 'Leah', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `Horaires`
--

CREATE TABLE `Horaires` (
  `idHoraire` int(11) NOT NULL,
  `date` date NOT NULL,
  `heureDebut` time NOT NULL,
  `heureFin` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Horaires`
--

INSERT INTO `Horaires` (`idHoraire`, `date`, `heureDebut`, `heureFin`) VALUES
(1, '0000-00-00', '09:07:00', '08:40:00'),
(2, '0000-00-00', '09:59:00', '05:41:00'),
(3, '0000-00-00', '06:57:00', '04:54:00'),
(4, '0000-00-00', '08:00:00', '01:58:00'),
(5, '0000-00-00', '09:17:00', '07:34:00'),
(6, '0000-00-00', '04:53:00', '01:53:00'),
(7, '0000-00-00', '12:16:00', '08:15:00'),
(8, '0000-00-00', '10:56:00', '05:11:00'),
(9, '0000-00-00', '04:18:00', '03:11:00'),
(10, '0000-00-00', '05:17:00', '08:46:00'),
(11, '0000-00-00', '02:58:00', '07:21:00'),
(12, '0000-00-00', '12:34:00', '02:36:00'),
(13, '0000-00-00', '02:39:00', '01:06:00'),
(14, '0000-00-00', '03:55:00', '01:51:00'),
(15, '0000-00-00', '02:27:00', '12:03:00'),
(16, '0000-00-00', '05:04:00', '09:16:00'),
(17, '0000-00-00', '03:16:00', '04:37:00'),
(18, '0000-00-00', '05:09:00', '12:58:00'),
(19, '0000-00-00', '07:31:00', '01:39:00'),
(20, '0000-00-00', '12:51:00', '05:05:00'),
(21, '0000-00-00', '04:57:00', '09:03:00'),
(22, '0000-00-00', '05:42:00', '02:24:00'),
(23, '0000-00-00', '01:40:00', '06:31:00'),
(24, '0000-00-00', '07:45:00', '09:09:00'),
(25, '0000-00-00', '11:53:00', '01:10:00'),
(26, '0000-00-00', '12:18:00', '12:29:00'),
(27, '0000-00-00', '09:53:00', '11:01:00'),
(28, '0000-00-00', '07:46:00', '09:28:00'),
(29, '0000-00-00', '08:44:00', '04:44:00'),
(30, '0000-00-00', '12:46:00', '07:57:00'),
(31, '0000-00-00', '08:58:00', '07:00:00'),
(32, '0000-00-00', '10:45:00', '09:36:00'),
(33, '0000-00-00', '09:36:00', '03:25:00'),
(34, '0000-00-00', '12:17:00', '06:17:00'),
(35, '0000-00-00', '06:50:00', '01:03:00'),
(36, '0000-00-00', '07:31:00', '08:39:00'),
(37, '0000-00-00', '07:14:00', '06:20:00'),
(38, '0000-00-00', '08:01:00', '06:38:00'),
(39, '0000-00-00', '11:09:00', '12:42:00'),
(40, '0000-00-00', '05:53:00', '10:32:00'),
(41, '0000-00-00', '01:08:00', '02:47:00'),
(42, '0000-00-00', '10:07:00', '12:25:00'),
(43, '0000-00-00', '08:13:00', '09:47:00'),
(44, '0000-00-00', '02:44:00', '09:28:00'),
(45, '0000-00-00', '03:04:00', '01:16:00'),
(46, '0000-00-00', '09:03:00', '08:18:00'),
(47, '0000-00-00', '01:21:00', '04:14:00'),
(48, '0000-00-00', '04:19:00', '01:41:00'),
(49, '0000-00-00', '01:31:00', '08:15:00'),
(50, '0000-00-00', '02:51:00', '08:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `Interaction`
--

CREATE TABLE `Interaction` (
  `idFiche` int(11) NOT NULL,
  `idInteraction` int(11) NOT NULL,
  `titre` varchar(254) DEFAULT NULL,
  `contenu` varchar(254) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Interaction`
--

INSERT INTO `Interaction` (`idFiche`, `idInteraction`, `titre`, `contenu`, `date`) VALUES
(2, 10, 'nascetur', 'eu elit.', '0000-00-00'),
(2, 36, 'consectetuer rhoncus. Nullam velit', 'sit amet', '0000-00-00'),
(2, 37, 'nonummy. Fusce fermentum fermentum', 'sit amet', '0000-00-00'),
(2, 41, 'nec mauris', 'in sodales elit erat', '0000-00-00'),
(2, 48, 'dis parturient', 'dignissim magna a tortor.', '0000-00-00'),
(3, 5, 'tempor', 'ridiculus mus. Aenean', '0000-00-00'),
(3, 7, 'amet massa. Quisque porttitor', 'enim. Nunc ut erat.', '0000-00-00'),
(3, 27, 'tempus', 'In nec orci. Donec', '0000-00-00'),
(3, 46, 'Sed eu eros.', 'semper', '0000-00-00'),
(4, 11, 'aptent taciti sociosqu', 'lacus vestibulum', '0000-00-00'),
(4, 13, 'lectus, a sollicitudin', 'Nunc mauris elit, dictum', '0000-00-00'),
(4, 26, 'dui.', 'lacinia. Sed congue,', '0000-00-00'),
(4, 30, 'Quisque porttitor eros nec tellus.', 'a, magna. Lorem ipsum', '0000-00-00'),
(4, 40, 'augue', 'ullamcorper. Duis cursus, diam', '0000-00-00'),
(4, 42, 'augue id ante', 'nunc', '0000-00-00'),
(5, 22, 'et', 'dictum eleifend, nunc', '0000-00-00'),
(5, 43, 'iaculis', 'odio. Aliquam', '0000-00-00'),
(6, 23, 'euismod enim.', 'auctor quis, tristique', '0000-00-00'),
(6, 24, 'felis eget varius ultrices, mauris', 'Cum sociis natoque penatibus et', '0000-00-00'),
(6, 32, 'quam a', 'consequat, lectus sit', '0000-00-00'),
(6, 39, 'facilisis facilisis, magna tellus', 'lacus.', '0000-00-00'),
(6, 45, 'augue ac ipsum. Phasellus vitae', 'quis,', '0000-00-00'),
(7, 6, 'blandit congue. In', 'ullamcorper, nisl', '0000-00-00'),
(7, 16, 'nulla. Cras eu tellus eu', 'nunc id', '0000-00-00'),
(7, 25, 'aliquet. Phasellus fermentum', 'nec quam. Curabitur vel', '0000-00-00'),
(7, 38, 'Proin nisl sem, consequat', 'lorem tristique aliquet.', '0000-00-00'),
(7, 44, 'tristique pellentesque, tellus', 'congue.', '0000-00-00'),
(8, 1, 'malesuada vel, convallis in,', 'ipsum ac mi eleifend', '0000-00-00'),
(8, 2, 'dictum', 'Lorem ipsum dolor sit amet,', '0000-00-00'),
(8, 3, 'ullamcorper magna. Sed', 'nunc nulla vulputate', '0000-00-00'),
(8, 9, 'orci quis lectus.', 'velit. Cras lorem lorem, luctus', '0000-00-00'),
(8, 12, 'Nunc mauris', 'Aenean gravida', '0000-00-00'),
(8, 14, 'nisl elementum purus, accumsan', 'viverra. Maecenas iaculis', '0000-00-00'),
(8, 18, 'rutrum', 'ligula. Donec', '0000-00-00'),
(8, 28, 'dolor', 'ipsum dolor sit amet, consectetuer', '0000-00-00'),
(8, 29, 'ante ipsum', 'mollis lectus', '0000-00-00'),
(8, 33, 'erat.', 'id, mollis', '0000-00-00'),
(8, 49, 'adipiscing. Mauris molestie', 'rhoncus. Proin nisl sem,', '0000-00-00'),
(9, 4, 'morbi tristique senectus', 'cursus a, enim. Suspendisse', '0000-00-00'),
(9, 8, 'feugiat', 'eu erat semper rutrum.', '0000-00-00'),
(9, 15, 'a, auctor non, feugiat nec,', 'Proin velit.', '0000-00-00'),
(9, 17, 'lectus. Cum', 'et magnis dis', '0000-00-00'),
(9, 20, 'rhoncus. Donec est. Nunc', 'Donec sollicitudin adipiscing', '0000-00-00'),
(9, 21, 'Suspendisse tristique neque', 'Integer aliquam adipiscing', '0000-00-00'),
(9, 31, 'facilisis lorem tristique aliquet.', 'dolor dolor, tempus', '0000-00-00'),
(9, 34, 'Mauris blandit enim consequat', 'justo', '0000-00-00'),
(9, 47, 'ut ipsum', 'pede et risus. Quisque libero', '0000-00-00'),
(9, 50, 'mauris', 'Aenean eget magna.', '0000-00-00'),
(10, 19, 'luctus aliquet odio.', 'quam, elementum at,', '0000-00-00'),
(10, 35, 'tempus risus. Donec egestas. Duis', 'elit. Aliquam', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `Joueurs`
--

CREATE TABLE `Joueurs` (
  `idJoueur` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `nationalite` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Joueurs`
--

INSERT INTO `Joueurs` (`idJoueur`, `nom`, `prenom`, `nationalite`) VALUES
(1, 'Adrienne', 'Newton', 'Chile'),
(2, 'Kylynn', 'Ballard', 'Peru'),
(3, 'Phyllis', 'Brock', 'Indonesia'),
(4, 'Micah', 'Goodwin', 'Brazil'),
(5, 'Shelley', 'Duran', 'France'),
(6, 'Sandra', 'Velasquez', 'Netherlands'),
(7, 'Brenden', 'Sears', 'Chile'),
(8, 'Camden', 'Leonard', 'Poland'),
(9, 'Megan', 'Barrett', 'Indonesia'),
(10, 'Brady', 'Riggs', 'Peru'),
(11, 'Nelle', 'Lowe', 'Norway'),
(12, 'Zia', 'Hobbs', 'Poland'),
(13, 'Kennan', 'Francis', 'Chile'),
(14, 'Maxwell', 'Gamble', 'Ireland'),
(15, 'Renee', 'Beck', 'Vietnam'),
(16, 'Akeem', 'Hill', 'United Kingdom'),
(17, 'Todd', 'Mckay', 'Nigeria'),
(18, 'Hilda', 'Irwin', 'Mexico'),
(19, 'Ray', 'Adams', 'Mexico'),
(20, 'Neil', 'Calderon', 'India'),
(21, 'Raphael', 'Hewitt', 'Pakistan'),
(22, 'Sylvia', 'Day', 'Colombia'),
(23, 'Jolene', 'Franklin', 'South Korea'),
(24, 'Virginia', 'Fitzpatrick', 'Costa Rica'),
(25, 'Cameran', 'Dudley', 'New Zealand'),
(26, 'Echo', 'Brady', 'Poland'),
(27, 'Hedda', 'Pope', 'Russian Federation'),
(28, 'Lester', 'Battle', 'Mexico'),
(29, 'Mariko', 'Peck', 'Pakistan'),
(30, 'Hollee', 'Ray', 'Mexico'),
(31, 'Harlan', 'Dennis', 'Canada'),
(32, 'Hunter', 'Grimes', 'New Zealand'),
(33, 'Harding', 'Mccarthy', 'Peru'),
(34, 'Austin', 'Bradley', 'Austria'),
(35, 'Hyatt', 'Page', 'Canada'),
(36, 'Silas', 'O\'connor', 'Australia'),
(37, 'Ebony', 'Joyner', 'Canada'),
(38, 'Irma', 'Leblanc', 'Indonesia'),
(39, 'Zane', 'Cleveland', 'Canada'),
(40, 'Elmo', 'Fuentes', 'Belgium'),
(41, 'Lane', 'Burks', 'Chile'),
(42, 'Yolanda', 'Finley', 'Nigeria'),
(43, 'Slade', 'Mccormick', 'Spain'),
(44, 'Lucy', 'Norton', 'India'),
(45, 'Jolene', 'Cross', 'Mexico'),
(46, 'Chancellor', 'Oneil', 'Austria'),
(47, 'Zane', 'Kirby', 'Belgium'),
(48, 'Hanna', 'Perkins', 'New Zealand'),
(49, 'Fritz', 'Hutchinson', 'Germany'),
(50, 'Burton', 'Simpson', 'Pakistan');

-- --------------------------------------------------------

--
-- Table structure for table `ListeArbitres`
--

CREATE TABLE `ListeArbitres` (
  `idArbitre` int(11) NOT NULL,
  `idMatch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ListeArbitres`
--

INSERT INTO `ListeArbitres` (`idArbitre`, `idMatch`) VALUES
(7, 30),
(8, 5),
(8, 34),
(9, 5),
(10, 23),
(11, 15),
(12, 22),
(15, 29),
(17, 10),
(17, 22),
(17, 25),
(18, 30),
(22, 11),
(23, 33),
(23, 41),
(26, 47),
(28, 31),
(28, 47),
(29, 43),
(31, 24),
(32, 24),
(34, 48),
(35, 40),
(37, 34),
(37, 44),
(42, 7),
(43, 30),
(45, 23),
(45, 37),
(49, 30);

-- --------------------------------------------------------

--
-- Table structure for table `ListeJoueurs`
--

CREATE TABLE `ListeJoueurs` (
  `idJoueur` int(11) NOT NULL,
  `idMatch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ListeJoueurs`
--

INSERT INTO `ListeJoueurs` (`idJoueur`, `idMatch`) VALUES
(1, 44),
(3, 25),
(4, 31),
(6, 34),
(7, 37),
(9, 13),
(10, 2),
(11, 14),
(12, 27),
(13, 8),
(13, 12),
(15, 39),
(16, 37),
(16, 43),
(17, 41),
(18, 19),
(18, 31),
(18, 38),
(21, 7),
(22, 42),
(24, 4),
(27, 4),
(27, 14),
(27, 24),
(27, 44),
(29, 31),
(29, 42),
(31, 19),
(34, 15),
(34, 21),
(35, 48),
(37, 7),
(37, 47),
(38, 2),
(40, 10),
(41, 7),
(41, 46),
(42, 27),
(42, 28),
(42, 34),
(45, 4),
(45, 26),
(46, 12),
(47, 19),
(47, 43),
(48, 28),
(49, 11),
(49, 50),
(50, 6),
(50, 37);

-- --------------------------------------------------------

--
-- Table structure for table `ListeRamasseurs`
--

CREATE TABLE `ListeRamasseurs` (
  `idRamasseur` int(11) NOT NULL,
  `idMatch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ListeRamasseurs`
--

INSERT INTO `ListeRamasseurs` (`idRamasseur`, `idMatch`) VALUES
(1, 1),
(1, 5),
(2, 2),
(3, 3),
(4, 4),
(4, 9),
(5, 5),
(6, 6),
(7, 7),
(7, 44),
(8, 8),
(8, 40),
(9, 9),
(9, 32),
(9, 34),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(15, 31),
(16, 16),
(17, 17),
(17, 34),
(18, 18),
(19, 19),
(20, 20),
(22, 41),
(25, 34),
(27, 27),
(27, 33),
(31, 46),
(32, 2),
(43, 15),
(45, 29),
(45, 45),
(46, 26),
(47, 50),
(50, 7);

-- --------------------------------------------------------

--
-- Table structure for table `Matchs`
--

CREATE TABLE `Matchs` (
  `idMatch` int(11) NOT NULL,
  `typeMatch` varchar(10) NOT NULL DEFAULT 'Simple',
  `tour` int(11) NOT NULL,
  `score` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Matchs`
--

INSERT INTO `Matchs` (`idMatch`, `typeMatch`, `tour`, `score`) VALUES
(1, 'Simple', 3, 'taciti sociosqu ad litora torquent per'),
(2, 'Simple', 2, 'magna. Lorem ipsum dolor sit amet,'),
(3, 'Simple', 1, 'enim commodo hendrerit. Donec porttitor tellus'),
(4, 'Simple', 9, 'sit amet ante. Vivamus non lorem'),
(5, 'Simple', 5, 'ultrices a, auctor non, feugiat nec,'),
(6, 'Simple', 2, 'Nullam velit dui, semper et, lacinia'),
(7, 'Simple', 7, 'iaculis quis, pede. Praesent eu dui.'),
(8, 'Simple', 0, 'vel, convallis in, cursus et, eros.'),
(9, 'Simple', 6, 'sapien. Aenean massa. Integer vitae nibh.'),
(10, 'Simple', 9, 'Curabitur dictum. Phasellus in felis. Nulla'),
(11, 'Simple', 5, 'in, tempus eu, ligula. Aenean euismod'),
(12, 'Simple', 6, 'Quisque fringilla euismod enim. Etiam gravida'),
(13, 'Simple', 1, 'cursus in, hendrerit consectetuer, cursus et,'),
(14, 'Simple', 7, 'id, ante. Nunc mauris sapien, cursus'),
(15, 'Simple', 10, 'rhoncus. Donec est. Nunc ullamcorper, velit'),
(16, 'Simple', 3, 'orci. Phasellus dapibus quam quis diam.'),
(17, 'Simple', 2, 'ornare. In faucibus. Morbi vehicula. Pellentesque'),
(18, 'Simple', 6, 'eget, volutpat ornare, facilisis eget, ipsum.'),
(19, 'Simple', 7, 'Nunc mauris elit, dictum eu, eleifend'),
(20, 'Simple', 7, 'nec orci. Donec nibh. Quisque nonummy'),
(21, 'Simple', 7, 'quam, elementum at, egestas a, scelerisque'),
(22, 'Simple', 8, 'mauris, aliquam eu, accumsan sed, facilisis'),
(23, 'Simple', 8, 'ante, iaculis nec, eleifend non, dapibus'),
(24, 'Simple', 4, 'rutrum eu, ultrices sit amet, risus.'),
(25, 'Simple', 2, 'lobortis quam a felis ullamcorper viverra.'),
(26, 'Simple', 0, 'odio, auctor vitae, aliquet nec, imperdiet'),
(27, 'Simple', 5, 'magnis dis parturient montes, nascetur ridiculus'),
(28, 'Simple', 10, 'enim nisl elementum purus, accumsan interdum'),
(29, 'Simple', 1, 'ante ipsum primis in faucibus orci'),
(30, 'Simple', 5, 'dapibus quam quis diam. Pellentesque habitant'),
(31, 'Simple', 6, 'Aliquam nisl. Nulla eu neque pellentesque'),
(32, 'Simple', 4, 'fermentum risus, at fringilla purus mauris'),
(33, 'Simple', 6, 'dictum magna. Ut tincidunt orci quis'),
(34, 'Simple', 1, 'hendrerit a, arcu. Sed et libero.'),
(35, 'Simple', 0, 'augue, eu tempor erat neque non'),
(36, 'Simple', 2, 'dolor. Fusce mi lorem, vehicula et,'),
(37, 'Simple', 9, 'egestas. Duis ac arcu. Nunc mauris.'),
(38, 'Simple', 3, 'feugiat placerat velit. Quisque varius. Nam'),
(39, 'Simple', 7, 'enim. Nunc ut erat. Sed nunc'),
(40, 'Simple', 4, 'orci. Ut semper pretium neque. Morbi'),
(41, 'Simple', 10, 'aliquam, enim nec tempus scelerisque, lorem'),
(42, 'Simple', 2, 'ullamcorper, velit in aliquet lobortis, nisi'),
(43, 'Simple', 7, 'Etiam laoreet, libero et tristique pellentesque,'),
(44, 'Simple', 6, 'sagittis augue, eu tempor erat neque'),
(45, 'Simple', 7, 'augue eu tellus. Phasellus elit pede,'),
(46, 'Simple', 9, 'tristique ac, eleifend vitae, erat. Vivamus'),
(47, 'Simple', 7, 'nec urna et arcu imperdiet ullamcorper.'),
(48, 'Simple', 5, 'ornare, libero at auctor ullamcorper, nisl'),
(49, 'Simple', 4, 'enim. Mauris quis turpis vitae purus'),
(50, 'Simple', 3, 'vestibulum lorem, sit amet ultricies sem');

-- --------------------------------------------------------

--
-- Table structure for table `RamasseursBalles`
--

CREATE TABLE `RamasseursBalles` (
  `idRamasseur` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `nationalite` varchar(255) NOT NULL,
  `club` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `RamasseursBalles`
--

INSERT INTO `RamasseursBalles` (`idRamasseur`, `nom`, `prenom`, `nationalite`, `club`) VALUES
(1, 'Gutierrez', 'Basil', 'Pakistan', 'risus'),
(2, 'Lindsay', 'Uriah', 'Australia', 'eleifend'),
(3, 'Tucker', 'Kennedy', 'China', 'justo'),
(4, 'Whitehead', 'Lillith', 'Austria', 'Praesent'),
(5, 'Rosario', 'Libby', 'France', 'ante,'),
(6, 'Mckinney', 'Rana', 'Norway', 'gravida'),
(7, 'Rojas', 'Gareth', 'Colombia', 'parturient'),
(8, 'Flowers', 'Gretchen', 'Chile', 'egestas'),
(9, 'Carney', 'Lucas', 'South Korea', 'scelerisque,'),
(10, 'Kim', 'Marah', 'Netherlands', 'amet,'),
(11, 'Santos', 'Tyrone', 'South Korea', 'Etiam'),
(12, 'Wiggins', 'Dane', 'Indonesia', 'elit'),
(13, 'Lucas', 'Kerry', 'South Korea', 'eu'),
(14, 'Buckley', 'Kennedy', 'Costa Rica', 'elit.'),
(15, 'Hall', 'Silas', 'China', 'Sed'),
(16, 'Waters', 'Garrett', 'Australia', 'elit.'),
(17, 'Melendez', 'Jason', 'Vietnam', 'fermentum'),
(18, 'Savage', 'Jayme', 'New Zealand', 'ullamcorper'),
(19, 'Crawford', 'Danielle', 'Germany', 'magna'),
(20, 'Mclaughlin', 'Lila', 'China', 'Aenean'),
(21, 'Wilkinson', 'Emery', 'United States', 'Donec'),
(22, 'Flynn', 'Quon', 'Spain', 'id'),
(23, 'Wallace', 'Kasper', 'France', 'fermentum'),
(24, 'Hoover', 'Maggy', 'Norway', 'lobortis'),
(25, 'Calderon', 'Phillip', 'Turkey', 'facilisis,'),
(26, 'Gonzalez', 'Leah', 'Chile', 'hendrerit.'),
(27, 'Brewer', 'Beck', 'Chile', 'eget'),
(28, 'Russell', 'Tatyana', 'Colombia', 'consectetuer'),
(29, 'Glover', 'Hanae', 'China', 'sapien'),
(30, 'Fletcher', 'Gil', 'United States', 'eget'),
(31, 'Guzman', 'Teegan', 'Belgium', 'at'),
(32, 'Luna', 'Arsenio', 'Mexico', 'imperdiet'),
(33, 'Mccoy', 'Susan', 'Norway', 'velit'),
(34, 'Burks', 'Idona', 'Turkey', 'lectus.'),
(35, 'Ball', 'Wesley', 'Brazil', 'et,'),
(36, 'Lynch', 'Demetrius', 'Germany', 'libero.'),
(37, 'Diaz', 'Kareem', 'Pakistan', 'ut'),
(38, 'Dickson', 'Cooper', 'Pakistan', 'lectus'),
(39, 'Murray', 'Jonas', 'United Kingdom', 'lobortis'),
(40, 'Joyce', 'Igor', 'Australia', 'quis'),
(41, 'Price', 'Bruce', 'Ireland', 'lacus.'),
(42, 'Cooley', 'Lance', 'United Kingdom', 'sit'),
(43, 'Fleming', 'Adrian', 'Sweden', 'orci'),
(44, 'Garza', 'Yvette', 'Mexico', 'molestie'),
(45, 'Noble', 'Kiona', 'Netherlands', 'porttitor'),
(46, 'Drake', 'Mary', 'Spain', 'pellentesque.'),
(47, 'Spencer', 'Maryam', 'Chile', 'magnis'),
(48, 'Lucas', 'Boris', 'New Zealand', 'lectus'),
(49, 'Sweeney', 'Clark', 'Costa Rica', 'Aliquam'),
(50, 'Mathews', 'Althea', 'Vietnam', 'ipsum.');

-- --------------------------------------------------------

--
-- Table structure for table `Terrains`
--

CREATE TABLE `Terrains` (
  `idTerrain` int(11) NOT NULL,
  `idHoraire` int(11) NOT NULL,
  `idMatch` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `typeTerrain` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Terrains`
--

INSERT INTO `Terrains` (`idTerrain`, `idHoraire`, `idMatch`, `nom`, `typeTerrain`) VALUES
(1, 28, 2, 'turpis', 'non'),
(2, 41, 31, 'molestie', 'ac'),
(3, 42, 15, 'ut', 'mattis'),
(4, 5, 30, 'malesuada', 'enim,'),
(5, 33, 36, 'Pellentesque', 'Duis'),
(6, 32, 7, 'ornare', 'risus.'),
(7, 48, 35, 'a,', 'ac,'),
(8, 21, 16, 'diam.', 'mattis'),
(9, 41, 18, 'natoque', 'urna'),
(10, 12, 31, 'Aenean', 'iaculis'),
(11, 43, 3, 'eget,', 'non,'),
(12, 27, 41, 'Suspendisse', 'cubilia'),
(13, 36, 1, 'tincidunt', 'elit.'),
(14, 42, 44, 'cursus', 'lacinia'),
(15, 44, 26, 'sagittis', 'semper'),
(16, 40, 17, 'dis', 'eget'),
(17, 16, 24, 'convallis,', 'libero'),
(18, 16, 18, 'Donec', 'nec'),
(19, 5, 20, 'Donec', 'ligula'),
(20, 23, 14, 'molestie.', 'enim.'),
(21, 10, 34, 'auctor,', 'pede,'),
(22, 45, 49, 'mauris', 'Cras'),
(23, 21, 16, 'Quisque', 'arcu.'),
(24, 33, 29, 'nibh', 'vitae,'),
(25, 15, 11, 'sit', 'enim,'),
(26, 24, 15, 'massa.', 'nunc'),
(27, 29, 36, 'mi', 'nibh'),
(28, 4, 46, 'mauris', 'purus.'),
(29, 32, 13, 'in', 'nonummy.'),
(30, 42, 45, 'egestas.', 'massa.'),
(31, 32, 29, 'aliquam', 'torquent'),
(32, 24, 7, 'purus.', 'eget'),
(33, 43, 35, 'neque', 'elit,'),
(34, 39, 38, 'Vivamus', 'sed'),
(35, 49, 6, 'Maecenas', 'viverra.'),
(36, 13, 9, 'erat.', 'magna.'),
(37, 44, 40, 'Etiam', 'eget,'),
(38, 47, 46, 'eros', 'vel'),
(39, 21, 13, 'est', 'iaculis'),
(40, 49, 23, 'tincidunt.', 'quis,'),
(41, 7, 20, 'penatibus', 'id'),
(42, 8, 18, 'purus,', 'Maecenas'),
(43, 30, 33, 'bibendum', 'lobortis'),
(44, 28, 33, 'auctor', 'orci'),
(45, 31, 5, 'blandit', 'commodo'),
(46, 10, 28, 'ante', 'quam'),
(47, 49, 30, 'sed', 'risus'),
(48, 49, 48, 'eget', 'Vivamus'),
(49, 25, 8, 'neque', 'augue.'),
(50, 29, 49, 'Aliquam', 'Cras');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Arbitres`
--
ALTER TABLE `Arbitres`
  ADD PRIMARY KEY (`idArbitre`);

--
-- Indexes for table `FicheVIP`
--
ALTER TABLE `FicheVIP`
  ADD PRIMARY KEY (`idFiche`);

--
-- Indexes for table `Horaires`
--
ALTER TABLE `Horaires`
  ADD PRIMARY KEY (`idHoraire`);

--
-- Indexes for table `Interaction`
--
ALTER TABLE `Interaction`
  ADD PRIMARY KEY (`idFiche`,`idInteraction`);

--
-- Indexes for table `Joueurs`
--
ALTER TABLE `Joueurs`
  ADD PRIMARY KEY (`idJoueur`);

--
-- Indexes for table `ListeArbitres`
--
ALTER TABLE `ListeArbitres`
  ADD PRIMARY KEY (`idArbitre`,`idMatch`),
  ADD KEY `idMatchLA` (`idMatch`);

--
-- Indexes for table `ListeJoueurs`
--
ALTER TABLE `ListeJoueurs`
  ADD PRIMARY KEY (`idJoueur`,`idMatch`),
  ADD KEY `fk_idMatch` (`idMatch`);

--
-- Indexes for table `ListeRamasseurs`
--
ALTER TABLE `ListeRamasseurs`
  ADD PRIMARY KEY (`idRamasseur`,`idMatch`),
  ADD KEY `fk_idMatch_rb` (`idMatch`);

--
-- Indexes for table `Matchs`
--
ALTER TABLE `Matchs`
  ADD PRIMARY KEY (`idMatch`);

--
-- Indexes for table `RamasseursBalles`
--
ALTER TABLE `RamasseursBalles`
  ADD PRIMARY KEY (`idRamasseur`);

--
-- Indexes for table `Terrains`
--
ALTER TABLE `Terrains`
  ADD PRIMARY KEY (`idTerrain`,`idHoraire`,`idMatch`),
  ADD KEY `fk_idHoraire` (`idHoraire`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Arbitres`
--
ALTER TABLE `Arbitres`
  MODIFY `idArbitre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `Horaires`
--
ALTER TABLE `Horaires`
  MODIFY `idHoraire` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `Joueurs`
--
ALTER TABLE `Joueurs`
  MODIFY `idJoueur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `Matchs`
--
ALTER TABLE `Matchs`
  MODIFY `idMatch` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `RamasseursBalles`
--
ALTER TABLE `RamasseursBalles`
  MODIFY `idRamasseur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `Terrains`
--
ALTER TABLE `Terrains`
  MODIFY `idTerrain` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Interaction`
--
ALTER TABLE `Interaction`
  ADD CONSTRAINT `fk_idFiche` FOREIGN KEY (`idFiche`) REFERENCES `FicheVIP` (`idFiche`);

--
-- Constraints for table `ListeArbitres`
--
ALTER TABLE `ListeArbitres`
  ADD CONSTRAINT `fk_idArbitre` FOREIGN KEY (`idArbitre`) REFERENCES `Arbitres` (`idArbitre`),
  ADD CONSTRAINT `idMatchLA` FOREIGN KEY (`idMatch`) REFERENCES `Matchs` (`idMatch`);

--
-- Constraints for table `ListeJoueurs`
--
ALTER TABLE `ListeJoueurs`
  ADD CONSTRAINT `fk_idJoueur` FOREIGN KEY (`idJoueur`) REFERENCES `Joueurs` (`idJoueur`),
  ADD CONSTRAINT `fk_idMatch` FOREIGN KEY (`idMatch`) REFERENCES `Matchs` (`idMatch`);

--
-- Constraints for table `ListeRamasseurs`
--
ALTER TABLE `ListeRamasseurs`
  ADD CONSTRAINT `fk_Ramasseur` FOREIGN KEY (`idRamasseur`) REFERENCES `RamasseursBalles` (`idRamasseur`),
  ADD CONSTRAINT `fk_idMatch_rb` FOREIGN KEY (`idMatch`) REFERENCES `Matchs` (`idMatch`);

--
-- Constraints for table `Terrains`
--
ALTER TABLE `Terrains`
  ADD CONSTRAINT `fk_idHoraire` FOREIGN KEY (`idHoraire`) REFERENCES `Horaires` (`idHoraire`),
  ADD CONSTRAINT `fk_idMatch_Terrain` FOREIGN KEY (`idTerrain`) REFERENCES `Matchs` (`idMatch`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
