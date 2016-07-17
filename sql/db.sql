SHOW DATABASES;
drop DATABASE  test;
CREATE DATABASE test;

USE test;

CREATE TABLE user (
  ip1     VARCHAR(20),
  ip2     VARCHAR(20),
  address VARCHAR(80)
);

SHOW TABLES;

INSERT INTO user VALUES ('0.0.0.0 ', '0.255.255.255','阿斯蒂芬');

SELECT *
FROM user;

DROP TABLE user;
