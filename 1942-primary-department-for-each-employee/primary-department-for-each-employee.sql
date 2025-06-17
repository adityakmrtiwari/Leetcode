# Write your MySQL query statement below
Select DISTINCT employee_id , department_id 
from Employee
where employee_id in (
    Select employee_id
    from Employee
    Group by employee_id
    Having count(*)=1
) OR primary_flag = 'Y'
order by employee_id