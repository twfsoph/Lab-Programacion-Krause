-- TP13: base de datos y tabla empleados
-- Ejecutar en phpMyAdmin (XAMPP) o en MySQL Workbench antes de correr el Main

CREATE DATABASE IF NOT EXISTS globant_db;
USE globant_db;

CREATE TABLE IF NOT EXISTS empleados (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    dni INT NOT NULL,
    cargo VARCHAR(50) NOT NULL,
    salario DOUBLE NOT NULL,
    activo BOOLEAN NOT NULL DEFAULT TRUE
);

-- Para volver a probar el Main desde cero (la baja es logica, el empleado queda en la tabla):
-- TRUNCATE TABLE empleados;
