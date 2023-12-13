-- Question 1
SELECT ProductName
FROM northwind.products
-- = is for one value in the subQuery
-- IN is for getting a list from the subQuery
WHERE UnitPrice = (SELECT  MAX(UnitPrice) FROM northwind.products);

-- Question 2
SELECT OrderID as OrderNumber, ShipName, ShipAddress
FROM northwind.orders
WHERE ShipVia = (
SELECT ShipperID
FROM northwind.shippers
WHERE CompanyName LIKE "Federal Shipping");

-- Question 3
SELECT OrderID AS OrderIDsOfSasquatchAle
FROM northwind.`order details`
WHERE ProductID =
(SELECT ProductID
FROM northwind.products
WHERE ProductName LIKE "Sasquatch Ale");

-- Question 4
SELECT FirstName, LastName
FROM northwind.employees
WHERE EmployeeID = 
(SELECT EmployeeID
FROM northwind.orders
WHERE OrderID = 10266);

-- Question 5
SELECT ContactName
FROM northwind.customers
WHERE CustomerID =
(SELECT CustomerID
FROM northwind.orders
WHERE OrderID = 10266);