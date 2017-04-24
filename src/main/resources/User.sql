CREATE TABLE user
(
    id INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    login VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    CONSTRAINT user_userdetails_id_fk FOREIGN KEY (id) REFERENCES userdetails (id)
);