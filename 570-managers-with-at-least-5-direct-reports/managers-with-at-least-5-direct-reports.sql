# Write your MySQL query statement below
Select e.name 
from Employee e 
join Employee f 
on e.id=f.managerId
Group By f.managerId
Having Count(f.managerId)>=5;


-- SELECT name
-- FROM Employee e
-- WHERE (
--     SELECT COUNT(*)
--     FROM Employee f
--     WHERE f.managerId = e.id
-- ) >= 5;
