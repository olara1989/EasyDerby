-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-03-2017 a las 04:13:58
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gallos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gallo`
--

CREATE TABLE `gallo` (
  `id` int(11) NOT NULL,
  `anillo` int(8) NOT NULL,
  `peso` int(8) NOT NULL,
  `partido` int(11) NOT NULL,
  `torneo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partidos`
--

CREATE TABLE `partidos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `origen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `partidos`
--

INSERT INTO `partidos` (`id`, `nombre`, `origen`) VALUES
(1, 'Los chagos', 'Pinos Zac'),
(3, 'Los plebes', 'La noria de san pablo'),
(4, 'Animales', 'Pendencia'),
(5, 'La noria', 'La noria'),
(6, 'Los juanes', 'Salinas'),
(7, 'Los  juanotes', 'Estancia'),
(8, 'El juego', 'Pinos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partidos_torneo`
--

CREATE TABLE `partidos_torneo` (
  `partido` int(11) DEFAULT NULL,
  `torneo` int(11) DEFAULT NULL,
  `puntos` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelea`
--

CREATE TABLE `pelea` (
  `id` int(11) NOT NULL,
  `numero` tinyint(2) NOT NULL,
  `resultado` tinyint(1) NOT NULL,
  `observaciones` text NOT NULL,
  `rojo` int(11) NOT NULL,
  `verde` int(11) NOT NULL,
  `ronda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `restricciones`
--

CREATE TABLE `restricciones` (
  `torneo` int(11) NOT NULL,
  `partido1` int(11) NOT NULL,
  `partido2` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `torneo`
--

CREATE TABLE `torneo` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `fecha` date NOT NULL,
  `ubicacion` varchar(45) DEFAULT NULL,
  `organizador` varchar(50) DEFAULT NULL,
  `num_gallos` tinyint(2) NOT NULL,
  `tolerancia` smallint(5) NOT NULL,
  `peso_minimo` smallint(5) NOT NULL,
  `peso_maximo` smallint(5) NOT NULL,
  `victoria` tinyint(1) NOT NULL,
  `empate` tinyint(1) NOT NULL,
  `derrota` tinyint(1) NOT NULL,
  `activo` int(11) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `gallo`
--
ALTER TABLE `gallo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `pelea` (`partido`),
  ADD KEY `torneo` (`torneo`);

--
-- Indices de la tabla `partidos`
--
ALTER TABLE `partidos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `partidos_torneo`
--
ALTER TABLE `partidos_torneo`
  ADD KEY `partido` (`partido`),
  ADD KEY `pelea` (`torneo`) USING BTREE;

--
-- Indices de la tabla `pelea`
--
ALTER TABLE `pelea`
  ADD PRIMARY KEY (`id`),
  ADD KEY `verde` (`verde`),
  ADD KEY `rojo` (`rojo`);

--
-- Indices de la tabla `restricciones`
--
ALTER TABLE `restricciones`
  ADD KEY `torneo` (`torneo`),
  ADD KEY `partido1` (`partido1`),
  ADD KEY `partido2` (`partido2`);

--
-- Indices de la tabla `torneo`
--
ALTER TABLE `torneo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `gallo`
--
ALTER TABLE `gallo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `partidos`
--
ALTER TABLE `partidos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `pelea`
--
ALTER TABLE `pelea`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `torneo`
--
ALTER TABLE `torneo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `gallo`
--
ALTER TABLE `gallo`
  ADD CONSTRAINT `gallo_ibfk_1` FOREIGN KEY (`partido`) REFERENCES `partidos` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `gallo_ibfk_2` FOREIGN KEY (`torneo`) REFERENCES `torneo` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `partidos_torneo`
--
ALTER TABLE `partidos_torneo`
  ADD CONSTRAINT `partidos_torneo_ibfk_1` FOREIGN KEY (`torneo`) REFERENCES `torneo` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `partidos_torneo_ibfk_2` FOREIGN KEY (`partido`) REFERENCES `partidos` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `pelea`
--
ALTER TABLE `pelea`
  ADD CONSTRAINT `pelea_ibfk_2` FOREIGN KEY (`verde`) REFERENCES `gallo` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `pelea_ibfk_3` FOREIGN KEY (`rojo`) REFERENCES `gallo` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `restricciones`
--
ALTER TABLE `restricciones`
  ADD CONSTRAINT `restricciones_ibfk_1` FOREIGN KEY (`torneo`) REFERENCES `torneo` (`id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `restricciones_ibfk_2` FOREIGN KEY (`partido1`) REFERENCES `partidos` (`id`),
  ADD CONSTRAINT `restricciones_ibfk_3` FOREIGN KEY (`partido2`) REFERENCES `partidos` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
