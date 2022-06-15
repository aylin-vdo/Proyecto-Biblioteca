CREATE DATABASE Biblioteca

USE Biblioteca

create table Cliente(
IDCliente  int primary key not null,
NombreCliente varchar(50) not null,
Email varchar(50) not null,
NumeroTelCli   varchar(50) not null
)

Create table Bibliotecario(
IDBibliotecario int primary key not null,
Nombre varchar(50) not null,
Email  varchar(50) not null,
Direccion varchar(50) not null,
NumTel varchar(50),
Turno  varchar(50),
Contra varchar(50),
AdminRol INT not null
)

create table Libros(
ISBN  int primary key not null,
FechaPublicacion varchar(50),
Edicion varchar(50) not null,
NombreLibro varchar(50) not null,
Cant int,
Paginas int,
Editorial varchar(50) not null,
Genero varchar(50) not null,
Autor varchar(100) not null
)

create table Inventario(
ISBN int primary key not null,
CantdeLibros int not null,
constraint FK_InventarioISBN foreign key (ISBN) references Libros (ISBN)
)

create table Multa(
IDMulta int primary key not null,
CostoMulta money
)

create table Proveedores(
IDProveedor int primary key not null,
Nombre varchar(50) not null,
Email varchar (50) not null,
NumTel int
constraint FK_proveedores_proveedor foreign key (IDProveedor) references Proveedores(IDProveedor)
)

create table FacturaProveedor(
ISBN int primary key not null,
IDProveedor int,
costo money,
cantidad int,
constraint FK_FacturaProveedor_Proveedor foreign key (IDProveedor) references Proveedores(IDProveedor)
)

create table PrestamoLibros(
IDPrestamo int primary key not null,
ISBN int,
IDCliente int,
IDBlibliotecario int,
Fecha VARCHAR(50),
FechaDev VARCHAR(50),
IDMulta int,
constraint FK_PrestamoLibros_ISBN foreign key (ISBN) references Libros(ISBN),
constraint FK_PrestamoLibros_Cliente foreign key (IDCliente) references cliente(IDCliente),
constraint FK_PrestamoLibros_Bibliotecario foreign key (IDBlibliotecario) references Bibliotecario(IDBibliotecario),
constraint FK_PrestamoLibros_Multa foreign key (IDMulta) references multa(IDMulta)
)
