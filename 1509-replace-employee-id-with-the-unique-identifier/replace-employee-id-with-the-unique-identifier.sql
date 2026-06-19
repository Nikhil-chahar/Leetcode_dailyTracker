# Write your MySQL query statement below
SELECT Em.unique_id,E.name
FROM Employees E
LEFT JOIN EmployeeUNI as Em
ON E.id = Em.id;