# Write your MySQL query statement below
Select e.Name As Employee 
from Employee e left join Employee f
On e.managerId = f.id 
where  e.salary> f.salary