create database bd_java;

use bd_java;

CREATE TABLE `user` (
`id` int NOT NULL AUTO_INCREMENT,
`nome` varchar(80) NOT NULL,
`email` varchar(40) NOT NULL,
`password` varchar(20) NOT NULL,
    PRIMARY KEY (`id`)
);

SELECT * FROM user;