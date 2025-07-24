# Write your MySQL query statement below
-- Select v.customer_id , COUNT(v.visit_id) AS count_no_trans
-- FROM Visits v
-- where visit_id NOT IN (Select visit_id from Transactions)
-- Group by v.customer_id;

Select v.customer_id , COUNT(v.visit_id) AS count_no_trans
FROM Visits v Left join Transactions t
on v.visit_id = t.visit_id 
where t.visit_id is null
Group by v.customer_id;
