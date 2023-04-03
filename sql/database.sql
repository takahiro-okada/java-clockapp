CREATE TABLE prefectures (
  prefecture_id INT PRIMARY KEY,
  prefecture_name VARCHAR(255) NOT NULL
);

CREATE TABLE municipalities (
  municipality_id INT PRIMARY KEY,
  municipality_name VARCHAR(255) NOT NULL,
  prefecture_id INT,
  FOREIGN KEY (prefecture_id) REFERENCES prefectures(prefecture_id)
);

CREATE TABLE clocks (
  clock_id INT PRIMARY KEY,
  clock_name VARCHAR(255) NOT NULL,
  address VARCHAR(255),
  latitude DECIMAL(9,6),
  longitude DECIMAL(9,6),
  description TEXT,
  municipality_id INT,
  FOREIGN KEY (municipality_id) REFERENCES municipalities(municipality_id)
);

CREATE TABLE maker (
  id int unsigned AUTO_INCREMENT,
  maker_name VARCHAR(100) NOT NULL,
  maker_image VARCHAR(255),
  PRIMARY KEY(id)
);


INSERT INTO maker (maker_name, maker_image) VALUES ("SEIKO", "seiko.png");

INSERT INTO prefectures (prefecture_id, prefecture_name) VALUES
(1, '北海道'),
(2, '青森県');

INSERT INTO municipalities (municipality_id, municipality_name, prefecture_id) VALUES
(1, '札幌市', 1),
(2, '青森市', 2);

INSERT INTO clocks (clock_id, clock_name, address, latitude, longitude, description, municipality_id) VALUES
(1, 'サンプル時計1', '北海道札幌市...', 43.062960, 141.354377, 'ここに時計の説明を記載します。', 1),
(2, 'サンプル時計2', '青森県青森市...', 40.824623, 140.740001, 'ここに時計の説明を記載します。', 2);
