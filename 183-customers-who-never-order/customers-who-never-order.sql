# Write your MySQL query statement below
Select name As Customers
From Customers
where id Not in(
    Select customerId From orders 
);


-- SELECT c.name AS Customers
-- FROM Customers c
-- LEFT JOIN Orders o ON c.id = o.customerId
-- WHERE o.customerId IS NULL;