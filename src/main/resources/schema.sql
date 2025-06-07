CREATE TABLE director (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE `show` (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    director_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (director_id) REFERENCES director(id)
);