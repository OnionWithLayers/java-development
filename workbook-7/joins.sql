-- Question 1
SELECT p.ProductID, p.ProductName, p.UnitPrice, c.CategoryName
FROM northwind.products p
INNER JOIN northwind.categories c
ON p.CategoryID = c.CategoryID
ORDER BY c.categoryName, p.ProductName;

-- Question 2
SELECT ProductID, ProductName, UnitPrice, CompanyName
FROM northwind.products
Inner Join northwind.suppliers
On Products.SupplierID = Suppliers.SupplierID
WHERE Products.UnitPrice > 75
ORDER BY ProductName;

-- Question 3
SELECT ProductID, ProductName, UnitPrice, CategoryName, CompanyName AS SupplierName
FROM northwind.products
Inner Join northwind.suppliers
On Products.SupplierID = Suppliers.SupplierID
INNER JOIN northwind.Categories
ON Products.CategoryID = Categories.CategoryID
ORDER BY ProductName;

-- Question 4
SELECT ProductName, CategoryName
FROM northwind.products
INNER JOIN categories 
ON Products.CategoryID = Categories.CategoryID
WHERE UnitPrice = ( SELECT MAX(UnitPrice) FROM northwind.products);

-- Question 5
SELECT OrderID, ShipName, ShipAddress, CompanyName, ShipCountry
FROM northwind.orders
INNER JOIN shippers
ON orders.ShipVia = shippers.ShipperID
WHERE ShipCountry LIKE "Germany";

-- Question 6
select o.OrderID, orders.OrderDate, orders.ShipName, orders.ShipAddress 
from `Order Details` o
Inner join northwind.Orders
on o.OrderID = Orders.OrderID
Inner join northwind.Products p
on o.ProductID = p.ProductID
where p.ProductName Like "Sasquatch Ale"; 