--liquibase formatted sql

--changeset polyakov:1
CREATE TABLE IF NOT EXISTS liquibase_table1
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL UNIQUE
);
--rollback DROP TABLE liquibase_table1;

--changeset polyakov:2
CREATE TABLE IF NOT EXISTS liquibase_table2
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL UNIQUE
);
--changeset polyakov:3
CREATE TABLE IF NOT EXISTS liquibase_table3
(
    id   BIGSERIAL PRIMARY KEY,
    name VARCHAR(64) NOT NULL UNIQUE
);