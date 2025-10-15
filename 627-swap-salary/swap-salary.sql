# Write your MySQL query statement below
Update salary
SET sex = (CASE WHEN sex = 'f' THEN 'm' ELSE 'f' END)