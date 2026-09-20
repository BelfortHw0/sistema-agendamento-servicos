create database agendamento_saas_db;
use agendamento_saas_db;

CREATE TABLE planos (
    plano_id SMALLINT UNSIGNED AUTO_INCREMENT,
    nome_plano VARCHAR(30),
    valor_mensal DECIMAL(6 , 2 ),
    CONSTRAINT pk_planos PRIMARY KEY (plano_id)
);

CREATE TABLE assinantes (
    assinante_id SMALLINT UNSIGNED AUTO_INCREMENT,
    plano_id SMALLINT UNSIGNED,
    nome_assinante VARCHAR(60),
    email VARCHAR(40) NOT NULL UNIQUE,
    status_assinante VARCHAR(40) NOT NULL,
    CONSTRAINT pk_assinante PRIMARY KEY (assinante_id),
    CONSTRAINT fk_planos_assinante FOREIGN KEY (plano_id)
        REFERENCES planos (plano_id)
);