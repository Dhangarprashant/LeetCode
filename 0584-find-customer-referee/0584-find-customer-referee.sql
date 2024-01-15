# Write your MySQL query statement below


SELECT name 
FROM Customer
where COALESCE(referee_id,-1)<> 2 ;