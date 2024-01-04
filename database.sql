-- Database: reservations

-- DROP DATABASE IF EXISTS reservations;

CREATE DATABASE reservations
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Mexico.1252'
    LC_CTYPE = 'Spanish_Mexico.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	 
	CREATE TABLE RESERVA(id_reserva INT PRIMARY KEY NOT NULL,
						 id_cliente INT,
						 id_habitacion INT,
						 fechaInicio DATE,
						 fechaFin DATE,
						 total decimal(8,2),
						 estado VARCHAR(100)
						);
	CREATE TABLE HABITACION(id_habitacion INT PRIMARY KEY NOT NULL,
						 numero INT,
						 tipo VARCHAR(100),
						 descripcion VARCHAR(100),
						 capacidad INT,
						 total decimal(8,2),
						 precioXNoche decimal(8,2)
						);
CREATE TABLE CLIENTE(id_cliente INT PRIMARY KEY NOT NULL,
						 email VARCHAR(100),
						 nombre VARCHAR(100),
						 apellido VARCHAR(100),
						 telefono VARCHAR(100),
						 fechaRegistro DATE
						);
ALTER TABLE RESERVA 
   ADD CONSTRAINT fk_cli
   FOREIGN KEY (id_cliente) 
   REFERENCES CLIENTE (id_cliente);
ALTER TABLE RESERVA 
   ADD CONSTRAINT fk_hab
   FOREIGN KEY (id_habitacion) 
   REFERENCES HABITACION(id_habitacion);