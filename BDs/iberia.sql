-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2022 a las 20:16:09
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `iberia`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avion`
--

CREATE TABLE `avion` (
  `id` int(11) NOT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `id_base` int(11) DEFAULT NULL,
  `idVuelo` int(11) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `avion`
--

INSERT INTO `avion` (`id`, `codigo`, `id_base`, `idVuelo`, `tipo`) VALUES
(1, '0', NULL, 101, 'Magmar'),
(2, '1', NULL, 103, 'Kakuna'),
(3, '2', 1, NULL, 'Bulbasaur'),
(4, '3', NULL, 102, 'Weezing'),
(5, '4', NULL, NULL, 'Venomoth'),
(6, '5', NULL, NULL, 'Oddish'),
(7, '6', NULL, NULL, 'Raichu'),
(8, '7', NULL, NULL, 'Ditto'),
(9, '8', NULL, NULL, 'Sandslash'),
(10, '9', NULL, NULL, 'Chansey'),
(11, '10', NULL, NULL, 'Dragonite'),
(12, '11', NULL, NULL, 'Dewgong'),
(13, '12', NULL, NULL, 'Kabuto'),
(14, '13', NULL, NULL, 'Seaking'),
(15, '14', NULL, NULL, 'Exeggcute'),
(16, '15', NULL, NULL, 'Dugtrio'),
(17, '16', NULL, NULL, 'Ivysaur'),
(18, '17', NULL, NULL, 'Nidoqueen'),
(19, '18', NULL, NULL, 'Articuno'),
(20, '19', NULL, NULL, 'Onix'),
(21, '20', NULL, NULL, 'Starmie'),
(22, '21', NULL, NULL, 'Persian'),
(23, '22', NULL, NULL, 'Clefable'),
(24, '23', NULL, NULL, 'Paras'),
(25, '24', NULL, NULL, 'Arbok'),
(26, '25', NULL, NULL, 'Gyarados'),
(27, '26', NULL, NULL, 'Machop'),
(28, '27', NULL, NULL, 'Dodrio'),
(29, '28', NULL, NULL, 'Venomoth'),
(30, '29', NULL, NULL, 'Ivysaur'),
(31, '30', NULL, NULL, 'Ponyta'),
(32, '31', NULL, NULL, 'Paras'),
(33, '32', NULL, NULL, 'Chansey'),
(34, '33', NULL, NULL, 'Ponyta'),
(35, '34', NULL, NULL, 'Machop'),
(36, '35', NULL, NULL, 'Wigglytuff'),
(37, '36', NULL, NULL, 'Poliwrath'),
(38, '37', NULL, NULL, 'Vulpix'),
(39, '38', NULL, NULL, 'Eevee'),
(40, '39', NULL, NULL, 'Arcanine'),
(41, '40', NULL, NULL, 'Machop'),
(42, '41', NULL, NULL, 'Ivysaur'),
(43, '42', NULL, NULL, 'Electabuzz'),
(44, '43', NULL, NULL, 'Squirtle'),
(45, '44', NULL, NULL, 'Primeape'),
(46, '45', NULL, NULL, 'Mr. Mime'),
(47, '46', NULL, NULL, 'Kangaskhan'),
(48, '47', NULL, NULL, 'Magnemite'),
(49, '48', NULL, NULL, 'Pidgeot'),
(50, '49', NULL, NULL, 'Machoke'),
(51, '50', NULL, NULL, 'Seel'),
(52, '51', NULL, NULL, 'Machoke'),
(53, '52', NULL, NULL, 'Hypno'),
(54, '53', NULL, NULL, 'Alakazam'),
(55, '54', NULL, NULL, 'Jynx'),
(56, '55', NULL, NULL, 'Wigglytuff'),
(57, '56', NULL, NULL, 'Starmie'),
(58, '57', NULL, NULL, 'Muk'),
(59, '58', NULL, NULL, 'Mankey'),
(60, '59', NULL, NULL, 'Ditto'),
(61, '60', NULL, NULL, 'Raticate'),
(62, '61', NULL, NULL, 'Machop'),
(63, '62', NULL, NULL, 'Paras'),
(64, '63', NULL, NULL, 'Growlithe'),
(65, '64', NULL, NULL, 'Omastar'),
(66, '65', NULL, NULL, 'Kabutops'),
(67, '66', NULL, NULL, 'Vaporeon'),
(68, '67', NULL, NULL, 'Jynx'),
(69, '68', NULL, NULL, 'Krabby'),
(70, '69', NULL, NULL, 'Growlithe'),
(71, '70', NULL, NULL, 'Golem'),
(72, '71', NULL, NULL, 'Weedle'),
(73, '72', NULL, NULL, 'Flareon'),
(74, '73', NULL, NULL, 'Nidoking'),
(75, '74', NULL, NULL, 'Muk'),
(76, '75', NULL, NULL, 'Vaporeon'),
(77, '76', NULL, NULL, 'Articuno'),
(78, '77', NULL, NULL, 'Dewgong'),
(79, '78', NULL, NULL, 'Sandshrew'),
(80, '79', NULL, NULL, 'Bulbasaur'),
(81, '80', NULL, NULL, 'Blastoise'),
(82, '81', NULL, NULL, 'Nidorina'),
(83, '82', NULL, NULL, 'Raichu'),
(84, '83', NULL, NULL, 'Arcanine'),
(85, '84', NULL, NULL, 'Hitmonlee'),
(86, '85', NULL, NULL, 'Muk'),
(87, '86', NULL, NULL, 'Spearow'),
(88, '87', NULL, NULL, 'Hitmonlee'),
(89, '88', NULL, NULL, 'Magmar'),
(90, '89', NULL, NULL, 'Metapod'),
(91, '90', NULL, NULL, 'Geodude'),
(92, '91', NULL, NULL, 'Koffing'),
(93, '92', NULL, NULL, 'Ninetales'),
(94, '93', NULL, NULL, 'Krabby'),
(95, '94', NULL, NULL, 'Vaporeon'),
(96, '95', NULL, NULL, 'Raichu'),
(97, '96', NULL, NULL, 'Psyduck'),
(98, '97', NULL, NULL, 'Nidorino'),
(99, '98', NULL, NULL, 'Charizard'),
(100, '99', NULL, NULL, 'Kadabra');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `base`
--

CREATE TABLE `base` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `base`
--

INSERT INTO `base` (`id`, `nombre`) VALUES
(1, 'FAMW'),
(2, 'BIIS'),
(3, 'BGGD'),
(4, 'GCHI'),
(5, 'FAPH'),
(6, 'SBSP'),
(7, 'NFFA'),
(8, 'ZBAR'),
(9, 'FAMG'),
(10, 'WAAB');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembro`
--

CREATE TABLE `miembro` (
  `id` int(11) NOT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `miembro`
--

INSERT INTO `miembro` (`id`, `codigo`, `nombre`) VALUES
(1, '0', 'Scooter'),
(2, '1', 'Maggie'),
(3, '2', 'Sasha'),
(4, '3', 'Harvey'),
(5, '4', 'Max'),
(6, '5', 'Harvey'),
(7, '6', 'Dixie'),
(8, '7', 'Cookie'),
(9, '8', 'Ginger'),
(10, '9', 'Zoey'),
(11, '10', 'Milo'),
(12, '11', 'Lady'),
(13, '12', 'Lily'),
(14, '13', 'Daisy'),
(15, '14', 'Sparky'),
(16, '15', 'Lexi'),
(17, '16', 'Princess'),
(18, '17', 'Rosie'),
(19, '18', 'Bo'),
(20, '19', 'Scooter'),
(21, '20', 'Sandy'),
(22, '21', 'Misty'),
(23, '22', 'Sugar'),
(24, '23', 'Toby'),
(25, '24', 'Sammy'),
(26, '25', 'Scooter'),
(27, '26', 'Bruno'),
(28, '27', 'Blue'),
(29, '28', 'Missy'),
(30, '29', 'Buster'),
(31, '30', 'Sam'),
(32, '31', 'Tank'),
(33, '32', 'Penny'),
(34, '33', 'Tank'),
(35, '34', 'Bubba'),
(36, '35', 'Sugar'),
(37, '36', 'Sparky'),
(38, '37', 'Spike'),
(39, '38', 'Rusty'),
(40, '39', 'Lilly'),
(41, '40', 'Lady'),
(42, '41', 'Sam'),
(43, '42', 'Coco'),
(44, '43', 'Lexi'),
(45, '44', 'Rex'),
(46, '45', 'Jasper'),
(47, '46', 'Snickers'),
(48, '47', 'Princess'),
(49, '48', 'Tyson'),
(50, '49', 'Milo'),
(51, '50', 'Casey'),
(52, '51', 'Precious'),
(53, '52', 'Penny'),
(54, '53', 'Oreo'),
(55, '54', 'Gracie'),
(56, '55', 'Sparky'),
(57, '56', 'Pepper'),
(58, '57', 'Murphy'),
(59, '58', 'Lucky'),
(60, '59', 'Jasmine'),
(61, '60', 'Chico'),
(62, '61', 'Penny'),
(63, '62', 'Blue'),
(64, '63', 'Brutus'),
(65, '64', 'Tyson'),
(66, '65', 'Buster'),
(67, '66', 'Precious'),
(68, '67', 'Oreo'),
(69, '68', 'Penny'),
(70, '69', 'Lucky'),
(71, '70', 'Chance'),
(72, '71', 'Toby'),
(73, '72', 'Lucky'),
(74, '73', 'Patches'),
(75, '74', 'Diamond'),
(76, '75', 'Honey'),
(77, '76', 'Roxie'),
(78, '77', 'Harley'),
(79, '78', 'Zeus'),
(80, '79', 'Zoe'),
(81, '80', 'Buddy'),
(82, '81', 'Sassy'),
(83, '82', 'Rocky'),
(84, '83', 'Zoey'),
(85, '84', 'Cody'),
(86, '85', 'Bailey'),
(87, '86', 'Cody'),
(88, '87', 'Shelby'),
(89, '88', 'Precious'),
(90, '89', 'Annie'),
(91, '90', 'Jake'),
(92, '91', 'Harley'),
(93, '92', 'Patches'),
(94, '93', 'Zoey'),
(95, '94', 'Shelby'),
(96, '95', 'Penny'),
(97, '96', 'Honey'),
(98, '97', 'Maggie'),
(99, '98', 'Buster'),
(100, '99', 'Gizmo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piloto`
--

CREATE TABLE `piloto` (
  `id` int(11) NOT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `horas_de_vuelo` int(11) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `piloto`
--

INSERT INTO `piloto` (`id`, `codigo`, `horas_de_vuelo`, `nombre`) VALUES
(1, '0', 100, 'Joy'),
(2, '1', 100, 'Hugo'),
(3, '2', 100, 'Thomas'),
(4, '3', 100, 'Constance'),
(5, '4', 100, 'Annie'),
(6, '5', 100, 'Tyrone'),
(7, '6', 100, 'Molly'),
(8, '7', 100, 'Norma'),
(9, '8', 100, 'Royce'),
(10, '9', 100, 'Michelle'),
(11, '10', 100, 'Ruth'),
(12, '11', 100, 'Ruby'),
(13, '12', 100, 'Joseph'),
(14, '13', 100, 'Ken'),
(15, '14', 100, 'Charlie'),
(16, '15', 100, 'Clayton'),
(17, '16', 100, 'Raymond'),
(18, '17', 100, 'James'),
(19, '18', 100, 'Howard'),
(20, '19', 100, 'Janet'),
(21, '20', 100, 'Romana'),
(22, '21', 100, 'Christina'),
(23, '22', 100, 'Lawanda'),
(24, '23', 100, 'Cathy'),
(25, '24', 100, 'Aida'),
(26, '25', 100, 'Dwight'),
(27, '26', 100, 'Brenda'),
(28, '27', 100, 'June'),
(29, '28', 100, 'Ethel'),
(30, '29', 100, 'Dorothy'),
(31, '30', 100, 'Roger'),
(32, '31', 100, 'Linda'),
(33, '32', 100, 'Ryan'),
(34, '33', 100, 'Billie'),
(35, '34', 100, 'Willie'),
(36, '35', 100, 'Martha'),
(37, '36', 100, 'Ann'),
(38, '37', 100, 'Todd'),
(39, '38', 100, 'Guadalupe'),
(40, '39', 100, 'Pearl'),
(41, '40', 100, 'Philip'),
(42, '41', 100, 'Rebecca'),
(43, '42', 100, 'Lois'),
(44, '43', 100, 'Nancy'),
(45, '44', 100, 'Todd'),
(46, '45', 100, 'Clifton'),
(47, '46', 100, 'Pearlie'),
(48, '47', 100, 'Susie'),
(49, '48', 100, 'Jason'),
(50, '49', 100, 'Nicole'),
(51, '50', 100, 'Martha'),
(52, '51', 100, 'Gerald'),
(53, '52', 100, 'Jennifer'),
(54, '53', 100, 'Kacey'),
(55, '54', 100, 'Carol'),
(56, '55', 100, 'Barbara'),
(57, '56', 100, 'Melissa'),
(58, '57', 100, 'Florence'),
(59, '58', 100, 'Gregory'),
(60, '59', 100, 'Antonio'),
(61, '60', 100, 'Scott'),
(62, '61', 100, 'Michelle'),
(63, '62', 100, 'Chris'),
(64, '63', 100, 'Susanne'),
(65, '64', 100, 'Hugh'),
(66, '65', 100, 'Scott'),
(67, '66', 100, 'Amanda'),
(68, '67', 100, 'Perry'),
(69, '68', 100, 'Richard'),
(70, '69', 100, 'Melanie'),
(71, '70', 100, 'Henry'),
(72, '71', 100, 'Mary'),
(73, '72', 100, 'Eula'),
(74, '73', 100, 'Nathaniel'),
(75, '74', 100, 'Maria'),
(76, '75', 100, 'Sandie'),
(77, '76', 100, 'Nina'),
(78, '77', 100, 'Anastasia'),
(79, '78', 100, 'Gregory'),
(80, '79', 100, 'Irene'),
(81, '80', 100, 'James'),
(82, '81', 100, 'James'),
(83, '82', 100, 'Deloris'),
(84, '83', 100, 'Sara'),
(85, '84', 100, 'Tyra'),
(86, '85', 100, 'Henry'),
(87, '86', 100, 'Richard'),
(88, '87', 100, 'Denise'),
(89, '88', 100, 'Randy'),
(90, '89', 100, 'Lisa'),
(91, '90', 100, 'Willie'),
(92, '91', 100, 'Traci'),
(93, '92', 100, 'Willis'),
(94, '93', 100, 'Latasha'),
(95, '94', 100, 'Laura'),
(96, '95', 100, 'Carol'),
(97, '96', 100, 'Nick'),
(98, '97', 100, 'Marc'),
(99, '98', 100, 'Sam'),
(100, '99', 100, 'Jesse');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

CREATE TABLE `vuelo` (
  `id` int(11) NOT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `id_piloto` int(11) DEFAULT NULL,
  `numero_vuelo` varchar(255) DEFAULT NULL,
  `origen` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vuelo`
--

INSERT INTO `vuelo` (`id`, `destino`, `hora`, `id_piloto`, `numero_vuelo`, `origen`) VALUES
(1, 'Avarua', '12:12:12', 0, 'ABC', 'Asmara'),
(2, 'Funafuti', '12:12:12', 1, 'ABC', 'Bishkek'),
(3, 'Luanda', '12:12:12', 2, 'ABC', 'Gaborone'),
(4, 'Nicosia', '12:12:12', 3, 'ABC', 'Djibouti'),
(5, 'The Valley', '12:12:12', 4, 'ABC', 'Bamako'),
(6, 'Noumea', '12:12:12', 5, 'ABC', 'Mbabane'),
(7, 'Dili', '12:12:12', 6, 'ABC', 'Antananarivo'),
(8, 'Malabo', '12:12:12', 7, 'ABC', 'Conakry'),
(9, 'Honiara', '12:12:12', 8, 'ABC', 'London'),
(10, 'Islamabad', '12:12:12', 9, 'ABC', 'Minsk'),
(11, 'El-Aai√∫n', '12:12:12', 10, 'ABC', 'Gibraltar'),
(12, 'Bogota', '12:12:12', 11, 'ABC', 'Saint Peter Port'),
(13, 'Colombo', '12:12:12', 12, 'ABC', 'Hargeisa'),
(14, 'Astana', '12:12:12', 13, 'ABC', 'Ljubljana'),
(15, 'Hanoi', '12:12:12', 14, 'ABC', 'Monaco'),
(16, 'Pyongyang', '12:12:12', 15, 'ABC', 'Washington'),
(17, 'Freetown', '12:12:12', 16, 'ABC', 'Hamilton'),
(18, 'Palikir', '12:12:12', 17, 'ABC', 'King Edward Point'),
(19, 'Thimphu', '12:12:12', 18, 'ABC', 'Jakarta'),
(20, 'Lima', '12:12:12', 19, 'ABC', 'Jamestown'),
(21, 'Oslo', '12:12:12', 20, 'ABC', 'Male'),
(22, 'King Edward Point', '12:12:12', 21, 'ABC', 'Dili'),
(23, 'Diego Garcia', '12:12:12', 22, 'ABC', 'Hagatna'),
(24, 'Reykjavik', '12:12:12', 23, 'ABC', 'Beijing'),
(25, 'Castries', '12:12:12', 24, 'ABC', 'Algiers'),
(26, 'Atafu', '12:12:12', 25, 'ABC', 'Lome'),
(27, 'Antananarivo', '12:12:12', 26, 'ABC', 'Budapest'),
(28, 'Chisinau', '12:12:12', 27, 'ABC', 'Sanaa'),
(29, 'Cairo', '12:12:12', 28, 'ABC', 'Nairobi'),
(30, 'Islamabad', '12:12:12', 29, 'ABC', 'Kyiv'),
(31, 'La Paz', '12:12:12', 30, 'ABC', 'Willemstad'),
(32, 'N\'Djamena', '12:12:12', 31, 'ABC', 'Accra'),
(33, 'Roseau', '12:12:12', 32, 'ABC', 'Hagatna'),
(34, 'Kingston', '12:12:12', 33, 'ABC', 'Suva'),
(35, 'Canberra', '12:12:12', 34, 'ABC', 'Bujumbura'),
(36, 'Praia', '12:12:12', 35, 'ABC', 'Bandar Seri Begawan'),
(37, 'Road Town', '12:12:12', 36, 'ABC', 'The Settlement'),
(38, 'Kingston', '12:12:12', 37, 'ABC', 'Valletta'),
(39, 'Dili', '12:12:12', 38, 'ABC', 'Bandar Seri Begawan'),
(40, 'Guatemala City', '12:12:12', 39, 'ABC', 'Havana'),
(41, 'Montevideo', '12:12:12', 40, 'ABC', 'Minsk'),
(42, 'Juba', '12:12:12', 41, 'ABC', 'Stanley'),
(43, 'Papeete', '12:12:12', 42, 'ABC', 'Tunis'),
(44, 'Warsaw', '12:12:12', 43, 'ABC', 'Bamako'),
(45, 'Jakarta', '12:12:12', 44, 'ABC', 'Tegucigalpa'),
(46, 'Mexico City', '12:12:12', 45, 'ABC', 'Porto-Novo'),
(47, 'Port of Spain', '12:12:12', 46, 'ABC', 'Port of Spain'),
(48, 'Reykjavik', '12:12:12', 47, 'ABC', 'Asuncion'),
(49, 'Hamilton', '12:12:12', 48, 'ABC', 'Mogadishu'),
(50, 'Rangoon', '12:12:12', 49, 'ABC', 'Hamilton'),
(51, 'Saint George\'s', '12:12:12', 50, 'ABC', 'Douglas'),
(52, 'Mogadishu', '12:12:12', 51, 'ABC', 'Mata-Utu'),
(53, 'Victoria', '12:12:12', 52, 'ABC', 'Athens'),
(54, 'Moscow', '12:12:12', 53, 'ABC', 'Mexico City'),
(55, 'Kigali', '12:12:12', 54, 'ABC', 'Pyongyang'),
(56, 'Sarajevo', '12:12:12', 55, 'ABC', 'Dushanbe'),
(57, 'Dushanbe', '12:12:12', 56, 'ABC', 'Bamako'),
(58, 'Luanda', '12:12:12', 57, 'ABC', 'Juba'),
(59, 'North Nicosia', '12:12:12', 58, 'ABC', 'Kigali'),
(60, 'Chisinau', '12:12:12', 59, 'ABC', 'Hamilton'),
(61, 'Mata-Utu', '12:12:12', 60, 'ABC', 'Male'),
(62, 'Washington', '12:12:12', 61, 'ABC', 'Paris'),
(63, 'Tarawa', '12:12:12', 62, 'ABC', 'Vilnius'),
(64, 'Lome', '12:12:12', 63, 'ABC', 'Tehran'),
(65, 'Montevideo', '12:12:12', 64, 'ABC', 'Hamilton'),
(66, 'Dar es Salaam', '12:12:12', 65, 'ABC', 'Adamstown'),
(67, 'Tehran', '12:12:12', 66, 'ABC', 'Marigot'),
(68, 'Douglas', '12:12:12', 67, 'ABC', 'Santo Domingo'),
(69, 'Oranjestad', '12:12:12', 68, 'ABC', 'Athens'),
(70, 'Dar es Salaam', '12:12:12', 69, 'ABC', 'Lima'),
(71, 'Maseru', '12:12:12', 70, 'ABC', 'West Island'),
(72, 'Malabo', '12:12:12', 71, 'ABC', 'Papeete'),
(73, 'Manama', '12:12:12', 72, 'ABC', 'Mogadishu'),
(74, 'Melekeok', '12:12:12', 73, 'ABC', 'Reykjavik'),
(75, 'Saint John\'s', '12:12:12', 74, 'ABC', 'Suva'),
(76, 'Noumea', '12:12:12', 75, 'ABC', 'Bridgetown'),
(77, 'Saint Peter Port', '12:12:12', 76, 'ABC', 'Lusaka'),
(78, 'Managua', '12:12:12', 77, 'ABC', 'Yerevan'),
(79, 'Atafu', '12:12:12', 78, 'ABC', 'Abu Dhabi'),
(80, 'Lusaka', '12:12:12', 79, 'ABC', 'Freetown'),
(81, 'Baku', '12:12:12', 80, 'ABC', 'Ottawa'),
(82, 'Melekeok', '12:12:12', 81, 'ABC', 'Djibouti'),
(83, 'Montevideo', '12:12:12', 82, 'ABC', 'Guatemala City'),
(84, 'Majuro', '12:12:12', 83, 'ABC', 'Monrovia'),
(85, 'Moscow', '12:12:12', 84, 'ABC', 'Porto-Novo'),
(86, 'Montevideo', '12:12:12', 85, 'ABC', 'Port-au-Prince'),
(87, 'Tirana', '12:12:12', 86, 'ABC', 'Dublin'),
(88, 'Maputo', '12:12:12', 87, 'ABC', 'Noumea'),
(89, 'Algiers', '12:12:12', 88, 'ABC', 'Dublin'),
(90, 'Jerusalem', '12:12:12', 89, 'ABC', 'Port Louis'),
(91, 'Torshavn', '12:12:12', 90, 'ABC', 'Port Moresby'),
(92, 'Banjul', '12:12:12', 91, 'ABC', 'Conakry'),
(93, 'Sarajevo', '12:12:12', 92, 'ABC', 'Willemstad'),
(94, 'Singapore', '12:12:12', 93, 'ABC', 'Reykjavik'),
(95, 'Sanaa', '12:12:12', 94, 'ABC', 'Managua'),
(96, 'London', '12:12:12', 95, 'ABC', 'Bridgetown'),
(97, 'Buenos Aires', '12:12:12', 96, 'ABC', 'Pristina'),
(98, 'Bamako', '12:12:12', 97, 'ABC', 'Damascus'),
(99, 'Addis Ababa', '12:12:12', 98, 'ABC', 'Andorra la Vella'),
(100, 'Astana', '12:12:12', 99, 'ABC', 'Avarua'),
(101, 'Roma', '20:12:29', 1, 'MA-RO', 'Madrid'),
(102, 'Londres', '20:12:29', 1, 'NY-LO', 'Nueva York'),
(103, 'Tokio', '20:12:29', 1, 'SE-TO', 'Seúl');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `avion`
--
ALTER TABLE `avion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `base`
--
ALTER TABLE `base`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `miembro`
--
ALTER TABLE `miembro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `piloto`
--
ALTER TABLE `piloto`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `avion`
--
ALTER TABLE `avion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `base`
--
ALTER TABLE `base`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `miembro`
--
ALTER TABLE `miembro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `piloto`
--
ALTER TABLE `piloto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=101;

--
-- AUTO_INCREMENT de la tabla `vuelo`
--
ALTER TABLE `vuelo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=104;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
