INSERT INTO orders (order_status, total_price) VALUES
('PENDING',   3299.00),
('CONFIRMED', 1499.00),
('CANCELLED',  799.00),
('PENDING',   2599.00),
('CONFIRMED',  499.00),
('CONFIRMED', 2199.00),
('CANCELLED',  999.00),
('PENDING',   1899.00),
('CONFIRMED',  299.00),
('PENDING',   4599.00);

INSERT INTO order_item (product_id, quantity, order_id) VALUES

(101, 1, 1),
(102, 2, 1),
(103, 1, 2),
(104, 1, 3),
(105, 2, 3),
(106, 1, 4),
(107, 3, 4),
(108, 1, 5),
(109, 2, 6),
(110, 1, 6),
(111, 1, 7),
(112, 1, 8),
(113, 2, 8),
(114, 1, 9),
(115, 3, 10);
