
select C.name as Customers
from Customers C
left join Orders O
On C.id=O.CustomerId
where O.id is null;
