# Write your MySQL query statement below

select Email
from Person
group by email
having count(distinct id)>1;