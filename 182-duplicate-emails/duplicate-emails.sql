# Write your MySQL query statement below
Select Distinct p.Email 
from Person p 
GROUP BY p.Email
Having count(p.email)>=2;