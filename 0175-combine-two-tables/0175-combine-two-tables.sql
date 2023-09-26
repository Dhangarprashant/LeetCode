# Write your MySQL query statement below


# select firstName,lastName,city,state
# from Person
# LEFT JOIN Address
# on Person.personId=Address.personId;

select p.firstname,p.lastname,a.city,a.state
from person p
left join address a
on p.personid=a.personid;