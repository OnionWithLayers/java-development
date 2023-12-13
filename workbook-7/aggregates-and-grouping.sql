-- Question 1
SELECT COUNT(*) AS SupplierCount
FROM northwind.suppliers;

-- Question 2
SELECT SUM(Salary)
FROM northwind.employees;

-- Question 3
SELECT MIN(UnitPrice) AS CheapestPrice
FROM northwind.products;

-- Question 4
SELECT AVG(UnitPrice) AS AvgPrice
FROM northwind.products;

-- Question 5
SELECT MAX(UnitPrice)
FROM northwind.products;

-- Question 6
SELECT SupplierID, COUNT(ProductID) AS Counted_Products
FROM northwind.products
GROUP BY SupplierID;

-- Question 7
SELECT CategoryID, AVG(UnitPrice) AS Avg_Price
FROM northwind.products
GROUP BY CategoryID;

-- Question 8 HELPPPP
SELECT SupplierID, COUNT(UnitsOnOrder) AS Counted_Order
FROM northwind.products
GROUP BY SupplierID
HAVING COUNT(UnitsOnOrder >= 5);

-- Question 9
SELECT ProductID, ProductName, UnitPrice * UnitsInStock AS InventoryValue
FROM northwind.products
ORDER BY InventoryValue DESC;