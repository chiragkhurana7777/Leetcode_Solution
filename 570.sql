# Write your MySQL query statement below
select e.name from employee e where 5<= (select count(managerid) from employee where managerid=e.id);