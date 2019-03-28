-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 28 Mars 2019 à 10:40
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `poussin-consommation`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie_consommation`
--

CREATE TABLE IF NOT EXISTS `categorie_consommation` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `type_consommation` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9w3f98hvkghhnbj2tetm6ujii` (`type_consommation`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `categorie_consommation`
--

INSERT INTO `categorie_consommation` (`id`, `libelle`, `reference`, `type_consommation`) VALUES
(1, 'H1N1', 'h1', 1),
(2, 'HKL', 'hk-1', 2),
(3, 'DLF', 'df-1', 1),
(4, 'QSD', 'qs-1', 2);

-- --------------------------------------------------------

--
-- Structure de la table `categorie_pricing`
--

CREATE TABLE IF NOT EXISTS `categorie_pricing` (
  `id` bigint(20) NOT NULL,
  `date_max` date DEFAULT NULL,
  `date_min` date DEFAULT NULL,
  `prix` double NOT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `categorie_consommation` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1jrcbxn63cxrcgsflkjh1ej6o` (`categorie_consommation`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `categorie_pricing`
--

INSERT INTO `categorie_pricing` (`id`, `date_max`, `date_min`, `prix`, `reference`, `categorie_consommation`) VALUES
(1, '2019-04-20', '2019-02-20', 200, 'C2', 1);

-- --------------------------------------------------------

--
-- Structure de la table `consommation`
--

CREATE TABLE IF NOT EXISTS `consommation` (
  `id` bigint(20) NOT NULL,
  `annee` int(11) DEFAULT NULL,
  `date_consommation` date DEFAULT NULL,
  `mois` int(11) DEFAULT NULL,
  `nbre_female` int(11) DEFAULT NULL,
  `nbre_male` int(11) DEFAULT NULL,
  `qte` int(11) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `reference_firme` varchar(255) DEFAULT NULL,
  `semaine` int(11) DEFAULT NULL,
  `categorie_consommation` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlgnp6x6ofy6lihknmdgj1p64b` (`categorie_consommation`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `consommation`
--

INSERT INTO `consommation` (`id`, `annee`, `date_consommation`, `mois`, `nbre_female`, `nbre_male`, `qte`, `reference`, `reference_firme`, `semaine`, `categorie_consommation`) VALUES
(1, 2019, '2019-02-10', 2, 7, 11, 15, 'C4', 'F1', 6, 1),
(2, 2019, '2019-02-10', 2, 1, 10, 10, 'C3', 'F1', 6, 1),
(3, 2019, '2019-03-01', 3, 1, 10, 10, 'C2', 'F3', 9, 2),
(7, 2019, '2019-03-11', 3, 2, 9, 20, 'C1', 'F3', 11, 2),
(8, 2019, '2019-03-01', 3, 12, 9, 30, 'C6', 'F3', 9, 2),
(9, 2019, '2019-03-01', 3, 12, 9, 10, 'C5', 'F2', 9, 1),
(10, 2019, '2019-03-01', 3, 12, 5, 5, 'C7', 'F2', 9, 1),
(4, 2018, '2018-03-25', 3, 5, 8, 12, 'C10', 'F3', 13, 2),
(5, 2019, '2019-06-22', 6, 2, 3, 20, 'C9', 'F6', 25, 2);

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(6),
(6),
(6),
(6);

-- --------------------------------------------------------

--
-- Structure de la table `type_consommation`
--

CREATE TABLE IF NOT EXISTS `type_consommation` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `type_consommation`
--

INSERT INTO `type_consommation` (`id`, `libelle`, `reference`) VALUES
(1, 'Medicament', 'medic-1'),
(2, 'Fourniture', 'fourni-2');
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
