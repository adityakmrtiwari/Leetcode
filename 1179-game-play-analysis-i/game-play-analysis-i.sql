# Write your MySQL query statement below
Select player_id , MIN(event_date) as first_login
From Activity 
Group by player_id;