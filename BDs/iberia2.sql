-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-06-2022 a las 15:52:48
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
  `id_base` int(11) DEFAULT NULL,
  `id_vuelo` int(11) DEFAULT NULL,
  `codigo` int(50) NOT NULL,
  `tipo` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `avion`
--

INSERT INTO `avion` (`id`, `id_base`, `id_vuelo`, `codigo`, `tipo`) VALUES
(1, NULL, NULL, 0, 'Boeing'),
(2, NULL, NULL, 1, 'Boeing'),
(3, NULL, NULL, 2, 'Boeing'),
(4, NULL, NULL, 3, 'Boeing'),
(5, NULL, NULL, 4, 'Boeing'),
(6, NULL, NULL, 5, 'Boeing'),
(7, NULL, NULL, 6, 'Boeing'),
(8, NULL, NULL, 7, 'Boeing'),
(9, NULL, NULL, 8, 'Boeing'),
(10, NULL, NULL, 9, 'Boeing'),
(11, NULL, NULL, 10, 'Boeing'),
(12, NULL, NULL, 11, 'Boeing'),
(13, NULL, NULL, 12, 'Boeing'),
(14, NULL, NULL, 13, 'Boeing'),
(15, NULL, NULL, 14, 'Boeing'),
(16, NULL, NULL, 15, 'Boeing'),
(17, NULL, NULL, 16, 'Boeing'),
(18, NULL, NULL, 17, 'Boeing'),
(19, NULL, NULL, 18, 'Boeing'),
(20, NULL, NULL, 19, 'Boeing'),
(21, NULL, NULL, 20, 'Boeing'),
(22, NULL, NULL, 21, 'Boeing'),
(23, NULL, NULL, 22, 'Boeing'),
(24, NULL, NULL, 23, 'Boeing'),
(25, NULL, NULL, 24, 'Boeing'),
(26, NULL, NULL, 25, 'Boeing'),
(27, NULL, NULL, 26, 'Boeing'),
(28, NULL, NULL, 27, 'Boeing'),
(29, NULL, NULL, 28, 'Boeing'),
(30, NULL, NULL, 29, 'Boeing'),
(31, NULL, NULL, 30, 'Boeing'),
(32, NULL, NULL, 31, 'Boeing'),
(33, NULL, NULL, 32, 'Boeing'),
(34, NULL, NULL, 33, 'Boeing'),
(35, NULL, NULL, 34, 'Boeing'),
(36, NULL, NULL, 35, 'Boeing'),
(37, NULL, NULL, 36, 'Boeing'),
(38, NULL, NULL, 37, 'Boeing'),
(39, NULL, NULL, 38, 'Boeing'),
(40, NULL, NULL, 39, 'Boeing'),
(41, NULL, NULL, 40, 'Boeing'),
(42, NULL, NULL, 41, 'Boeing'),
(43, NULL, NULL, 42, 'Boeing'),
(44, NULL, NULL, 43, 'Boeing'),
(45, NULL, NULL, 44, 'Boeing'),
(46, NULL, NULL, 45, 'Boeing'),
(47, NULL, NULL, 46, 'Boeing'),
(48, NULL, NULL, 47, 'Boeing'),
(49, NULL, NULL, 48, 'Boeing'),
(50, NULL, NULL, 49, 'Boeing'),
(51, NULL, NULL, 50, 'Boeing'),
(52, NULL, NULL, 51, 'Boeing'),
(53, NULL, NULL, 52, 'Boeing'),
(54, NULL, NULL, 53, 'Boeing'),
(55, NULL, NULL, 54, 'Boeing'),
(56, NULL, NULL, 55, 'Boeing'),
(57, NULL, NULL, 56, 'Boeing'),
(58, NULL, NULL, 57, 'Boeing'),
(59, NULL, NULL, 58, 'Boeing'),
(60, NULL, NULL, 59, 'Boeing'),
(61, NULL, NULL, 60, 'Boeing'),
(62, NULL, NULL, 61, 'Boeing'),
(63, NULL, NULL, 62, 'Boeing'),
(64, NULL, NULL, 63, 'Boeing'),
(65, NULL, NULL, 64, 'Boeing'),
(66, NULL, NULL, 65, 'Boeing'),
(67, NULL, NULL, 66, 'Boeing'),
(68, NULL, NULL, 67, 'Boeing'),
(69, NULL, NULL, 68, 'Boeing'),
(70, NULL, NULL, 69, 'Boeing'),
(71, NULL, NULL, 70, 'Boeing'),
(72, NULL, NULL, 71, 'Boeing'),
(73, NULL, NULL, 72, 'Boeing'),
(74, NULL, NULL, 73, 'Boeing'),
(75, NULL, NULL, 74, 'Boeing'),
(76, NULL, NULL, 75, 'Boeing'),
(77, NULL, NULL, 76, 'Boeing'),
(78, NULL, NULL, 77, 'Boeing'),
(79, NULL, NULL, 78, 'Boeing'),
(80, NULL, NULL, 79, 'Boeing'),
(81, NULL, NULL, 80, 'Boeing'),
(82, NULL, NULL, 81, 'Boeing'),
(83, NULL, NULL, 82, 'Boeing'),
(84, NULL, NULL, 83, 'Boeing'),
(85, NULL, NULL, 84, 'Boeing'),
(86, NULL, NULL, 85, 'Boeing'),
(87, NULL, NULL, 86, 'Boeing'),
(88, NULL, NULL, 87, 'Boeing'),
(89, NULL, NULL, 88, 'Boeing'),
(90, NULL, NULL, 89, 'Boeing'),
(91, NULL, NULL, 90, 'Boeing'),
(92, NULL, NULL, 91, 'Boeing'),
(93, NULL, NULL, 92, 'Boeing'),
(94, NULL, NULL, 93, 'Boeing'),
(95, NULL, NULL, 94, 'Boeing'),
(96, NULL, NULL, 95, 'Boeing'),
(97, NULL, NULL, 96, 'Boeing'),
(98, NULL, NULL, 97, 'Boeing'),
(99, NULL, NULL, 98, 'Boeing'),
(100, NULL, NULL, 99, 'Boeing');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `base`
--

CREATE TABLE `base` (
  `id` int(11) NOT NULL,
  `nombre` char(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `miembro`
--

CREATE TABLE `miembro` (
  `id` int(11) NOT NULL,
  `codigo` char(50) NOT NULL,
  `nombre` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `miembro`
--

INSERT INTO `miembro` (`id`, `codigo`, `nombre`) VALUES
(1, '0', '0'),
(2, '1', '1'),
(3, '2', '2'),
(4, '3', '3'),
(5, '4', '4'),
(6, '5', '5'),
(7, '6', '6'),
(8, '7', '7'),
(9, '8', '8'),
(10, '9', '9'),
(11, '10', '10'),
(12, '11', '11'),
(13, '12', '12'),
(14, '13', '13'),
(15, '14', '14'),
(16, '15', '15'),
(17, '16', '16'),
(18, '17', '17'),
(19, '18', '18'),
(20, '19', '19'),
(21, '20', '20'),
(22, '21', '21'),
(23, '22', '22'),
(24, '23', '23'),
(25, '24', '24'),
(26, '25', '25'),
(27, '26', '26'),
(28, '27', '27'),
(29, '28', '28'),
(30, '29', '29'),
(31, '30', '30'),
(32, '31', '31'),
(33, '32', '32'),
(34, '33', '33'),
(35, '34', '34'),
(36, '35', '35'),
(37, '36', '36'),
(38, '37', '37'),
(39, '38', '38'),
(40, '39', '39'),
(41, '40', '40'),
(42, '41', '41'),
(43, '42', '42'),
(44, '43', '43'),
(45, '44', '44'),
(46, '45', '45'),
(47, '46', '46'),
(48, '47', '47'),
(49, '48', '48'),
(50, '49', '49'),
(51, '50', '50'),
(52, '51', '51'),
(53, '52', '52'),
(54, '53', '53'),
(55, '54', '54'),
(56, '55', '55'),
(57, '56', '56'),
(58, '57', '57'),
(59, '58', '58'),
(60, '59', '59'),
(61, '60', '60'),
(62, '61', '61'),
(63, '62', '62'),
(64, '63', '63'),
(65, '64', '64'),
(66, '65', '65'),
(67, '66', '66'),
(68, '67', '67'),
(69, '68', '68'),
(70, '69', '69'),
(71, '70', '70'),
(72, '71', '71'),
(73, '72', '72'),
(74, '73', '73'),
(75, '74', '74'),
(76, '75', '75'),
(77, '76', '76'),
(78, '77', '77'),
(79, '78', '78'),
(80, '79', '79'),
(81, '80', '80'),
(82, '81', '81'),
(83, '82', '82'),
(84, '83', '83'),
(85, '84', '84'),
(86, '85', '85'),
(87, '86', '86'),
(88, '87', '87'),
(89, '88', '88'),
(90, '89', '89'),
(91, '90', '90'),
(92, '91', '91'),
(93, '92', '92'),
(94, '93', '93'),
(95, '94', '94'),
(96, '95', '95'),
(97, '96', '96'),
(98, '97', '97'),
(99, '98', '98'),
(100, '99', '99');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `piloto`
--

CREATE TABLE `piloto` (
  `id` int(11) NOT NULL,
  `codigo` char(50) NOT NULL,
  `nombre` char(50) NOT NULL,
  `horas_de_vuelo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `piloto`
--

INSERT INTO `piloto` (`id`, `codigo`, `nombre`, `horas_de_vuelo`) VALUES
(1, '0', 'Tammy', 100),
(2, '1', 'Anna', 100),
(3, '2', 'Joan', 100),
(4, '3', 'Phyllis', 100),
(5, '4', 'Darryl', 100),
(6, '5', 'Sharon', 100),
(7, '6', 'Mabel', 100),
(8, '7', 'Roger', 100),
(9, '8', 'Susan', 100),
(10, '9', 'Matthew', 100),
(11, '10', 'Katheryn', 100),
(12, '11', 'Peggy', 100),
(13, '12', 'Betty', 100),
(14, '13', 'Frances', 100),
(15, '14', 'Annie', 100),
(16, '15', 'Donna', 100),
(17, '16', 'Tom', 100),
(18, '17', 'Matthew', 100),
(19, '18', 'Freddie', 100),
(20, '19', 'Judith', 100),
(21, '20', 'Dwight', 100),
(22, '21', 'Linda', 100),
(23, '22', 'Perry', 100),
(24, '23', 'Lori', 100),
(25, '24', 'Debra', 100),
(26, '25', 'Jessica', 100),
(27, '26', 'Rebecca', 100),
(28, '27', 'Michael', 100),
(29, '28', 'Blanche', 100),
(30, '29', 'Patrina', 100),
(31, '30', 'Robert', 100),
(32, '31', 'Pamela', 100),
(33, '32', 'Merle', 100),
(34, '33', 'Jake', 100),
(35, '34', 'Christopher', 100),
(36, '35', 'Cameron', 100),
(37, '36', 'Natalie', 100),
(38, '37', 'Terrell', 100),
(39, '38', 'Nina', 100),
(40, '39', 'Sade', 100),
(41, '40', 'Anita', 100),
(42, '41', 'Dennis', 100),
(43, '42', 'Jennifer', 100),
(44, '43', 'Martha', 100),
(45, '44', 'Nicholas', 100),
(46, '45', 'David', 100),
(47, '46', 'William', 100),
(48, '47', 'Barbara', 100),
(49, '48', 'Howard', 100),
(50, '49', 'Robert', 100),
(51, '50', 'Shawn', 100),
(52, '51', 'Sadie', 100),
(53, '52', 'Lee', 100),
(54, '53', 'Willie', 100),
(55, '54', 'Emma', 100),
(56, '55', 'Michael', 100),
(57, '56', 'Belinda', 100),
(58, '57', 'John', 100),
(59, '58', 'Frederick', 100),
(60, '59', 'Alfreda', 100),
(61, '60', 'Maria', 100),
(62, '61', 'Lilian', 100),
(63, '62', 'Muriel', 100),
(64, '63', 'Thomas', 100),
(65, '64', 'Patricia', 100),
(66, '65', 'Patricia', 100),
(67, '66', 'Larry', 100),
(68, '67', 'Lauren', 100),
(69, '68', 'Gary', 100),
(70, '69', 'Betty', 100),
(71, '70', 'Jeanette', 100),
(72, '71', 'Charles', 100),
(73, '72', 'Garrett', 100),
(74, '73', 'Mary', 100),
(75, '74', 'Mickey', 100),
(76, '75', 'Norman', 100),
(77, '76', 'Cindy', 100),
(78, '77', 'Jose', 100),
(79, '78', 'Jannette', 100),
(80, '79', 'Sarah', 100),
(81, '80', 'Dawn', 100),
(82, '81', 'Sam', 100),
(83, '82', 'David', 100),
(84, '83', 'Lindsay', 100),
(85, '84', 'Timothy', 100),
(86, '85', 'Elaine', 100),
(87, '86', 'Jesse', 100),
(88, '87', 'Connie', 100),
(89, '88', 'Robert', 100),
(90, '89', 'Donald', 100),
(91, '90', 'Walter', 100),
(92, '91', 'Michael', 100),
(93, '92', 'Alton', 100),
(94, '93', 'Brandy', 100),
(95, '94', 'Gregory', 100),
(96, '95', 'Luke', 100),
(97, '96', 'Lillian', 100),
(98, '97', 'Kelly', 100),
(99, '98', 'Ann', 100),
(100, '99', 'Kirk', 100);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo`
--

CREATE TABLE `vuelo` (
  `id` int(11) NOT NULL,
  `id_piloto` int(11) NOT NULL,
  `id_avion` int(11) NOT NULL,
  `origen` char(50) NOT NULL,
  `destino` char(50) NOT NULL,
  `hora` time NOT NULL,
  `nombre_vuelo` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vuelo_miembro`
--

CREATE TABLE `vuelo_miembro` (
  `id_miembro` int(11) NOT NULL,
  `id_vuelo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `avion`
--
ALTER TABLE `avion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_base` (`id_base`),
  ADD KEY `id_vuelo` (`id_vuelo`);

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
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_piloto` (`id_piloto`),
  ADD KEY `id_avion` (`id_avion`);

--
-- Indices de la tabla `vuelo_miembro`
--
ALTER TABLE `vuelo_miembro`
  ADD PRIMARY KEY (`id_miembro`,`id_vuelo`) USING BTREE,
  ADD KEY `id_vuelo` (`id_vuelo`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `avion`
--
ALTER TABLE `avion`
  ADD CONSTRAINT `avion_ibfk_1` FOREIGN KEY (`id_base`) REFERENCES `base` (`id`),
  ADD CONSTRAINT `avion_ibfk_2` FOREIGN KEY (`id_vuelo`) REFERENCES `vuelo` (`id`);

--
-- Filtros para la tabla `vuelo`
--
ALTER TABLE `vuelo`
  ADD CONSTRAINT `vuelo_ibfk_1` FOREIGN KEY (`id_piloto`) REFERENCES `piloto` (`id`),
  ADD CONSTRAINT `vuelo_ibfk_2` FOREIGN KEY (`id_avion`) REFERENCES `avion` (`id`);

--
-- Filtros para la tabla `vuelo_miembro`
--
ALTER TABLE `vuelo_miembro`
  ADD CONSTRAINT `vuelo_miembro_ibfk_1` FOREIGN KEY (`id_miembro`) REFERENCES `miembro` (`id`),
  ADD CONSTRAINT `vuelo_miembro_ibfk_2` FOREIGN KEY (`id_vuelo`) REFERENCES `vuelo` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
