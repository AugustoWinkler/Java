create database byte_bank;
use byte_bank;

CREATE TABLE `conta` (
  `numero` int NOT NULL,
  `saldo` decimal(10,0) DEFAULT NULL,
  `cliente_nome` varchar(50) DEFAULT NULL,
  `cliente_cpf` varchar(11) DEFAULT NULL,
  `cliente_email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

select * from conta;

ALTER TABLE conta
ADD COLUMN esta_ativa BOOLEAN DEFAULT TRUE;