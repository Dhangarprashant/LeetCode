select firstname,lastname,city,state
from Person
left join Address
on person.personId=Address.personId;