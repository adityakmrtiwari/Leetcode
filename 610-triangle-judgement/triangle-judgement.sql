# Write your MySQL query statement below
Select x,y,z,
CASE
when (x+y)>z AND (x+z)>y AND (y+z)>x
then 'Yes'
else 'No'
END as triangle 
-- ending the case and store in triangle
From triangle