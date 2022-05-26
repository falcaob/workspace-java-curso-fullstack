-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-01-2020 a las 13:05:06
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `banco`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `id_gestor` int(11) NOT NULL,
  `usuario` char(20) NOT NULL,
  `password` char(64) NOT NULL,
  `correo` char(50) NOT NULL,
  `saldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id`, `id_gestor`, `usuario`, `password`, `correo`, `saldo`) VALUES
(1, 1, 'cliente1', '1bafb98e682b29bed687cd94740b3fa8bc965cc4a779e6168f19a942ad780f75', 'cliente1@mail.com', 200),
(2, 2, 'cliente2', '1e60eb49740cf585af2cde1cdc2dd32d255e9ba863f238a22e326399cc3522f4', 'cliente2@mail.com', 300),
(3, 3, 'cliente3', 'ef13f8b581aa2890db41594f7fdae77c34a13c63cd283c5258ce6085848deccd', 'cliente3@mail.com', 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gestor`
--

CREATE TABLE `gestor` (
  `id` int(11) NOT NULL,
  `usuario` char(20) NOT NULL,
  `password` char(64) NOT NULL,
  `correo` char(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `gestor`
--

INSERT INTO `gestor` (`id`, `usuario`, `password`, `correo`) VALUES
(1, 'gestor1', 'd94d9ca1462655945362f71cdd0bbb31e4033e50462bf50a35f745b7b43eea84', 'gestor1@mail.com'),
(2, 'gestor2', '9c8ba50caab64d3420fdcd349e8795313a2b0bf56a0ffb40c156be4ea34b0824', 'gestor2@mail.com'),
(3, 'gestor3', '69168f34c967372d3b297568d673e6558747ff28b83858af2c2866efe4779ac0', 'gestor3@mail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensaje`
--

CREATE TABLE `mensaje` (
  `id` int(11) NOT NULL,
  `id_origen` int(11) NOT NULL,
  `id_destino` int(11) NOT NULL,
  `texto` char(140) NOT NULL,
  `fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `id` int(11) NOT NULL,
  `nombre` char(20) NOT NULL,
  `comision` double NOT NULL,
  `meses` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo_relacion`
--

CREATE TABLE `prestamo_relacion` (
  `id_prestamo` int(11) NOT NULL,
  `id_cliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `transferencia`
--

CREATE TABLE `transferencia` (
  `id` int(11) NOT NULL,
  `id_ordenante` int(11) NOT NULL,
  `id_beneficiario` int(11) NOT NULL,
  `importe` double NOT NULL,
  `concepto` varchar(40) NOT NULL,
  `fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_gestor` (`id_gestor`);

--
-- Indices de la tabla `gestor`
--
ALTER TABLE `gestor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `mensaje`
--
ALTER TABLE `mensaje`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_destino` (`id_destino`),
  ADD KEY `id_origen` (`id_origen`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `prestamo_relacion`
--
ALTER TABLE `prestamo_relacion`
  ADD KEY `id_cliente` (`id_cliente`),
  ADD KEY `id_prestamo` (`id_prestamo`);

--
-- Indices de la tabla `transferencia`
--
ALTER TABLE `transferencia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_beneficiario` (`id_beneficiario`),
  ADD KEY `id_ordenante` (`id_ordenante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `gestor`
--
ALTER TABLE `gestor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=82;

--
-- AUTO_INCREMENT de la tabla `mensaje`
--
ALTER TABLE `mensaje`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `transferencia`
--
ALTER TABLE `transferencia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`id_gestor`) REFERENCES `gestor` (`id`);

--
-- Filtros para la tabla `mensaje`
--
ALTER TABLE `mensaje`
  ADD CONSTRAINT `mensaje_ibfk_1` FOREIGN KEY (`id_destino`) REFERENCES `gestor` (`id`),
  ADD CONSTRAINT `mensaje_ibfk_2` FOREIGN KEY (`id_origen`) REFERENCES `gestor` (`id`);

--
-- Filtros para la tabla `prestamo_relacion`
--
ALTER TABLE `prestamo_relacion`
  ADD CONSTRAINT `prestamo_relacion_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `prestamo_relacion_ibfk_2` FOREIGN KEY (`id_prestamo`) REFERENCES `prestamo` (`id`);

--
-- Filtros para la tabla `transferencia`
--
ALTER TABLE `transferencia`
  ADD CONSTRAINT `transferencia_ibfk_1` FOREIGN KEY (`id_beneficiario`) REFERENCES `cliente` (`id`),
  ADD CONSTRAINT `transferencia_ibfk_2` FOREIGN KEY (`id_ordenante`) REFERENCES `cliente` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
