# Write your MySQL query statement below
select a.machine_id,round(sum(b.timestamp-a.timestamp)/count(a.machine_id),3) as processing_time
from activity a
join activity b
on (a.activity_type='start' and b.activity_type='end' and a.machine_id = b.machine_id and a.process_id = b.process_id)
group by a.machine_id