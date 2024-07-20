DROP DATABASE IF EXISTS juanro;

CREATE DATABASE juanro;

USE juanro;

DELIMITER //
CREATE FUNCTION get_age(birth_y DATE)
RETURNS INT
BEGIN
    DECLARE edad INT;
    SET edad = TIMESTAMPDIFF(YEAR, fecha_nacimiento,CURDATE());
    RETURN edad;
END //
DELIMITER ;

CREATE TABLE cities (
    id_city INT,
    name VARCHAR(255),
    CONSTRAINT pk_id_city PRIMARY KEY (id_city)
);

CREATE TABLE id_types (
    id_type SMALLINT,
    name VARCHAR(255),
    CONSTRAINT pk_id_tpye PRIMARY KEY (id_type)
);

CREATE TABLE customers (
    id VARCHAR(20) NOT NULL,
    id_type SMALLINT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    birth_date DATE,
    register_date TIMESTAMP DEFAULT NOW(),
    age SMALLINT DEFAULT get_age(register_date),
    id_city INT,
    district VARCHAR(50),
    CONSTRAINT pk_customer PRIMARY KEY (id),
    CONSTRAINT fk_id_type_customer FOREIGN KEY (id_type)
    REFERENCES id_types(id_type),
    CONSTRAINT fk_id_city_customer FOREIGN KEY (id_city)
    REFERENCES cities(id_city)
);
    
