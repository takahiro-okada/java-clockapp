CREATE TABLE users (
  user_id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL UNIQUE,
  password_hash VARCHAR(255) NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE makers (
  maker_id INT AUTO_INCREMENT PRIMARY KEY,
  maker_name VARCHAR(100) NOT NULL,
  maker_image VARCHAR(255)
);

CREATE TABLE clocks (
  clock_id INT AUTO_INCREMENT PRIMARY KEY,
  clock_name VARCHAR(255) NOT NULL,
  description TEXT,
  clock_image VARCHAR(255),
  latitude DECIMAL(9,6),
  longitude DECIMAL(9,6),
  maker_id INT,
  user_id INT,
  FOREIGN KEY (maker_id) REFERENCES makers(maker_id),
  FOREIGN KEY (user_id) REFERENCES users(user_id)
);

INSERT INTO users (username, email, password_hash) VALUES
('user1', 'user1@example.com', 'hashed_password1'),
('user2', 'user2@example.com', 'hashed_password2'),
('user3', 'user3@example.com', 'hashed_password3');

INSERT INTO makers (maker_name, maker_image) VALUES
('SEIKO', 'seiko.png'),
('CITIZEN', 'citizen.png'),
('CASIO', 'casio.png');

INSERT INTO clocks (clock_name, description, clock_image, latitude, longitude, maker_id, user_id) VALUES
('Clock Tower A', 'A beautiful and historic clock tower.', 'clock_tower_a.jpg', 35.6895, 139.6917, 1, 1),
('Clock Tower B', 'An iconic clock tower with stunning architecture.', 'clock_tower_b.jpg', 35.0116, 135.7681, 2, 2),
('Clock Tower C', 'A modern and stylish clock tower.', 'clock_tower_c.jpg', 43.0629, 141.3544, 3, 3),
('Clock Tower D', 'A small but charming clock tower.', 'clock_tower_d.jpg', 34.396381, 132.459794, 1, 1),
('Clock Tower E', 'An impressive clock tower with a panoramic view.', 'clock_tower_e.jpg', 33.5901, 130.4017, 2, 2),
('Clock Tower F', 'A historic clock tower with a fascinating backstory.', 'clock_tower_f.jpg', 35.861729, 139.645482, 3, 3),
('Clock Tower G', 'A clock tower that lights up beautifully at night.', 'clock_tower_g.jpg', 35.4437, 139.638
