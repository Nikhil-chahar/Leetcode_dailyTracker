# Write your MySQL query statement below

-- round(val,2) as 

-- SELECT count(c.action)
-- from Signups s
-- left join confirmations c
-- on s.user_id = c.user_id
-- where c.action="confirmed"
-- group by c.action,c.user_id

SELECT s.user_id ,
round(ifnull(SUM(CASE WHEN c.action='confirmed' THEN 1 ELSE 0 END)/count(c.action),0),2) as confirmation_rate
from Signups s
left join confirmations c
on s.user_id = c.user_id
group by s.user_id
