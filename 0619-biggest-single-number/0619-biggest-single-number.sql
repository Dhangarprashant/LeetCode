# Write your MySQL query statement below

# with cte as
# (select num
# from Mynumbers
# group by num
# having count(num)=1)

# select case when count(*)>0 then max(num)
# else null end as num
# from cte;

SELECT MAX(num) AS num
FROM (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS unique_numbers;
