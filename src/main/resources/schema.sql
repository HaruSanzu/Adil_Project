drop table if exists teams;
drop table if exists players;
drop table if exists coachs;
drop table if exists sponsors;

CREATE TABLE teams (
                       id INT PRIMARY KEY,
                       name VARCHAR(255),
                       team_country VARCHAR(255)
);

CREATE TABLE players (
                      id INT PRIMARY KEY,
                      nickname VARCHAR(255),
                      name VARCHAR(255),
                      surname VARCHAR(255),
                      country VARCHAR(255)
);

CREATE TABLE coachs (
                         id INT PRIMARY KEY,
                         nickname VARCHAR(255),
                         name VARCHAR(255),
                         surname VARCHAR(255),
                         country VARCHAR(255),
                         team VARCHAR(255)
);

CREATE TABLE sponsors (
                        id INT PRIMARY KEY,
                        name VARCHAR(255),
                        activity VARCHAR(255)
);




