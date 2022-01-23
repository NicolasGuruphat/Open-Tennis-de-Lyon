-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  Dim 23 jan. 2022 à 23:58
-- Version du serveur :  10.3.28-MariaDB
-- Version de PHP :  7.2.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `p2003245`
--

-- --------------------------------------------------------

--
-- Structure de la table `Arbitre`
--

CREATE TABLE `Arbitre` (
  `idArbitre` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `dateNaissance` date NOT NULL,
  `nationalite` varchar(255) NOT NULL,
  `typeArbitre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Arbitre`
--

INSERT INTO `Arbitre` (`idArbitre`, `nom`, `prenom`, `dateNaissance`, `nationalite`, `typeArbitre`) VALUES
(1, 'Weaver', 'Baker', '1996-07-17', 'New Zealand', 'Chaise'),
(2, 'Wooten', 'Xander', '1996-10-20', 'France', 'Chaise'),
(3, 'Curtis', 'Deborah', '1996-09-20', 'Brazil', 'Chaise'),
(4, 'Hart', 'Wing', '1996-02-19', 'Ireland', 'Chaise'),
(5, 'Cummings', 'Abdul', '1996-05-08', 'United Kingdom', 'Chaise'),
(6, 'Love', 'Vladimir', '1996-11-23', 'Poland', 'Chaise'),
(7, 'Day', 'Iona', '1996-04-01', 'Ireland', 'Chaise'),
(8, 'Neal', 'Amos', '1996-05-30', 'Brazil', 'Chaise'),
(9, 'Powers', 'Wing', '1996-10-10', 'Ireland', 'Chaise'),
(10, 'Chase', 'Brynn', '1996-04-09', 'Brazil', 'Chaise'),
(11, 'Carver', 'Kermit', '1996-07-12', 'Austria', 'Chaise'),
(12, 'Vargas', 'Howard', '1996-10-08', 'Sweden', 'Chaise'),
(13, 'Riggs', 'Hammett', '1996-09-04', 'France', 'Chaise'),
(14, 'Richmond', 'Galena', '1996-09-19', 'Spain', 'Chaise'),
(15, 'Harrington', 'Eric', '1996-03-15', 'Russian Federation', 'Chaise'),
(16, 'Dalton', 'Kameko', '1996-10-13', 'China', 'Chaise'),
(17, 'Horne', 'Anthony', '1996-07-31', 'India', 'Chaise'),
(18, 'Montgomery', 'Ciara', '1996-07-23', 'New Zealand', 'Chaise'),
(19, 'Meyers', 'Odessa', '1996-12-24', 'New Zealand', 'Chaise'),
(20, 'Wall', 'Madaline', '1996-10-20', 'Italy', 'Chaise'),
(21, 'Murphy', 'Austin', '1996-10-06', 'India', 'Chaise'),
(22, 'Faulkner', 'Gisela', '1996-12-21', 'Sweden', 'Chaise'),
(23, 'Bauer', 'Ulla', '1996-08-26', 'Russian Federation', 'Chaise'),
(24, 'Wynn', 'Hillary', '1996-11-21', 'Spain', 'Chaise'),
(25, 'Aguilar', 'Kasper', '1996-06-25', 'China', 'Chaise');

-- --------------------------------------------------------

--
-- Structure de la table `AutreVIP`
--

CREATE TABLE `AutreVIP` (
  `idAutreVIP` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `dateNaissance` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `Horaire`
--

CREATE TABLE `Horaire` (
  `idHoraire` int(11) NOT NULL,
  `date` date NOT NULL,
  `heureDebut` time NOT NULL,
  `heureFin` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Horaire`
--

INSERT INTO `Horaire` (`idHoraire`, `date`, `heureDebut`, `heureFin`) VALUES
(1, '2022-05-08', '08:00:00', '12:00:00'),
(2, '2022-05-08', '14:00:00', '18:00:00'),
(3, '2022-05-09', '08:00:00', '12:00:00'),
(4, '2022-05-09', '14:00:00', '18:00:00'),
(5, '2022-05-10', '08:00:00', '12:00:00'),
(6, '2022-05-10', '14:00:00', '18:00:00'),
(7, '2022-05-11', '08:00:00', '12:00:00'),
(8, '2022-05-11', '14:00:00', '18:00:00'),
(9, '2022-05-12', '08:00:00', '12:00:00'),
(10, '2022-05-12', '14:00:00', '18:00:00'),
(11, '2022-05-13', '08:00:00', '12:00:00'),
(12, '2022-05-13', '14:00:00', '18:00:00'),
(13, '2022-05-14', '08:00:00', '12:00:00'),
(14, '2022-05-14', '14:00:00', '18:00:00');

-- --------------------------------------------------------

--
-- Structure de la table `Interaction`
--

CREATE TABLE `Interaction` (
  `idInteraction` int(11) NOT NULL,
  `titre` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `status` varchar(255) NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `idFiche` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Interaction`
--

INSERT INTO `Interaction` (`idInteraction`, `titre`, `date`, `status`, `action`, `idFiche`) VALUES
(0, 'Transport', '2022-01-19', 'Validée', 'Ne prends pas le bus', 1),
(0, 'Transport', '2022-01-19', 'Validé', 'Réserver le taxi numéro 666', 2),
(1, 'Allergie', '2022-01-19', 'Validée', 'Allergique à l\'eau', 1),
(1, 'Pluie', '2022-01-19', 'à vérifier', 'Énerver quand il pleut', 2),
(2, 'Son', '2022-01-19', 'Validée', 'Allergique à la musique au dessus de 35db', 1),
(2, 'Fin de match', '2022-01-19', 'Validé', 'Veux des lunettes de soleil à la fin du match', 2),
(3, 'Son', '2022-01-19', 'Validée', 'Allergique à la musique au dessus de 35db', 1),
(4, 'Allergie Couleur', '2022-01-19', 'Pas sûr', 'Allergique au bleu', 1),
(5, 'Allergie Couleur', '2022-01-19', 'Pas sûr', 'Allergique au bleu', 1),
(6, 'Allergie', '2022-01-19', 'Validé', 'Allergique aux raquettes de tenis', 1),
(7, 'a', '2022-01-19', 'a', 'a', 1),
(8, 'a', '2022-01-19', 'a', 'a', 1),
(9, 'Canibale', '2022-01-19', 'Validé', 'Attention il mange les autres', 1),
(10, 'oui', '2022-01-20', 'fi', 'ol', 1);

--
-- Déclencheurs `Interaction`
--
DELIMITER $$
CREATE TRIGGER `composite_auto_increment` BEFORE INSERT ON `Interaction` FOR EACH ROW BEGIN
DECLARE max_id INT(11);
SELECT max(idInteraction) FROM Interaction WHERE idFiche = NEW.idFiche INTO max_id;

IF max_id IS null THEN
SET max_id = 0;
ELSE 
SET max_id = max_id+1;
end if;
SET new.idInteraction = max_id;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `Joueur`
--

CREATE TABLE `Joueur` (
  `idJoueur` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `dateNaissance` date NOT NULL,
  `nationalite` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Joueur`
--

INSERT INTO `Joueur` (`idJoueur`, `nom`, `prenom`, `dateNaissance`, `nationalite`) VALUES
(1, 'Bentley', 'Xavier', '1996-01-28', 'France'),
(2, 'Mcdonald', 'Solomon', '1996-07-27', 'India'),
(3, 'Stevenson', 'Cora', '1996-03-27', 'Germany'),
(4, 'Stuart', 'Samuel', '1996-01-25', 'India'),
(5, 'Price', 'Claire', '1996-09-20', 'Belgium'),
(6, 'Sweet', 'Jarrod', '1996-06-11', 'South Korea'),
(7, 'Barrera', 'Alfreda', '1996-01-16', 'France'),
(8, 'Conrad', 'Dante', '1996-07-10', 'France'),
(9, 'Jarvis', 'Daphne', '1996-07-20', 'France'),
(10, 'Henry', 'Hunter', '1996-07-30', 'France'),
(11, 'Pearson', 'Mara', '1996-05-11', 'China'),
(12, 'Robertson', 'Mason', '1996-10-04', 'Vietnam'),
(13, 'Horton', 'Rashad', '1996-12-24', 'New Zealand'),
(14, 'Levy', 'Kirk', '1996-10-23', 'Ireland'),
(15, 'Powell', 'Olympia', '1996-08-26', 'Poland'),
(16, 'Mooney', 'Tamara', '1996-12-03', 'France'),
(17, 'Witt', 'Dara', '1996-09-03', 'France'),
(18, 'Castillo', 'Glenna', '1996-03-01', 'Austria'),
(19, 'Velez', 'Gemma', '1996-05-13', 'Sweden'),
(20, 'Velazquez', 'Halee', '1996-08-04', 'India'),
(21, 'Terrell', 'Akeem', '1996-12-27', 'India'),
(22, 'Hooper', 'April', '1996-08-05', 'Poland'),
(23, 'Solis', 'Channing', '1996-11-04', 'France'),
(24, 'Edwards', 'Amy', '1996-03-22', 'Spain'),
(25, 'Christensen', 'Xandra', '1996-08-18', 'Poland'),
(26, 'Mccall', 'Judah', '1996-05-15', 'Ireland'),
(27, 'Brewer', 'Karina', '1996-07-05', 'India'),
(28, 'Landry', 'Constance', '1996-01-25', 'United States'),
(29, 'Floyd', 'Zoe', '1996-04-10', 'Sweden'),
(30, 'Walsh', 'Maisie', '1996-09-18', 'Poland'),
(31, 'Atkins', 'Brett', '1996-04-15', 'Sweden'),
(32, 'Dejesus', 'Wyatt', '1996-01-18', 'Colombia'),
(33, 'Oisclo', 'Jean-Richard', '1995-10-04', 'Belge'),
(35, 'TennisMan', 'Jean-Balle', '1995-10-04', 'Japonais');

--
-- Déclencheurs `Joueur`
--
DELIMITER $$
CREATE TRIGGER `ajout_joueur_listeVIP` AFTER INSERT ON `Joueur` FOR EACH ROW insert into ListeVIP (idJoueur, idArbitre, idRamasseur, idAutreVIP) VALUES (new.idJoueur, null, null,null)
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `ListeArbitre`
--

CREATE TABLE `ListeArbitre` (
  `idArbitre` int(11) NOT NULL,
  `idMatch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ListeArbitre`
--

INSERT INTO `ListeArbitre` (`idArbitre`, `idMatch`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);

-- --------------------------------------------------------

--
-- Structure de la table `ListeJoueurs`
--

CREATE TABLE `ListeJoueurs` (
  `idJoueur` int(11) NOT NULL,
  `idMatch` int(11) NOT NULL,
  `winner` tinyint(1) DEFAULT NULL,
  `set1` int(11) DEFAULT NULL,
  `set2` int(11) DEFAULT NULL,
  `set3` int(11) DEFAULT NULL,
  `set4` int(11) DEFAULT NULL,
  `set5` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ListeJoueurs`
--

INSERT INTO `ListeJoueurs` (`idJoueur`, `idMatch`, `winner`, `set1`, `set2`, `set3`, `set4`, `set5`) VALUES
(1, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(2, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 2, NULL, NULL, NULL, NULL, NULL, NULL),
(4, 2, NULL, NULL, NULL, NULL, NULL, NULL),
(5, 3, NULL, NULL, NULL, NULL, NULL, NULL),
(6, 3, NULL, NULL, NULL, NULL, NULL, NULL),
(7, 4, NULL, NULL, NULL, NULL, NULL, NULL),
(8, 4, NULL, NULL, NULL, NULL, NULL, NULL),
(9, 5, NULL, NULL, NULL, NULL, NULL, NULL),
(10, 5, NULL, NULL, NULL, NULL, NULL, NULL),
(11, 6, NULL, NULL, NULL, NULL, NULL, NULL),
(12, 6, NULL, NULL, NULL, NULL, NULL, NULL),
(13, 7, NULL, NULL, NULL, NULL, NULL, NULL),
(14, 7, NULL, NULL, NULL, NULL, NULL, NULL),
(15, 8, NULL, NULL, NULL, NULL, NULL, NULL),
(16, 8, NULL, NULL, NULL, NULL, NULL, NULL),
(17, 9, NULL, NULL, NULL, NULL, NULL, NULL),
(18, 9, NULL, NULL, NULL, NULL, NULL, NULL),
(19, 10, NULL, NULL, NULL, NULL, NULL, NULL),
(20, 10, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `ListeRamasseurs`
--

CREATE TABLE `ListeRamasseurs` (
  `idRamasseur` int(11) NOT NULL,
  `idMatch` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ListeRamasseurs`
--

INSERT INTO `ListeRamasseurs` (`idRamasseur`, `idMatch`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10);

-- --------------------------------------------------------

--
-- Structure de la table `ListeVIP`
--

CREATE TABLE `ListeVIP` (
  `idFiche` int(11) NOT NULL,
  `idJoueur` int(11) DEFAULT NULL,
  `idArbitre` int(11) DEFAULT NULL,
  `idRamasseur` int(11) DEFAULT NULL,
  `idAutreVIP` int(11) DEFAULT NULL,
  `notation` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ListeVIP`
--

INSERT INTO `ListeVIP` (`idFiche`, `idJoueur`, `idArbitre`, `idRamasseur`, `idAutreVIP`, `notation`) VALUES
(1, 1, NULL, NULL, NULL, 5),
(2, 2, NULL, NULL, NULL, NULL),
(3, 3, NULL, NULL, NULL, NULL),
(4, 4, NULL, NULL, NULL, NULL),
(5, 5, NULL, NULL, NULL, NULL),
(6, 6, NULL, NULL, NULL, NULL),
(7, 7, NULL, NULL, NULL, NULL),
(8, 8, NULL, NULL, NULL, NULL),
(9, 9, NULL, NULL, NULL, NULL),
(10, 10, NULL, NULL, NULL, NULL),
(11, 11, NULL, NULL, NULL, NULL),
(12, 12, NULL, NULL, NULL, NULL),
(13, 13, NULL, NULL, NULL, NULL),
(14, 14, NULL, NULL, NULL, NULL),
(15, 15, NULL, NULL, NULL, NULL),
(16, 16, NULL, NULL, NULL, NULL),
(17, 17, NULL, NULL, NULL, NULL),
(18, 18, NULL, NULL, NULL, NULL),
(19, 19, NULL, NULL, NULL, NULL),
(20, 20, NULL, NULL, NULL, NULL),
(21, 21, NULL, NULL, NULL, NULL),
(22, 22, NULL, NULL, NULL, NULL),
(23, 23, NULL, NULL, NULL, NULL),
(24, 24, NULL, NULL, NULL, NULL),
(25, 25, NULL, NULL, NULL, NULL),
(26, 26, NULL, NULL, NULL, NULL),
(27, 27, NULL, NULL, NULL, NULL),
(28, 28, NULL, NULL, NULL, NULL),
(29, 29, NULL, NULL, NULL, NULL),
(30, 30, NULL, NULL, NULL, NULL),
(31, 31, NULL, NULL, NULL, NULL),
(32, 32, NULL, NULL, NULL, NULL),
(33, 33, NULL, NULL, NULL, NULL),
(34, 35, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `Match`
--

CREATE TABLE `Match` (
  `idMatch` int(11) NOT NULL,
  `typeMatch` varchar(40) NOT NULL,
  `tour` int(11) NOT NULL,
  `idHoraire` int(11) NOT NULL,
  `idTerrain` int(11) NOT NULL,
  `idMatchSuivant` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Match`
--

INSERT INTO `Match` (`idMatch`, `typeMatch`, `tour`, `idHoraire`, `idTerrain`, `idMatchSuivant`) VALUES
(1, 'simple', 1, 1, 1, 3),
(2, 'simple', 1, 1, 2, 4),
(3, 'simple', 2, 2, 1, 5),
(4, 'simple', 2, 2, 2, 6),
(5, 'simple', 3, 3, 1, 7),
(6, 'simple', 3, 3, 2, 8),
(7, 'simple', 4, 4, 1, 9),
(8, 'simple', 4, 4, 2, 10),
(9, 'simple', 5, 5, 1, NULL),
(10, 'simple', 5, 5, 2, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `RamasseurBalles`
--

CREATE TABLE `RamasseurBalles` (
  `idRamasseur` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `dateNaissance` date NOT NULL,
  `nationalite` varchar(255) NOT NULL,
  `club` varchar(255) NOT NULL,
  `equipe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `RamasseurBalles`
--

INSERT INTO `RamasseurBalles` (`idRamasseur`, `nom`, `prenom`, `dateNaissance`, `nationalite`, `club`, `equipe`) VALUES
(1, 'Levy', 'Summer', '2022-06-16', 'Poland', 'clubB', 1),
(2, 'Curtis', 'Abraham', '2021-06-06', 'India', 'clubC', 1),
(3, 'Hamilton', 'Ivan', '2022-07-19', 'New Zealand', 'clubH', 1),
(4, 'Hebert', 'Ariana', '2022-12-30', 'Germany', 'clubC', 1),
(5, 'Thompson', 'Vladimir', '2021-12-05', 'Indonesia', 'clubC', 1),
(6, 'Sparks', 'Noble', '2021-04-20', 'Turkey', 'clubF', 1),
(7, 'Murray', 'Marsden', '2021-04-13', 'Germany', 'clubD', 1),
(8, 'Mcdaniel', 'Quamar', '2022-02-20', 'Germany', 'clubA', 1),
(9, 'Delaney', 'Dalton', '2022-07-13', 'Germany', 'clubF', 1),
(10, 'Frederick', 'Edan', '2021-07-23', 'Sweden', 'clubD', 1),
(11, 'Bernard', 'Addison', '2022-05-10', 'Turkey', 'clubF', 1),
(12, 'Larsen', 'Cameron', '2021-02-21', 'Australia', 'clubD', 1),
(13, 'Sweet', 'Avram', '2021-05-23', 'South Korea', 'clubD', 2),
(14, 'Mcguire', 'Ray', '2022-01-27', 'United States', 'clubG', 2),
(15, 'Roberson', 'Dean', '2023-01-07', 'Austria', 'clubB', 2),
(16, 'Short', 'Neve', '2021-01-19', 'India', 'clubH', 2),
(17, 'Mason', 'Bell', '2022-04-14', 'China', 'clubH', 2),
(18, 'Orr', 'Ramona', '2022-10-10', 'Austria', 'clubF', 2),
(19, 'Harrell', 'Justine', '2022-01-30', 'Belgium', 'clubG', 2),
(20, 'O\'connor', 'Heather', '2021-04-09', 'Australia', 'clubG', 2),
(21, 'Fitzgerald', 'Igor', '2021-12-11', 'Peru', 'clubF', 2),
(22, 'Jarvis', 'Allen', '2022-03-24', 'United Kingdom', 'clubE', 2),
(23, 'Mcleod', 'Connor', '2021-08-14', 'South Korea', 'clubE', 2),
(24, 'Wood', 'Maxine', '2021-06-01', 'South Korea', 'clubH', 2),
(25, 'Marshall', 'Desirae', '2021-03-28', 'Peru', 'clubF', 3),
(26, 'Robinson', 'Maggy', '2021-10-30', 'Australia', 'clubE', 3),
(27, 'Snider', 'Camilla', '2022-12-03', 'Russian Federation', 'clubA', 3),
(28, 'Fitzgerald', 'Coby', '2022-11-04', 'Pakistan', 'clubE', 3),
(29, 'Cox', 'Joseph', '2022-03-11', 'Peru', 'clubG', 3),
(30, 'Burnett', 'Lani', '2022-07-07', 'Canada', 'clubB', 3),
(31, 'Lewis', 'Hayes', '2022-06-17', 'Brazil', 'clubB', 3),
(32, 'Ross', 'Clio', '2022-11-19', 'United States', 'clubE', 3),
(33, 'Sellers', 'Kyra', '2021-09-16', 'United States', 'clubE', 3),
(34, 'Ramsey', 'Macaulay', '2022-10-27', 'Italy', 'clubG', 3),
(35, 'Perez', 'Keelie', '2022-08-19', 'Netherlands', 'clubH', 3),
(36, 'Holcomb', 'Frances', '2021-09-13', 'Indonesia', 'clubI', 3),
(37, 'Hebert', 'Rina', '2022-08-31', 'China', 'clubC', 4),
(38, 'Bowers', 'Demetria', '2021-12-06', 'Nigeria', 'clubB', 4),
(39, 'Mckay', 'Lillian', '2022-08-22', 'China', 'clubA', 4),
(40, 'Lawrence', 'Ulric', '2021-05-16', 'Vietnam', 'clubE', 4),
(41, 'Mccarthy', 'Abdul', '2021-04-10', 'Russian Federation', 'clubE', 4),
(42, 'Stuart', 'Evan', '2021-08-19', 'Peru', 'clubF', 4),
(43, 'Chase', 'Wyatt', '2021-03-20', 'Costa Rica', 'clubF', 4),
(44, 'Petty', 'Malachi', '2021-05-09', 'China', 'clubD', 4),
(45, 'Bonner', 'Ira', '2021-03-06', 'United States', 'clubB', 4),
(46, 'Gill', 'Carol', '2023-01-12', 'Spain', 'clubH', 4),
(47, 'Riley', 'Shafira', '2021-08-12', 'Mexico', 'clubD', 4),
(48, 'Castillo', 'Allen', '2021-12-16', 'United States', 'clubE', 4);

-- --------------------------------------------------------

--
-- Structure de la table `Terrain`
--

CREATE TABLE `Terrain` (
  `idTerrain` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `typeTerrain` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Terrain`
--

INSERT INTO `Terrain` (`idTerrain`, `nom`, `typeTerrain`) VALUES
(1, 'terrain1', 'principal'),
(2, 'terrain2', 'annexe'),
(3, 'terrain3', 'annexe'),
(4, 'terrain4', 'annexe'),
(5, 'terrain5', 'annexe');

-- --------------------------------------------------------

--
-- Structure de la table `User`
--

CREATE TABLE `User` (
  `username` varchar(20) NOT NULL,
  `password` varchar(128) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `User`
--

INSERT INTO `User` (`username`, `password`) VALUES
('staff', '23c4885e942fe6083ca000193338ac4be60e9a4f6fc9047977ba84637956805d76772045544f6cbd0b9b8ed2e0084c9e4ba1ff4ad1f95067527c55da569918bc');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Arbitre`
--
ALTER TABLE `Arbitre`
  ADD PRIMARY KEY (`idArbitre`);

--
-- Index pour la table `AutreVIP`
--
ALTER TABLE `AutreVIP`
  ADD PRIMARY KEY (`idAutreVIP`);

--
-- Index pour la table `Horaire`
--
ALTER TABLE `Horaire`
  ADD PRIMARY KEY (`idHoraire`);

--
-- Index pour la table `Interaction`
--
ALTER TABLE `Interaction`
  ADD PRIMARY KEY (`idInteraction`,`idFiche`);

--
-- Index pour la table `Joueur`
--
ALTER TABLE `Joueur`
  ADD PRIMARY KEY (`idJoueur`);

--
-- Index pour la table `ListeArbitre`
--
ALTER TABLE `ListeArbitre`
  ADD PRIMARY KEY (`idArbitre`,`idMatch`),
  ADD KEY `fk_liste_arbitre_match` (`idMatch`);

--
-- Index pour la table `ListeJoueurs`
--
ALTER TABLE `ListeJoueurs`
  ADD PRIMARY KEY (`idJoueur`,`idMatch`),
  ADD KEY `fk_liste_joueur_match` (`idMatch`);

--
-- Index pour la table `ListeRamasseurs`
--
ALTER TABLE `ListeRamasseurs`
  ADD PRIMARY KEY (`idRamasseur`,`idMatch`),
  ADD KEY `fk_liste_ramasseur_match` (`idMatch`);

--
-- Index pour la table `ListeVIP`
--
ALTER TABLE `ListeVIP`
  ADD PRIMARY KEY (`idFiche`),
  ADD KEY `fk_listevip_joueur` (`idJoueur`),
  ADD KEY `fk_listevip_arbitre` (`idArbitre`),
  ADD KEY `fk_listevip_ramasseur` (`idRamasseur`),
  ADD KEY `fk_listevip_autrevip` (`idAutreVIP`);

--
-- Index pour la table `Match`
--
ALTER TABLE `Match`
  ADD PRIMARY KEY (`idMatch`),
  ADD KEY `fk_match_horaire` (`idHoraire`),
  ADD KEY `fk_match_terrain` (`idTerrain`),
  ADD KEY `fk_match_fils` (`idMatchSuivant`);

--
-- Index pour la table `RamasseurBalles`
--
ALTER TABLE `RamasseurBalles`
  ADD PRIMARY KEY (`idRamasseur`);

--
-- Index pour la table `Terrain`
--
ALTER TABLE `Terrain`
  ADD PRIMARY KEY (`idTerrain`);

--
-- Index pour la table `User`
--
ALTER TABLE `User`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Arbitre`
--
ALTER TABLE `Arbitre`
  MODIFY `idArbitre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT pour la table `Horaire`
--
ALTER TABLE `Horaire`
  MODIFY `idHoraire` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT pour la table `Joueur`
--
ALTER TABLE `Joueur`
  MODIFY `idJoueur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT pour la table `ListeVIP`
--
ALTER TABLE `ListeVIP`
  MODIFY `idFiche` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT pour la table `Match`
--
ALTER TABLE `Match`
  MODIFY `idMatch` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT pour la table `RamasseurBalles`
--
ALTER TABLE `RamasseurBalles`
  MODIFY `idRamasseur` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=49;

--
-- AUTO_INCREMENT pour la table `Terrain`
--
ALTER TABLE `Terrain`
  MODIFY `idTerrain` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `ListeArbitre`
--
ALTER TABLE `ListeArbitre`
  ADD CONSTRAINT `fk_liste_arbitre_arbitre` FOREIGN KEY (`idArbitre`) REFERENCES `Arbitre` (`idArbitre`),
  ADD CONSTRAINT `fk_liste_arbitre_match` FOREIGN KEY (`idMatch`) REFERENCES `Match` (`idMatch`);

--
-- Contraintes pour la table `ListeJoueurs`
--
ALTER TABLE `ListeJoueurs`
  ADD CONSTRAINT `fk_liste_joueur_joueur` FOREIGN KEY (`idJoueur`) REFERENCES `Joueur` (`idJoueur`),
  ADD CONSTRAINT `fk_liste_joueur_match` FOREIGN KEY (`idMatch`) REFERENCES `Match` (`idMatch`);

--
-- Contraintes pour la table `ListeRamasseurs`
--
ALTER TABLE `ListeRamasseurs`
  ADD CONSTRAINT `fk_liste_ramasseur_match` FOREIGN KEY (`idMatch`) REFERENCES `Match` (`idMatch`),
  ADD CONSTRAINT `fk_liste_ramasseur_ramasseur` FOREIGN KEY (`idRamasseur`) REFERENCES `RamasseurBalles` (`idRamasseur`);

--
-- Contraintes pour la table `ListeVIP`
--
ALTER TABLE `ListeVIP`
  ADD CONSTRAINT `fk_listevip_arbitre` FOREIGN KEY (`idArbitre`) REFERENCES `Arbitre` (`idArbitre`),
  ADD CONSTRAINT `fk_listevip_autrevip` FOREIGN KEY (`idAutreVIP`) REFERENCES `AutreVIP` (`idAutreVIP`),
  ADD CONSTRAINT `fk_listevip_joueur` FOREIGN KEY (`idJoueur`) REFERENCES `Joueur` (`idJoueur`),
  ADD CONSTRAINT `fk_listevip_ramasseur` FOREIGN KEY (`idRamasseur`) REFERENCES `RamasseurBalles` (`idRamasseur`);

--
-- Contraintes pour la table `Match`
--
ALTER TABLE `Match`
  ADD CONSTRAINT `fk_match_fils` FOREIGN KEY (`idMatchSuivant`) REFERENCES `Match` (`idMatch`),
  ADD CONSTRAINT `fk_match_horaire` FOREIGN KEY (`idHoraire`) REFERENCES `Horaire` (`idHoraire`),
  ADD CONSTRAINT `fk_match_terrain` FOREIGN KEY (`idTerrain`) REFERENCES `Terrain` (`idTerrain`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
