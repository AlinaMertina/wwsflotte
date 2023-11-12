
create database wwsflotte;

create table typecarburant(
    idcarburant bigint primary key,
    nomcarburant Varchar(30)
);




create table typevehicule(
    idtype bigint primary key,
    nomtype Varchar(50)
);

create table kilometrage(
    idkilometrage bigint primary key,
    idvehicule bigint,
    date date,
    debut double precision,
    fin double precision,
    FOREIGN KEY (idvehicule)  REFERENCES vehicule(idvehicule)
);

create table token(
    id bigint primary key,
    idfutilisateur bigint,
    token text,
    token_type text,
    revoked boolean,
    expired boolean,
    FOREIGN KEY (idfutilisateur)  REFERENCES Utilisateur(id)
);



create table vehicule(
    idvehicule bigint primary key,
    matricule Varchar(50),
    numerodechassi Varchar(50),
    annedefabrication date,
    cylindre double precision,
    poidvide double precision,
    poidcharger double precision,
    puissance double precision,
    carburantplaine double precision,
    marque Varchar(50),
    modele Varchar(50),
    idftype bigint,
    idfcarburant bigint,
    FOREIGN KEY (idfcarburant)  REFERENCES typecarburant(idcarburant),
    FOREIGN KEY (idftype)  REFERENCES typevehicule(idtype)M
);

insert into vehicule values (1,'AB-123-CD','1234567890ABCDE','2022-01-01',2.0,1500.0,2000.0,150.0,40.0,'Toyota','Camry',1,1);




create table Utilisateur(
    id bigint primary key,
    pseudo Varchar(50),
    password text,
    role Varchar(50)
);


insert into Utilisateur values(1,'Mertina','mertina5041');








