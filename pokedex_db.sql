CREATE DATABASE pokedex_db;
USE pokedex_db;

CREATE TABLE Usuario(
id INT PRIMARY KEY NOT NULL ,
nombre_completo VARCHAR(100),
tipo_de_identificacion VARCHAR(10),
numero_de_identificacion VARCHAR(20),
fecha_de_nacimiento DATE,
correo_electronico VARCHAR(100) UNIQUE,
pass VARCHAR(100),
pais_de_domicilio VARCHAR(100),
ciudad_de_domicilio VARCHAR(100)
);

CREATE TABLE Mochila(
id INT AUTO_INCREMENT PRIMARY KEY,
pokemon_id INT,
nombre VARCHAR(100),
imagen VARCHAR(200),
tipo VARCHAR(50),
experiencia_base INT,
es_favorito BOOLEAN DEFAULT FALSE,
usuario_id INT,
FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);