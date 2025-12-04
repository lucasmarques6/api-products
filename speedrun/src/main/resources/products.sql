-- ============================================
-- INSERCIÓN DE PRODUCTOS POR CATEGORÍA
-- ============================================

-- TECNOLOGÍA
INSERT INTO product (name, description, price, category, stock) VALUES
('Notebook Lenovo', 'Notebook 15 pulgadas, 8GB RAM', 850000, 'Tecnología', 15),
('Smartphone Samsung A34', 'Pantalla AMOLED, 128GB', 320000, 'Tecnología', 25),
('Auriculares Sony WH-CH520', 'Bluetooth con micrófono', 65000, 'Tecnología', 40),
('Mouse Logitech M280', 'Mouse inalámbrico', 15000, 'Tecnología', 60),
('Monitor LG 24"', 'Full HD IPS', 120000, 'Tecnología', 20);

-- HOGAR
INSERT INTO product (name, description, price, category, stock) VALUES
('Lámpara LED', 'Lámpara blanca de escritorio', 12000, 'Hogar', 50),
('Silla ergonómica', 'Silla para oficina', 95000, 'Hogar', 10),
('Tostadora Philips', 'Tostadora 2 ranuras', 38000, 'Hogar', 18),
('Aspiradora Atma', 'Potencia 1400W', 75000, 'Hogar', 12),
('Ventilador Liliana', 'Ventilador de pie 20"', 68000, 'Hogar', 22);

-- ROPA
INSERT INTO product (name, description, price, category, stock) VALUES
('Remera básica', 'Remera algodón talle M', 8000, 'Ropa', 100),
('Pantalón jean', 'Jean azul clásico', 25000, 'Ropa', 50),
('Campera deportiva', 'Campera liviana', 35000, 'Ropa', 30),
('Zapatillas Urbanas', 'Zapatillas unisex', 55000, 'Ropa', 40),
('Buzo con capucha', 'Buzo polar', 30000, 'Ropa', 25);

-- DEPORTES
INSERT INTO product (name, description, price, category, stock) VALUES
('Pelota de fútbol', 'Pelota tamaño 5', 15000, 'Deportes', 40),
('Mancuernas 5kg', 'Set de 2 mancuernas', 22000, 'Deportes', 30),
('Bicicleta MTB', 'Mountain bike rodado 29', 350000, 'Deportes', 8),
('Colchoneta yoga', 'Antideslizante', 12000, 'Deportes', 50),
('Raqueta de tenis', 'Raqueta aluminio', 38000, 'Deportes', 20);

-- LIBROS
INSERT INTO product (name, description, price, category, stock) VALUES
('El Principito', 'Edición bolsillo', 5500, 'Libros', 100),
('Clean Code', 'Robert C. Martin', 35000, 'Libros', 25),
('Harry Potter 1', 'Edición tapa dura', 22000, 'Libros', 40),
('SQL para principiantes', 'Guía de aprendizaje', 18000, 'Libros', 30),
('Crónica de una muerte anunciada', 'Gabriel García Márquez', 9000, 'Libros', 60);


