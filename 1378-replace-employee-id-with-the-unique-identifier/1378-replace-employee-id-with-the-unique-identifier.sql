# Write your MySQL query statement below


SELECT e2.unique_id,name
from Employees e1
left join EmployeeUNI e2
on e1.id =e2.id;
