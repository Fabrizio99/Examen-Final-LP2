-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 05-12-2019 a las 16:18:54
-- Versión del servidor: 5.7.17-log
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `untels`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `cod_al` int(11) NOT NULL,
  `nom_alum` varchar(30) NOT NULL,
  `cod_esp` int(11) NOT NULL,
  `foto` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`cod_al`, `nom_alum`, `cod_esp`, `foto`) VALUES
(1, 'José Avarez Rojas', 5, '1.jpg'),
(2, 'Ana Ruiz Penas', 4, '2.jpg'),
(3, 'María Ruiz Alva', 5, '3.jpg'),
(4, 'Angel Ponce Díaz', 1, '5.jpg'),
(5, 'Silvia Diaz Ramos', 2, '6.jpg'),
(6, 'Pedro Moya Salas', 3, '7.jpg'),
(7, 'Fiorela Masias Rojas', 2, '8.jpg'),
(8, 'Jorge Lopez Tello', 2, '9.jpg'),
(9, 'Celia Olivares Jeri', 2, '10.jpg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especialidad`
--

CREATE TABLE `especialidad` (
  `cod_esp` int(11) NOT NULL,
  `nom_esp` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `especialidad`
--

INSERT INTO `especialidad` (`cod_esp`, `nom_esp`) VALUES
(1, 'Ing. de Sistemas'),
(2, 'Ing. Ambiental'),
(3, 'Administración de Empresas'),
(4, 'Ingeniería Electrónica'),
(5, 'Ingeniería Mecánica'),
(10, 'Ing.InformÃ¡tica');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`cod_al`);

--
-- Indices de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  ADD PRIMARY KEY (`cod_esp`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `cod_al` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `especialidad`
--
ALTER TABLE `especialidad`
  MODIFY `cod_esp` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
