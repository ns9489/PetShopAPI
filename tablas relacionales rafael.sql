create database apipetshop;
use apipetshop;

-- Tabla de empleados
CREATE TABLE Employee (
    employeeID INT PRIMARY KEY AUTO_INCREMENT,
    employeeFirstName VARCHAR(50),
    employeeLastName VARCHAR(50),
    employeePhone VARCHAR(20),
    employeeEmail VARCHAR(100)
);

-- Tabla de propietarios
CREATE TABLE Owner (
    ownerID INT PRIMARY KEY AUTO_INCREMENT,
    ownerFirstName VARCHAR(50),
    ownerLastName VARCHAR(50),
    ownerEmail VARCHAR(100),
    ownerPhoneNumber VARCHAR(20),
    ownerAddress VARCHAR(200)
);

-- Tabla de veterinarios
CREATE TABLE Veterinarian (
    veterinarianID INT PRIMARY KEY AUTO_INCREMENT,
    veterinarianFirstName VARCHAR(50),
    veterinarianLastName VARCHAR(50),
    title VARCHAR(50),
    veterinarianPhone VARCHAR(20),
    veterinarianEmail VARCHAR(100),
    age INT
);

-- Tabla de citas médicas
CREATE TABLE MedicalAppointment (
    appointmentID INT PRIMARY KEY AUTO_INCREMENT,
    appointmentDate VARCHAR (10),
    appointmentTime VARCHAR (10),
    appointmentCost DOUBLE,
    veterinarianID INT, -- Agregada la columna para la llave foránea
    FOREIGN KEY (veterinarianID) REFERENCES Veterinarian(veterinarianID) -- Relación correcta con Veterinarian
);



-- Tabla de proveedores
CREATE TABLE Supplier (
    supplierID INT PRIMARY KEY AUTO_INCREMENT,
    supplierName VARCHAR(50),
    supplierAddress VARCHAR(200),
    supplierEmail VARCHAR(100),
    supplierPhone VARCHAR(20)
);

-- Tabla de productos
CREATE TABLE Product (
    productID INT PRIMARY KEY AUTO_INCREMENT,
    supplierID INT,
    productName VARCHAR(50),
    category VARCHAR(50),
    brand VARCHAR(50),
    price DOUBLE,
    FOREIGN KEY (supplierID) REFERENCES Supplier(supplierID)
);

-- Tabla de mascotas
CREATE TABLE Pet (
    petID INT PRIMARY KEY AUTO_INCREMENT,
    ownerID INT,
    namePet VARCHAR(50),
    species VARCHAR(50),
    age INT,
    FOREIGN KEY (ownerID) REFERENCES Owner(ownerID)
);


-- Tabla de detalles de citas médicas
CREATE TABLE AppointmentDetails (
    appointmentID INT PRIMARY KEY,
    petID INT,
    FOREIGN KEY (appointmentID) REFERENCES MedicalAppointment(appointmentID),
    FOREIGN KEY (petID) REFERENCES Pet(petID)
);

-- Tabla de facturas
CREATE TABLE Invoice (
    invoiceID INT PRIMARY KEY AUTO_INCREMENT,
    employeeID INT,
    appointmentID INT,
    invoiceDate VARCHAR (10),
    invoiceTime VARCHAR (10),
    totalAmount DOUBLE,
    totalReceived double,
    totalReturn double,
    FOREIGN KEY (employeeID) REFERENCES Employee(employeeID),
    FOREIGN KEY (appointmentID) REFERENCES MedicalAppointment(appointmentID)
);

-- Tabla de detalles de facturas
CREATE TABLE InvoiceDetail (
    invoiceDetailID INT PRIMARY KEY AUTO_INCREMENT,
    invoiceID INT,
    productID INT,
    quantity INT,
    unitPrice DOUBLE,
    FOREIGN KEY (invoiceID) REFERENCES Invoice(invoiceID),
    FOREIGN KEY (productID) REFERENCES Product(productID)
);

-- Tabla de historial médico
CREATE TABLE MedicalHistory (
    historyID INT PRIMARY KEY AUTO_INCREMENT,
    petID INT,
    appointmentID INT,
    allergies TEXT,
    previousTreatment TEXT,
    previousMedications TEXT,
    FOREIGN KEY (petID) REFERENCES Pet(petID),
    FOREIGN KEY (appointmentID) REFERENCES MedicalAppointment(appointmentID)
);