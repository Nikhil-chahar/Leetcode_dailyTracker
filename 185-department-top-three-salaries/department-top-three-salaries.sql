select Department , Employee , Salary 
from (select d.name as Department,
    e.name as Employee, 
    e.salary as Salary,
    DENSE_RANK() over (PARTITION BY D.ID order by e.salary desc) as rnk
    from employee e
    left join department d
    on e.departmentid = d.id) as tem
WHERE rnk <= 3