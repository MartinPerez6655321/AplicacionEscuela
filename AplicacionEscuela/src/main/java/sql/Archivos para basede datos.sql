---------DROPS------------

DROP TABLE alumnos_table;

DROP TABLE cursos_table;

------------CREATES------------

CREATE DATABASE eesn28;

CREATE TABLE cursos_table(
id int,
anio char(7) PRIMARY KEY,
turno varchar(6)
);

CREATE TABLE `alumnos_table`
(
	`id` INT(64) NOT NULL AUTO_INCREMENT,
	`nombre` varchar(25),
	`apellido` varchar(25),
	`DNI` varchar(15),
	`FechaNacimiento` date,
	`responsable` varchar(50),
	`telefono` varchar(15),
	`curso` char(7),
	FOREIGN KEY (`curso`) REFERENCES cursos_table (anio),
	PRIMARY KEY (`id`)
);

------INSERTS------------

INSERT INTO cursos_table (id, anio, turno)
VALUES
(1,'1ro1ra','Mañana'),
(2,'2do1ra','Mañana'),
(3,'3ro1ra','Mañana'),
(4,'4to1ra','Mañana'),
(5,'5to1ra','Mañana'),
(6,'6to1ra','Mañana'),
(7,'1ro2da','Tarde'),
(8,'2do2da','Tarde'),
(9,'3ro2da','Tarde'),
(10,'4to2da','Tarde'),
(11,'5to2da','Tarde'),
(12,'6to2da','Tarde');


-----SELECTS----------

SELECT * FROM alumnos_table ORDER BY id;
SELECT * FROM cursos_table ORDER BY id;