# Write your MySQL query statement below
Select p.product_name AS product_name,
SUM(o.unit) as unit
From Products p
Inner Join Orders o
On p.product_id = o.product_id
where o.order_date Like "2020-02-%"
Group by p.product_name
Having SUM(o.unit) >= 100