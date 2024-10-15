-- ShoppingCart erstellen (3 Carts)
INSERT INTO shopping_cart (id)
VALUES (1), (2), (3);

-- CartItems für Cart 1 hinzufügen
INSERT INTO shopping_cart_item (id, product_name, quantity, price, shopping_cart_id)
VALUES
    (1, 'Product 1', 1, 10.0, 1),
    (2, 'Product 2', 2, 20.0, 1),
    (3, 'Product 3', 3, 30.0, 1),
    (4, 'Product 4', 1, 15.0, 1),
    (5, 'Product 5', 2, 25.0, 1);

-- CartItems für Cart 2 hinzufügen
INSERT INTO shopping_cart_item (id, product_name, quantity, price, shopping_cart_id)
VALUES
    (6, 'Product 6', 1, 5.0, 2),
    (7, 'Product 7', 4, 40.0, 2),
    (8, 'Product 8', 1, 12.0, 2),
    (9, 'Product 9', 3, 35.0, 2),
    (10, 'Product 10', 2, 50.0, 2);

-- CartItems für Cart 3 hinzufügen
INSERT INTO shopping_cart_item (id, product_name, quantity, price, shopping_cart_id)
VALUES
    (11, 'Product 11', 1, 8.0, 3),
    (12, 'Product 12', 3, 28.0, 3),
    (13, 'Product 13', 2, 18.0, 3),
    (14, 'Product 14', 5, 38.0, 3),
    (15, 'Product 15', 1, 48.0, 3);
