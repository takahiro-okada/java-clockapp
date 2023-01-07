DROP TABLE IF EXISTS clock;

  CREATE TABLE clock (
    id int unsigned AUTO_INCREMENT,
    clock_name VARCHAR(100) NOT NULL,
    clock_description VARCHAR(100) NOT NULL,
    maker_id int,
    PRIMARY KEY(id)
  );

  INSERT INTO clock (clock_name, clock_description) VALUES ("スモールワールド","説明が入ります｡");
  INSERT INTO clock (clock_name, clock_description) VALUES ("パルタージュ","説明が入ります｡");
  INSERT INTO clock (clock_name, clock_description) VALUES ("シンフォニー","説明が入ります｡");

DROP TABLE IF EXISTS maker;

   CREATE TABLE maker (
    id int unsigned AUTO_INCREMENT,
    maker_name VARCHAR(100) NOT NULL,
    PRIMARY KEY(id)
   );

INSERT INTO maker ( maker_name) VALUES ("SEIKO");
INSERT INTO maker ( maker_name) VALUES ("CITIZEN");
