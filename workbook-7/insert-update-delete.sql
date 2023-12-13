USE northwind;

-- QUESTION 1
INSERT INTO suppliers
VALUES (30, "Supplier Bros", "Mario", "Player 1", "Peach's Castle", "Toad Town", 
"Nintendo", "M K", "MushroomKingdom", "(929-55-MARIO)", NULL, "#www.thesupermariobros.movie");

-- QUESTION 2
INSERT INTO products
VALUES (78, "Power Mushroom", 30, 2, "12 boxes", 20, 50, 200, 3, 0);

-- QUESTION 3
SELECT p.SupplierID, p.ProductName, s.CompanyName
FROM products p
LEFT JOIN suppliers s
ON p.SupplierID = s.SupplierID
ORDER BY SupplierID;

-- QUESTION 4
UPDATE products
SET UnitPrice = UnitPrice * 1.15
WHERE ProductID = 78;

-- QUESTION 5
SELECT ProductName, UnitPrice
FROM products
WHERE SupplierID = 30;

-- QUESTION 6
DELETE FROM products
WHERE ProductID = 78;

-- QUESTION 7
DELETE FROM suppliers
WHERE SupplierID = 30;

-- QUESTION 8
SELECT * FROM products;

-- QUESTION 9
SELECT * FROM suppliers;