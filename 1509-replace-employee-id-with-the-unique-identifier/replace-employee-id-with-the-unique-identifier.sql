# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT
EmployeeUNI.unique_id, Employees.name
FROM Employees
LEFT JOIN EmployeeUNI on Employees.id = EmployeeUNI.id


-- A LEFT JOIN is used when you want to include all records from the left table (Employees), even if there is no matching record in the right table (EmployeeUNI).

-- why left join 
-- - It ensures that all employees are included in the result, regardless of whether they have a corresponding unique ID in EmployeeUNI.
