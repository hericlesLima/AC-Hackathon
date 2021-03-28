DROP TABLE IF EXISTS doner;
CREATE TABLE doner
(
    id           INTEGER AUTO_INCREMENT,
    name         CHAR(65),
    version      INTEGER,
    creationTime TIME,
    updateTime   TIME,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS association;
CREATE TABLE association
(
    id           INTEGER AUTO_INCREMENT,
    name         CHAR(65),
    version      INTEGER,
    creationTime TIME,
    updateTime   TIME,
    localization CHAR(65),
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS speies;
CREATE TABLE species
(
    id             INTEGER AUTO_INCREMENT,
    name           CHAR(65),
    scientificName CHAR(65),
    description    CHAR(255),
    version        INTEGER,
    status         CHAR(65),
    creationTime   TIME,
    updateTime     TIME,
    imageLink      VARCHAR(500),
    PRIMARY KEY (id)
);
