# Write your MySQL query statement below
-- subquery for getting the id first from the table and then calculate for the  other part 
-- like checking the id that having count greater than 5
select name from Employee
where id  in (select managerid from Employee  group by managerId having count(managerId) >= 5);
-- group by managerId
-- having count(managerId) >= 5