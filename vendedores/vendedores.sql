-- Ejercicio 11: base de datos y tabla vendedores
-- Ejecutar en phpMyAdmin (XAMPP) o en MySQL Workbench antes de correr el Main

CREATE DATABASE IF NOT EXISTS vendedores_db;
USE vendedores_db;

CREATE TABLE IF NOT EXISTS vendedores (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni INT NOT NULL,
    rubro VARCHAR(50) NOT NULL,
    actual BOOLEAN NOT NULL
);
