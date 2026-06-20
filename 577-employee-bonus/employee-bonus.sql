# Write your MySQL query statement below
SELECT E.name ,B.bonus
from Employee E
left join Bonus B
ON B.empId = E.empId
where B.bonus is NULL OR B.bonus < 1000;