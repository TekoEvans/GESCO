DROP DATABASE IF EXISTS angelApoo;
CREATE DATABASE angelApoo;
use angelApoo;

DROP TABLE IF EXISTS Users;
CREATE TABLE Users(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(80),
    rule_user ENUM('teacher', 'tuition_service')
);

DROP TABLE IF EXISTS Students;
CREATE TABLE Students(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    last_name VARCHAR(50),
    first_name VARCHAR(50),
    birth_date DATE,
    sex ENUM('F','M'),
    level_student INT,
    address VARCHAR(100),
    email VARCHAR(50),
    telephone VARCHAR(12),
    nationality VARCHAR(50),
    id_institut INT(4),
    id_career INT(4),
    registration_num VARCHAR(30),
    registration_date DATE
);

DROP TABLE IF EXISTS Instituts;
CREATE TABLE Instituts(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name_institut VARCHAR(50);
    name_headmaster VARCHAR(50)
);


DROP TABLE IF EXISTS
    Careers;
CREATE TABLE Careers(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    career_name VARCHAR(50),
    id_institut INT NOT NULL
); 


DROP TABLE IF EXISTS ECUEs;
CREATE TABLE ECUEs(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    lib VARCHAR(50),
    nb_credit INT,
    code_ECUE VARCHAR(10),
    id_ue INT NOT NULL
);

DROP TABLE IF EXISTS UEs;
CREATE TABLE UEs(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    libele VARCHAR(50),
    id_career INT NOT NULL
);

DROP TABLE IF EXISTS Evaluations;
CREATE TABLE Evaluations(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    note DOUBLE,
    date_evaluation DATE,
    type_evaluation ENUM('DEVOIR', 'EXAMEN','RATTRAPAGE'),
    weight INT,
    id_ECUE INT NOT NULL
); 

DROP TABLE IF EXISTS Suivre_ECUEs;
CREATE TABLE Suivre_ECUEs(
    id_ECUE INT  NOT NULL,
    id_student INT NOT NULL,
    PRIMARY KEY(id_ECUE, id_student)
);
  
ALTER TABLE 
    UEs ADD CONSTRAINT FK_UEs_id_career FOREIGN KEY (id_career) REFERENCES Careers(id); 

ALTER TABLE 
    ECUEs ADD CONSTRAINT FK_ECUEs_id_ue FOREIGN KEY (id_ue) REFERENCES UEs(id); 

ALTER TABLE 
    Evaluations ADD CONSTRAINT FK_Evaluation_id_ECUE FOREIGN KEY (id_ECUE) REFERENCES ECUEs(id); 

ALTER TABLE
    Students ADD CONSTRAINT FK_Students_career FOREIGN KEY(id_career) REFERENCES Careers(id);

ALTER TABLE
    Students ADD CONSTRAINT FK_Students_id_institut FOREIGN KEY(id_institut) REFERENCES Instituts(id);

ALTER TABLE
    Careers ADD CONSTRAINT FK_Careers_id_institut FOREIGN KEY(id_institut) REFERENCES Instituts(id);
 
ALTER TABLE
    Suivre_ECUEs ADD CONSTRAINT FK_suivreECUE_id_ue FOREIGN KEY(id_ECUE) REFERENCES ECUEs(id);

ALTER TABLE
    Suivre_ECUEs ADD CONSTRAINT FK_suivreECUE_id_student FOREIGN KEY(id_student) REFERENCES Students(id);