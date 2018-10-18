CREATE DATABASE SISTEMUSERS;

USE SISTEMUSERS;

CREATE TABLE usuarios (
	idusuario int NOT NULL AUTO_INCREMENT,
	nombres varchar(100) NOT NULL,
	apellidos varchar(100) NOT NULL,
	nacionalidad varchar(100) NULL,
	idtipodocumento int NOT NULL,
	identificacion varchar(100) NOT NULL,
	email varchar(100) NULL,
	telefono varchar(100) NULL,
	observaciones varchar(200) NULL,
	fechacreacion datetime NOT NULL,
	idusuariocreacion int NOT NULL,
	fechamodificacion datetime NULL,
	idusuariomodificacion int NULL,
	estado int NOT NULL,
	primary key(idusuario)	
);