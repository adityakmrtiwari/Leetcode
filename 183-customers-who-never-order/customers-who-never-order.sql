# Write your MySQL query statement below
Select c.name As Customers
from Customers c 
left join Orders o
on c.id = o.customerId
where o.customerId is null;
