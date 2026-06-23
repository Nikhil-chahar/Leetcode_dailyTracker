# Write your MySQL query statement below
-- select count(user_id) as c
-- from users
-- group by user_id


select r.contest_id,round(count(r.contest_id) / (select count(user_id) from users) *100,2) as percentage 
from users u
join register r
on u.user_id = r.user_id
group by r.contest_id
order by percentage DESC , r.contest_id 