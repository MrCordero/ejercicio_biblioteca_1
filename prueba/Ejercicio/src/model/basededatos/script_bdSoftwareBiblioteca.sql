CREATE DATABASE bdSoftwareBiblioteca;

USE bdSoftwareBiblioteca;

CREATE TABLE usuario(
    id INT AUTO_INCREMENT,
    nombre VARCHAR (100),
    run VARCHAR(21),
    edad INT,
    PRIMARY KEY (id),
    UNIQUE (run)
);



CREATE TABLE libro(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(100),
    editorial VARCHAR (50),
    anio_lanzamiento INT,
    precio INT,
    stock INT,
    PRIMARY KEY (id)
);



-- /*-------SELECTS------------*/
-- 
-- SELECT * FROM usuario;
-- SELECT * FROM libro;
-- /*-------SELECTS------------*/
-- 
-- /*-------DELETE------------*/
-- DELETE FROM usuario;
-- DELETE FROM libro;
-- /*-------DELETE------------*/
-- 
-- 
-- /*-------DROP------------*/
-- DROP TABLE usuario;
-- DROP TABLE libro;
-- DROP DATABASE bdSoftwareBiblioteca;
-- /*-------DROP------------*/


