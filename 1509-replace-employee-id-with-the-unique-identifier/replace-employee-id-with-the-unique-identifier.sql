# Write your MySQL query statement below
select Em.unique_id,E.name from employees E
left join EmployeeUNI Em
on Em.id = E.id;