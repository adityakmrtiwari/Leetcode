# Write your MySQL query statement below
Select p.product_name , s.year , s.price from Sales s JOIN Product p on s.product_id = p.product_id;