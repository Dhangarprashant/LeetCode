# Write your MySQL query statement below

with cte as
(select num
from Mynumbers
group by num
having count(num)=1)

select case when count(*)>0 then max(num)
else null end as num
from cte;