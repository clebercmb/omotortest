SELECT * FROM testdb.user;


DROP DATABASE testDB;
CREATE DATABASE testDB; 

CREATE TABLE `testDB`.`user` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(255) NULL,
 `email` VARCHAR(255) NULL,
 `phone` VARCHAR(45) NULL,
 `gender` VARCHAR(1) NULL,
 PRIMARY KEY  (`id`));

INSERT INTO `testdb`.`user` (`name`, `email`, `phone`, `gender`) VALUES ('Cleber Miranda Barbosa', 'cleber@gmail.com', '(11)98341-9065', 'M');
INSERT INTO `testdb`.`user` (`name`, `email`, `phone`, `gender`) VALUES ('Camila Miranda Barbosa', 'camila@gmail.com', '(11)97535-0307', 'F');

select * from user


CREATE TABLE `testDB`.`user` (
 `id` INT NOT NULL,
 `nome` VARCHAR(255) NULL,
 `email` VARCHAR(255) NULL,
 `telefone` VARCHAR(45) NULL,
 `sexo` VARCHAR(1) NULL,
 PRIMARY KEY AUTO_INCREMENT (`id`));

userselect * from user

SET GLOBAL time_zone = '+4:00'

