# Write your MySQL query statement below
Select d.Name as Department,
       e.Name as Employee,
       e.Salary as Salary
From Employee e
Join Department d
    on e.departmentId = d.ID
Where e.salary = (
    Select Max(e2.salary) 
    From Employee e2
    where e2.departmentId = e.departmentId
);