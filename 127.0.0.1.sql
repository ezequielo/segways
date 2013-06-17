-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 17-06-2013 a las 20:04:19
-- Versión del servidor: 5.5.27
-- Versión de PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `banco`
--
CREATE DATABASE `banco` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `banco`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `pk_cliente` int(11) NOT NULL AUTO_INCREMENT,
  `pk_usuario` int(11) NOT NULL,
  `pk_sucursal` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido_1` varchar(45) NOT NULL,
  `apellido_2` varchar(45) NOT NULL,
  `ident` varchar(45) NOT NULL,
  `direccion` varchar(150) NOT NULL,
  `localidad` varchar(100) NOT NULL,
  `provincia` varchar(100) NOT NULL,
  `cp` varchar(20) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `pais` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`pk_cliente`),
  KEY `r_clientes_usuarios_idx` (`pk_usuario`),
  KEY `r_clientes_sucursales_idx` (`pk_sucursal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE IF NOT EXISTS `cuentas` (
  `pk_cuenta` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_entidad` varchar(10) NOT NULL DEFAULT '2100',
  `codigo_sucursal` varchar(10) NOT NULL,
  `digito_control` varchar(10) NOT NULL,
  `numero_cuenta` varchar(10) NOT NULL,
  `saldo` varchar(10) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`pk_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas_has_clientes`
--

CREATE TABLE IF NOT EXISTS `cuentas_has_clientes` (
  `cuentas_pk_cuenta` int(11) NOT NULL,
  `clientes_pk_cliente` int(11) NOT NULL,
  `tipo_cliente` varchar(45) NOT NULL,
  PRIMARY KEY (`cuentas_pk_cuenta`,`clientes_pk_cliente`),
  KEY `fk_cuentas_has_clientes_clientes1_idx` (`clientes_pk_cliente`),
  KEY `fk_cuentas_has_clientes_cuentas1_idx` (`cuentas_pk_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `domiciliaciones`
--

CREATE TABLE IF NOT EXISTS `domiciliaciones` (
  `pk_domiciliacion` int(11) NOT NULL AUTO_INCREMENT,
  `pk_cuenta` int(11) NOT NULL,
  `entidad` varchar(45) NOT NULL,
  `bloqueado` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`pk_domiciliacion`),
  KEY `r_domiciliaciones_cuentas_idx` (`pk_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimientos`
--

CREATE TABLE IF NOT EXISTS `movimientos` (
  `pk_movimiento` int(11) NOT NULL AUTO_INCREMENT,
  `pk_cuenta` int(11) NOT NULL,
  `importe` varchar(45) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `tipo_operacion` varchar(45) NOT NULL,
  `a_favor` tinyint(4) NOT NULL,
  PRIMARY KEY (`pk_movimiento`),
  KEY `r_operaciones_cuenta_idx` (`pk_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personales`
--

CREATE TABLE IF NOT EXISTS `personales` (
  `pk_personal` int(11) NOT NULL AUTO_INCREMENT,
  `pk_usuario` int(11) NOT NULL,
  `pk_sucursal` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `ident` varchar(45) NOT NULL,
  `apellido_2` varchar(45) NOT NULL,
  `apellido_1` varchar(45) NOT NULL,
  PRIMARY KEY (`pk_personal`),
  KEY `r_empleados_usuarios_idx` (`pk_usuario`),
  KEY `r_empleados_sucursales_idx` (`pk_sucursal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamos`
--

CREATE TABLE IF NOT EXISTS `prestamos` (
  `pk_prestamo` int(11) NOT NULL AUTO_INCREMENT,
  `pk_cuenta` int(11) NOT NULL,
  `cantidad` decimal(10,0) NOT NULL,
  `cantidad_pagada` decimal(10,0) NOT NULL DEFAULT '0',
  `cuota_mensual` decimal(10,0) NOT NULL,
  `meses_amortizar` varchar(10) NOT NULL,
  PRIMARY KEY (`pk_prestamo`),
  KEY `r_prestamos_cuentas_idx` (`pk_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguros`
--

CREATE TABLE IF NOT EXISTS `seguros` (
  `pk_seguro` int(11) NOT NULL AUTO_INCREMENT,
  `pk_cuenta` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `importe` decimal(10,0) NOT NULL,
  `meses` varchar(10) NOT NULL,
  PRIMARY KEY (`pk_seguro`),
  KEY `r_seguros_cuentas_idx` (`pk_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursales`
--

CREATE TABLE IF NOT EXISTS `sucursales` (
  `pk_sucursal` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `cp` varchar(20) NOT NULL,
  `localidad` varchar(100) NOT NULL,
  `provincia` varchar(100) NOT NULL,
  `codigo_sucursal` varchar(10) NOT NULL,
  `longitud` varchar(45) NOT NULL,
  `latitud` varchar(45) NOT NULL,
  PRIMARY KEY (`pk_sucursal`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tarjetas`
--

CREATE TABLE IF NOT EXISTS `tarjetas` (
  `pk_tarjeta` int(11) NOT NULL AUTO_INCREMENT,
  `pk_cuenta` int(11) NOT NULL,
  `numero` varchar(50) NOT NULL,
  `codigo_seguridad` varchar(10) NOT NULL,
  `fecha_caducidad` varchar(20) NOT NULL,
  `pin` varchar(100) NOT NULL,
  `tipo` varchar(100) NOT NULL,
  PRIMARY KEY (`pk_tarjeta`),
  KEY `r_tarjetas_cuentas_idx` (`pk_cuenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `pk_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `perfil` varchar(45) NOT NULL,
  PRIMARY KEY (`pk_usuario`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`pk_usuario`, `usuario`, `password`, `perfil`) VALUES
(1, 'admin', 'admin', 'admin');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `r_clientes_usuarios` FOREIGN KEY (`pk_usuario`) REFERENCES `usuarios` (`pk_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `r_clientes_sucursales` FOREIGN KEY (`pk_sucursal`) REFERENCES `sucursales` (`pk_sucursal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `cuentas_has_clientes`
--
ALTER TABLE `cuentas_has_clientes`
  ADD CONSTRAINT `fk_cuentas_has_clientes_cuentas1` FOREIGN KEY (`cuentas_pk_cuenta`) REFERENCES `cuentas` (`pk_cuenta`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_cuentas_has_clientes_clientes1` FOREIGN KEY (`clientes_pk_cliente`) REFERENCES `clientes` (`pk_cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `domiciliaciones`
--
ALTER TABLE `domiciliaciones`
  ADD CONSTRAINT `r_domiciliaciones_cuentas` FOREIGN KEY (`pk_cuenta`) REFERENCES `cuentas` (`pk_cuenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `movimientos`
--
ALTER TABLE `movimientos`
  ADD CONSTRAINT `r_operaciones_cuenta` FOREIGN KEY (`pk_cuenta`) REFERENCES `cuentas` (`pk_cuenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `personales`
--
ALTER TABLE `personales`
  ADD CONSTRAINT `r_empleados_usuarios` FOREIGN KEY (`pk_usuario`) REFERENCES `usuarios` (`pk_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `r_empleados_sucursales` FOREIGN KEY (`pk_sucursal`) REFERENCES `sucursales` (`pk_sucursal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `prestamos`
--
ALTER TABLE `prestamos`
  ADD CONSTRAINT `r_prestamos_cuentas` FOREIGN KEY (`pk_cuenta`) REFERENCES `cuentas` (`pk_cuenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `seguros`
--
ALTER TABLE `seguros`
  ADD CONSTRAINT `r_seguros_cuentas` FOREIGN KEY (`pk_cuenta`) REFERENCES `cuentas` (`pk_cuenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `tarjetas`
--
ALTER TABLE `tarjetas`
  ADD CONSTRAINT `r_tarjetas_cuentas` FOREIGN KEY (`pk_cuenta`) REFERENCES `cuentas` (`pk_cuenta`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
