# Write your MySQL query statement below


SELECT name 
FROM Customer
where IFNULL(referee_id,-1)<> 2 ;