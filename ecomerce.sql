

-- Crear la tabla de Usuarios (users)
CREATE TABLE users (
  id INT PRIMARY KEY IDENTITY(1,1),
  email NVARCHAR(500) NULL,
  password NVARCHAR(500) NULL,
  first_name NVARCHAR(50) NULL,
  last_name NVARCHAR(50) NULL,
  address NVARCHAR(100) NULL,
  city NVARCHAR(90) NULL,
  state NVARCHAR(20) NULL,
  zip NVARCHAR(12) NULL,
  country NVARCHAR(20) NULL,
  phone NVARCHAR(20) NULL,
  fax NVARCHAR(20) NULL,
  email_verified TINYINT NOT NULL DEFAULT 0,
  registration_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  verification_code NVARCHAR(20) NULL,
  ip NVARCHAR(50) NULL,
  address2 NVARCHAR(50) NULL
);
GO

INSERT INTO users (email, password, first_name, last_name, address, city, state, zip, country, phone, fax, email_verified, registration_date, verification_code, ip, address2)
VALUES
('user1@example.com', 'password1', 'John', 'Doe', '123 Main St', 'New York', 'NY', '10001', 'USA', '555-1234', '555-5678', 1, '2023-07-28 12:34:56', 'abcd1234', '127.0.0.1', 'Apt 2'),
('user2@example.com', 'password2', 'Jane', 'Smith', '456 Elm St', 'Los Angeles', 'CA', '90001', 'USA', '555-9876', '555-4321', 1, '2023-07-27 10:20:30', 'efgh5678', '192.168.1.1', 'Unit 5'),
('user3@example.com', 'password3', 'Michael', 'Johnson', '789 Oak St', 'Chicago', 'IL', '60601', 'USA', '555-5555', '555-1111', 0, '2023-07-26 08:15:45', NULL, '10.0.0.1', 'Apt 12'),
('user4@example.com', 'password4', 'Emily', 'Williams', '321 Pine St', 'Houston', 'TX', '77001', 'USA', '555-2222', '555-8888', 1, '2023-07-25 16:30:00', 'ijkl1234', '192.168.0.1', 'Suite 8'),
('user5@example.com', 'password5', 'David', 'Brown', '567 Maple St', 'Phoenix', 'AZ', '85001', 'USA', '555-7777', '555-3333', 0, '2023-07-24 14:45:15', NULL, '172.16.0.1', 'Apt 7'),
('user6@example.com', 'password6', 'Emma', 'Jones', '654 Cedar St', 'San Francisco', 'CA', '94101', 'USA', '555-4444', '555-9999', 1, '2023-07-23 22:00:30', 'mnop5678', '10.1.1.1', 'Unit 3'),
('user7@example.com', 'password7', 'William', 'Davis', '987 Walnut St', 'Miami', 'FL', '33101', 'USA', '555-6666', '555-2222', 0, '2023-07-22 20:15:45', NULL, '192.168.2.1', 'Apt 20'),
('user8@example.com', 'password8', 'Olivia', 'Miller', '876 Birch St', 'Dallas', 'TX', '75201', 'USA', '555-3333', '555-7777', 1, '2023-07-21 18:30:00', 'qrst1234', '192.168.10.1', 'Suite 15'),
('user9@example.com', 'password9', 'James', 'Wilson', '456 Elm St', 'Las Vegas', 'NV', '89101', 'USA', '555-2222', '555-8888', 0, '2023-07-20 16:45:15', NULL, '192.168.20.1', 'Apt 9'),
('user10@example.com', 'password10', 'Sophia', 'Taylor', '789 Oak St', 'Seattle', 'WA', '98101', 'USA', '555-1111', '555-5555', 1, '2023-07-19 14:00:30', 'uvwx5678', '192.168.30.1', 'Unit 6'),
('user11@example.com', 'password11', 'Benjamin', 'Anderson', '654 Cedar St', 'Boston', 'MA', '02101', 'USA', '555-9999', '555-4444', 0, '2023-07-18 12:15:45', NULL, '192.168.40.1', 'Apt 13'),
('user12@example.com', 'password12', 'Isabella', 'Thomas', '987 Walnut St', 'Atlanta', 'GA', '30301', 'USA', '555-7777', '555-6666', 1, '2023-07-17 10:30:00', 'yzab1234', '192.168.50.1', 'Suite 10'),
('user13@example.com', 'password13', 'Mason', 'Martinez', '876 Birch St', 'Philadelphia', 'PA', '19101', 'USA', '555-8888', '555-2222', 0, '2023-07-16 08:45:15', NULL, '192.168.60.1', 'Apt 18'),
('user14@example.com', 'password14', 'Ava', 'Hernandez', '123 Main St', 'Denver', 'CO', '80201', 'USA', '555-1234', '555-5678', 1, '2023-07-15 07:00:30', 'cdab5678', '192.168.70.1', 'Unit 2'),
('user15@example.com', 'password15', 'Ethan', 'Lopez', '456 Elm St', 'Washington', 'DC', '20001', 'USA', '555-9876', '555-4321', 0, '2023-07-14 05:15:45', NULL, '192.168.80.1', 'Apt 16'),
('user16@example.com', 'password16', 'Mia', 'Gonzalez', '789 Oak St', 'Houston', 'TX', '77001', 'USA', '555-5555', '555-1111', 1, '2023-07-13 03:30:00', 'efgh5678', '192.168.90.1', 'Suite 7'),
('user17@example.com', 'password17', 'Noah', 'Rivera', '654 Cedar St', 'San Francisco', 'CA', '94101', 'USA', '555-4444', '555-9999', 0, '2023-07-12 01:45:15', NULL, '192.168.100.1', 'Apt 5'),
('user18@example.com', 'password18', 'Avery', 'Cox', '987 Walnut St', 'Miami', 'FL', '33101', 'USA', '555-6666', '555-2222', 1, '2023-07-11 00:00:30', 'ijkl1234', '192.168.110.1', 'Unit 1'),
('user19@example.com', 'password19', 'Liam', 'Howard', '876 Birch St', 'Dallas', 'TX', '75201', 'USA', '555-3333', '555-7777', 0, '2023-07-10 22:15:45', NULL, '192.168.120.1', 'Apt 11'),
('user20@example.com', 'password20', 'Harper', 'Bennett', '456 Elm St', 'Las Vegas', 'NV', '89101', 'USA', '555-2222', '555-8888', 1, '2023-07-09 20:30:00', 'mnop5678', '192.168.130.1', 'Suite 4');

GO

-- Crear la tabla de Categorías de Productos (product_categories)
CREATE TABLE product_categories (
  id INT PRIMARY KEY IDENTITY(1,1),
  name NVARCHAR(50) NOT NULL
);
GO

INSERT INTO product_categories (name) VALUES
('Running'),
('Walking'),
('Hiking'),
('Track and Trail'),
('Short Sleeve'),
('Long Sleeve'),
('Sneakers'),
('Sandals'),
('Boots'),
('Flip Flops');


GO
-- Crear la tabla de Productos (products)
CREATE TABLE products (
  id INT PRIMARY KEY IDENTITY(1,1),
  sku NVARCHAR(50) NOT NULL,
  name NVARCHAR(100) NOT NULL,
  price FLOAT NOT NULL,
  weight FLOAT NOT NULL,
  cart_desc NVARCHAR(250) NOT NULL,
  short_desc NVARCHAR(1000) NOT NULL,
  long_desc TEXT NOT NULL,
  thumb NVARCHAR(100) NOT NULL,
  image NVARCHAR(100) NOT NULL,
  category INT NULL,
  update_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  stock FLOAT NULL,
  live TINYINT NOT NULL DEFAULT 0,
  unlimited TINYINT NOT NULL DEFAULT 1,
  location NVARCHAR(250) NULL,
  FOREIGN KEY (category) REFERENCES product_categories(id)
);

GO

INSERT INTO products (sku, name, price, weight, cart_desc, short_desc, long_desc, thumb, image, category, stock, live, unlimited, location) VALUES
('SKU001', 'Running Shoes', 59.99, 0.5, 'Lightweight running shoes', 'A pair of lightweight running shoes', 'These running shoes are designed for maximum comfort and performance.', 'running_shoes_thumb.jpg', 'running_shoes.jpg', 1, 100, 1, 1, 'USA'),
('SKU002', 'Hiking Boots', 89.99, 1.2, 'Sturdy hiking boots', 'Sturdy and reliable hiking boots for all terrains.', 'Ideal for long hikes and outdoor adventures.', 'hiking_boots_thumb.jpg', 'hiking_boots.jpg', 3, 50, 1, 1, 'USA'),
('SKU003', 'Tennis Racket', 79.99, 0.8, 'Professional tennis racket', 'A high-quality tennis racket for skilled players.', 'Enhance your game with this top-notch racket.', 'tennis_racket_thumb.jpg', 'tennis_racket.jpg', 7, 30, 1, 1, 'USA'),
('SKU004', 'Yoga Mat', 29.99, 0.3, 'Eco-friendly yoga mat', 'A comfortable and eco-friendly yoga mat.', 'Perfect for all types of yoga practices.', 'yoga_mat_thumb.jpg', 'yoga_mat.jpg', 9, 100, 1, 1, 'USA'),
('SKU005', 'Soccer Ball', 19.99, 0.7, 'Durable soccer ball', 'A durable soccer ball for casual games and training.', 'Built to withstand intense play and provide great performance.', 'soccer_ball_thumb.jpg', 'soccer_ball.jpg', 6, 40, 1, 1, 'USA'),
('SKU006', 'Baseball Glove', 39.99, 0.6, 'Quality baseball glove', 'A high-quality baseball glove for fielding and catching.', 'Designed to fit comfortably and offer excellent grip.', 'baseball_glove_thumb.jpg', 'baseball_glove.jpg', 6, 25, 1, 1, 'USA'),
('SKU007', 'Swimming Goggles', 14.99, 0.2, 'Anti-fog swimming goggles', 'Comfortable and anti-fog swimming goggles for clear underwater vision.', 'Ideal for recreational and competitive swimmers.', 'swimming_goggles_thumb.jpg', 'swimming_goggles.jpg', 4, 80, 1, 1, 'USA'),
('SKU008', 'Basketball', 24.99, 0.9, 'Indoor/Outdoor basketball', 'A versatile basketball for indoor and outdoor use.', 'Provides a good grip and bounces consistently.', 'basketball_thumb.jpg', 'basketball.jpg', 6, 35, 1, 1, 'USA'),
('SKU009', 'Cycling Helmet', 49.99, 0.4, 'Safety cycling helmet', 'A reliable helmet for safe cycling adventures.', 'Features adjustable straps for a secure fit.', 'cycling_helmet_thumb.jpg', 'cycling_helmet.jpg', 2, 60, 1, 1, 'USA'),
('SKU010', 'Tennis Balls', 9.99, 0.3, 'Set of tennis balls', 'A set of high-quality tennis balls for practice and matches.', 'Durable and designed for optimal performance.', 'tennis_balls_thumb.jpg', 'tennis_balls.jpg', 7, 200, 1, 1, 'USA'),
('SKU011', 'Football', 19.99, 0.9, 'Durable football', 'A durable football for casual games and practice.', 'Perfect for backyard play and recreational matches.', 'football_thumb.jpg', 'football.jpg', 6, 50, 1, 1, 'USA'),
('SKU012', 'Running Shorts', 29.99, 0.2, 'Comfortable running shorts', 'Lightweight and breathable shorts for running.', 'Designed to provide freedom of movement and comfort.', 'running_shorts_thumb.jpg', 'running_shorts.jpg', 1, 100, 1, 1, 'USA'),
('SKU013', 'Yoga Block', 12.99, 0.1, 'Yoga block for support', 'A foam yoga block for support and balance during yoga poses.', 'Helps deepen stretches and improve alignment.', 'yoga_block_thumb.jpg', 'yoga_block.jpg', 9, 120, 1, 1, 'USA'),
('SKU014', 'Baseball Bat', 49.99, 1.0, 'Premium baseball bat', 'A high-quality baseball bat for power hitters.', 'Crafted from durable materials for excellent performance.', 'baseball_bat_thumb.jpg', 'baseball_bat.jpg', 6, 40, 1, 1, 'USA'),
('SKU015', 'Ski Goggles', 39.99, 0.5, 'Anti-fog ski goggles', 'Comfortable ski goggles for clear vision on the slopes.', 'Features UV protection and anti-fog coating.', 'ski_goggles_thumb.jpg', 'ski_goggles.jpg', 4, 70, 1, 1, 'USA'),
('SKU016', 'Tennis Shoes', 69.99, 0.6, 'Tennis shoes for performance', 'Performance-oriented tennis shoes for quick movements.', 'Offers excellent traction and stability on the court.', 'tennis_shoes_thumb.jpg', 'tennis_shoes.jpg', 7, 30, 1, 1, 'USA'),
('SKU017', 'Camping Tent', 149.99, 3.5, 'Spacious camping tent', 'A spacious tent that accommodates multiple campers.', 'Durable and waterproof for outdoor adventures.', 'camping_tent_thumb.jpg', 'camping_tent.jpg', 3, 20, 1, 1, 'USA'),
('SKU018', 'Golf Balls', 24.99, 0.4, 'Set of golf balls', 'A set of high-quality golf balls for all skill levels.', 'Designed for maximum distance and control.', 'golf_balls_thumb.jpg', 'golf_balls.jpg', 5, 100, 1, 1, 'USA'),
('SKU019', 'Swimming Cap', 9.99, 0.1, 'Silicone swimming cap', 'A comfortable and durable silicone swimming cap.', 'Keeps hair dry and reduces drag in the water.', 'swimming_cap_thumb.jpg', 'swimming_cap.jpg', 4, 150, 1, 1, 'USA'),
('SKU020', 'Cycling Gloves', 19.99, 0.2, 'Padded cycling gloves', 'Padded gloves for comfortable grip during cycling.', 'Provides protection and reduces hand fatigue.', 'cycling_gloves_thumb.jpg', 'cycling_gloves.jpg', 2, 80, 1, 1, 'USA'),
('SKU021', 'Running Hat', 14.99, 0.1, 'Lightweight running hat', 'A lightweight hat for sun protection during runs.', 'Breathable and adjustable for a comfortable fit.', 'running_hat_thumb.jpg', 'running_hat.jpg', 1, 200, 1, 1, 'USA'),
('SKU022', 'Basketball Hoop', 149.99, 10.0, 'Outdoor basketball hoop', 'A sturdy outdoor basketball hoop for backyard play.', 'Comes with an adjustable height for different ages.', 'basketball_hoop_thumb.jpg', 'basketball_hoop.jpg', 6, 10, 1, 1, 'USA'),
('SKU023', 'Volleyball', 17.99, 0.3, 'Soft-touch volleyball', 'A soft-touch volleyball for indoor and outdoor play.', 'Designed for less sting and better control.', 'volleyball_thumb.jpg', 'volleyball.jpg', 6, 60, 1, 1, 'USA'),
('SKU024', 'Hiking Backpack', 79.99, 2.0, 'Durable hiking backpack', 'A spacious and durable backpack for hiking trips.', 'Features multiple compartments and adjustable straps.', 'hiking_backpack_thumb.jpg', 'hiking_backpack.jpg', 3, 30, 1, 1, 'USA'),
('SKU025', 'Tennis Balls', 12.99, 0.2, 'Set of tennis balls', 'A set of standard tennis balls for practice and matches.', 'Durable and suitable for all court surfaces.', 'tennis_balls_thumb.jpg', 'tennis_balls.jpg', 7, 180, 1, 1, 'USA'),
('SKU026', 'Soccer Cleats', 44.99, 0.8, 'Soccer cleats for performance', 'Performance-oriented soccer cleats for agility and control.', 'Designed for optimal traction on the field.', 'soccer_cleats_thumb.jpg', 'soccer_cleats.jpg', 6, 25, 1, 1, 'USA'),
('SKU027', 'Yoga Mat Bag', 19.99, 0.3, 'Yoga mat bag with strap', 'A convenient bag to carry and store yoga mats.', 'Features an adjustable strap for easy carrying.', 'yoga_mat_bag_thumb.jpg', 'yoga_mat_bag.jpg', 9, 100, 1, 1, 'USA'),
('SKU028', 'Running Socks', 9.99, 0.1, 'Breathable running socks', 'Breathable and moisture-wicking socks for running.', 'Keep feet dry and comfortable during workouts.', 'running_socks_thumb.jpg', 'running_socks.jpg', 1, 200, 1, 1, 'USA'),
('SKU029', 'Ski Poles', 34.99, 0.5, 'Durable ski poles', 'Durable and lightweight ski poles for skiing.', 'Designed for optimal balance and stability.', 'ski_poles_thumb.jpg', 'ski_poles.jpg', 4, 70, 1, 1, 'USA'),
('SKU030', 'Tennis Bag', 39.99, 0.6, 'Tennis bag with compartments', 'A spacious bag to carry tennis rackets and gear.', 'Comes with multiple compartments for organization.', 'tennis_bag_thumb.jpg', 'tennis_bag.jpg', 7, 40, 1, 1, 'USA');



GO


-- Crear la tabla de Órdenes (orders)
CREATE TABLE orders (
  id INT PRIMARY KEY IDENTITY(1,1),
  userr INT NOT NULL,
  amount FLOAT NOT NULL,
  ship_name NVARCHAR(100) NOT NULL,
  ship_address NVARCHAR(100) NOT NULL,
  ship_address2 NVARCHAR(100) NOT NULL,
  city NVARCHAR(50) NOT NULL,
  state NVARCHAR(50) NOT NULL,
  zip NVARCHAR(20) NOT NULL,
  country NVARCHAR(50) NOT NULL,
  phone NVARCHAR(20) NOT NULL,
  fax NVARCHAR(20) NOT NULL,
  shipping FLOAT NOT NULL,
  tax FLOAT NOT NULL,
  email NVARCHAR(100) NOT NULL,
  date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  shipped TINYINT NOT NULL DEFAULT 0,
  tracking_number NVARCHAR(80) NULL,
  FOREIGN KEY (userr) REFERENCES users(id)
);
GO

INSERT INTO orders (userr, amount, ship_name, ship_address, ship_address2, city, state, zip, country, phone, fax, shipping, tax, email, shipped, tracking_number) VALUES
(1, 120.50, 'John Doe', '123 Main St', 'Apt 4', 'New York', 'NY', '10001', 'USA', '555-1234', '555-5678', 10.00, 5.50, 'john.doe@example.com', 1, 'TRK12345'),
(2, 80.25, 'Jane Smith', '456 Elm St', '', 'Los Angeles', 'CA', '90001', 'USA', '555-9876', '555-4321', 8.50, 3.75, 'jane.smith@example.com', 1, 'TRK67890'),
(3, 45.75, 'Mike Johnson', '789 Oak St', 'Unit 10', 'Chicago', 'IL', '60601', 'USA', '555-1111', '555-2222', 5.25, 2.25, 'mike.johnson@example.com', 0, NULL),
(4, 55.00, 'Emily Brown', '555 Maple St', '', 'Houston', 'TX', '77001', 'USA', '555-3333', '555-4444', 7.00, 3.00, 'emily.brown@example.com', 1, 'TRK24680'),
(5, 95.80, 'David Lee', '101 Pine St', 'Suite 5', 'San Francisco', 'CA', '94101', 'USA', '555-6666', '555-7777', 9.80, 4.20, 'david.lee@example.com', 0, NULL),
(6, 150.00, 'Sarah Davis', '222 Cedar St', '', 'Seattle', 'WA', '98101', 'USA', '555-8888', '555-9999', 12.00, 6.50, 'sarah.davis@example.com', 1, 'TRK13579'),
(7, 65.30, 'Michael Wilson', '333 Oak St', '', 'Dallas', 'TX', '75201', 'USA', '555-7777', '555-8888', 6.30, 2.75, 'michael.wilson@example.com', 1, 'TRK46802'),
(8, 38.90, 'Jessica Taylor', '444 Elm St', 'Apt 8', 'Miami', 'FL', '33101', 'USA', '555-2222', '555-3333', 4.90, 2.10, 'jessica.taylor@example.com', 0, NULL),
(9, 75.50, 'Daniel Martinez', '555 Pine St', 'Unit 15', 'Phoenix', 'AZ', '85001', 'USA', '555-4444', '555-5555', 8.00, 3.50, 'daniel.martinez@example.com', 1, 'TRK79135'),
(10, 42.25, 'Olivia Anderson', '666 Oak St', '', 'Atlanta', 'GA', '30301', 'USA', '555-9999', '555-0000', 5.00, 2.25, 'olivia.anderson@example.com', 1, 'TRK24681');

GO

-- Crear la tabla de Detalles de Órdenes (order_details)
CREATE TABLE order_details (
  id INT PRIMARY KEY IDENTITY(1,1),
  orderr INT NOT NULL,
  product INT NOT NULL,
  name NVARCHAR(250) NOT NULL,
  price FLOAT NOT NULL,
  sku NVARCHAR(50) NOT NULL,
  quantity INT NOT NULL,
  FOREIGN KEY (orderr) REFERENCES orders(id),
  FOREIGN KEY (product) REFERENCES products(id)
);
GO

INSERT INTO order_details (orderr, product, name, price, sku, quantity) VALUES
(1, 1, 'Cotton T-Shirt', 9.99, '000-0001', 2),
(1, 3, 'Green Hoodie', 25.50, '000-0003', 1),
(2, 2, 'Running Shoes', 59.95, '000-0002', 1),
(3, 4, 'Sports Shorts', 15.00, '000-0004', 3),
(4, 5, 'Baseball Cap', 12.99, '000-0005', 2),
(4, 6, 'Sunglasses', 20.75, '000-0006', 1),
(5, 1, 'Cotton T-Shirt', 9.99, '000-0001', 1),
(6, 3, 'Green Hoodie', 25.50, '000-0003', 2),
(7, 4, 'Sports Shorts', 15.00, '000-0004', 1),
(8, 2, 'Running Shoes', 59.95, '000-0002', 2);

GO

-- Crear la tabla de Carrito de Compras (shopping_cart)
CREATE TABLE shopping_cart (
  id INT PRIMARY KEY IDENTITY(1,1),
  userr INT NOT NULL,
  product INT NOT NULL,
  quantity INT NOT NULL,
  FOREIGN KEY (userr) REFERENCES users(id),
  FOREIGN KEY (product) REFERENCES products(id)
);
GO

INSERT INTO shopping_cart (userr, product, quantity) VALUES
(1, 2, 3),
(1, 5, 1),
(2, 1, 2),
(2, 4, 1),
(3, 3, 1),
(3, 6, 2),
(4, 2, 1),
(4, 4, 3),
(5, 1, 1),
(5, 3, 2);


GO
CREATE TABLE option_groups (
  id INT PRIMARY KEY IDENTITY(1,1),
  name NVARCHAR(50) NOT NULL
);
GO

INSERT INTO option_groups (name) VALUES
('Color'),
('Size'),
('Material'),
('Style'),
('Flavor'),
('Capacity'),
('Shape'),
('Pattern'),
('Weight'),
('Length');


GO
CREATE TABLE options (
  id INT PRIMARY KEY IDENTITY(1,1),
  option_group INT NOT NULL,
  name NVARCHAR(50) NOT NULL,
  FOREIGN KEY (option_group) REFERENCES option_groups(id)
);
GO


INSERT INTO options (option_group, name) VALUES
(1, 'Red'),
(1, 'Blue'),
(1, 'Green'),
(2, 'Small'),
(2, 'Medium'),
(2, 'Large'),
(2, 'XL'),
(3, 'Cotton'),
(3, 'Polyester'),
(3, 'Wool');

GO

-- Crear la tabla de Grupos de Opciones (option_groups)

-- Crear la tabla de Opciones de Productos (product_options)
CREATE TABLE product_options (
  id INT PRIMARY KEY IDENTITY(1,1),
  product INT NOT NULL,
  optionn INT NOT NULL,
  price_increment FLOAT NULL,
  groupp INT NOT NULL,
  FOREIGN KEY (product) REFERENCES products(id),
  FOREIGN KEY (optionn) REFERENCES options(id),
  FOREIGN KEY (groupp) REFERENCES option_groups(id)
);
GO

INSERT INTO product_options (product, optionn, price_increment, groupp) VALUES
(1, 1, 0.00, 1),
(1, 2, 0.00, 1),
(1, 3, 0.00, 1),
(2, 4, 5.00, 2),
(2, 5, 5.00, 2),
(3, 6, 2.50, 2),
(3, 7, 2.50, 2),
(4, 8, 3.00, 2),
(4, 9, 3.00, 2),
(5, 10, 0.00, 1);


GO





