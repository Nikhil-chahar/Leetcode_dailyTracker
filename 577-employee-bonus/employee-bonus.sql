# Write your MySQL query statement below
select E.name,B.bonus
from employee E
left join bonus B
on E.empId = B.empId
where B.bonus is null or B.bonus < 1000