DROP DATABASE IF EXISTS test;
CREATE DATABASE test;

USE test;

CREATE TABLE IF NOT EXISTS Proveedor (
	id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(100),
    telefono VARCHAR(12)
);

CREATE TABLE IF NOT EXISTS Producto (
	id INT  AUTO_INCREMENT NOT NULL PRIMARY KEY,
    codigoBarras INT NOT NULL,
    nombre VARCHAR(50),
    precio DECIMAL(10,2),
    descripcion VARCHAR(100),
	idProveedor INT NOT NULL,
    FOREIGN KEY (idProveedor) REFERENCES Proveedor(id)
);

INSERT INTO Proveedor (nombre, direccion, telefono) VALUES ("CBC","Avenida Petapa", "22098399"); 
INSERT INTO Producto (nombre, codigoBarras, precio, descripcion, idProveedor) VALUES ("Pepsi","123", 5,"Pepsi fria", 1); 
INSERT INTO Producto (nombre, codigoBarras, precio, descripcion, idProveedor) VALUES ("Pepsi Light","123", 5,"Pepsi sin azucar", 1); 
INSERT INTO Producto (nombre, codigoBarras, precio, descripcion, idProveedor) VALUES ("Te lipton de limon", "123", 5,"Te frio", 1); 

SELECT * FROM Proveedor;
SELECT I.id, I.nombre, P.nombre AS proveedor FROM Producto AS I JOIN Proveedor AS P ON P.id;

DELETE FROM Producto WHERE id = 3;

SELECT I.id, I.nombre, P.nombre AS proveedor FROM Producto AS I JOIN Proveedor AS P ON P.id;

INSERT INTO Producto (nombre, codigoBarras, precio, descripcion, idProveedor) VALUES ("Te lipton de limon", "123", 5,"Te frio", 2); 
