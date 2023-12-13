-- Question 1
-- products

-- Question 2
-- columns
SELECT ProductID, ProductName, UnitPrice
-- table        put name of database in case multiple databases have the same table name
FROM northwind.products;

-- Question 3
select ProductID, ProductName, UnitPrice
FROM northwind.products
ORDER BY UnitPrice;

-- Question 4
SELECT ProductName
FROM northwind.products
WHERE UnitPrice <= 7.50;

-- Question 5
SELECT ProductName
FROM northwind.products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC;

-- Question 6
SELECT ProductName
FROM northwind.products
WHERE UnitsInStock >= 100
ORDER BY UnitPrice DESC, ProductName;

-- Question 7
SELECT *
FROM northwind.products
WHERE UnitsInStock = 0 AND UnitsOnOrder > 0
ORDER BY ProductName;

-- Question 8
-- categories

-- Question 9
SELECT *
FROM northwind.categories;
-- CategoryID of seafood is 8

-- Question 10
-- The products table identifies the category of each item sold by its CategoryID
SELECT ProductName
FROM northwind.products
ORDER BY CategoryID = 8;

-- Question 11
SELECT FirstName AND LastName
From northwind.employees;

-- Question 12
-- Steven Buchanan

-- Question 13
SELECT DISTINCT Title
FROM northwind.employees;

-- Question 14
SELECT FirstName AND LastName
FROM northwind.employees
WHERE Salary BETWEEN 2000 AND 2500;

-- Question 15
SELECT *
FROM northwind.suppliers;

-- Question 16
-- We know what supplier supplies each product by their SupplierID
SELECT ProductName
FROM northwind.products
WHERE SupplierID = 4;