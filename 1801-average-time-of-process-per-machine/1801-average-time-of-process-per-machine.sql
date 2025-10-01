# Write your MySQL query statement below
-- select a1.machine_id, round(avg(a2.timestamp-a1.timestamp),3) as processing_time
-- from activity a1
-- join activity a2
-- on a1.machine_id=a2.machine_id
-- where a1.activity_type="start" and a2.activity_type="end" and a1.process_id=a2.process_id
-- group by a1.machine_id
-- order by a1.machine_id;

select 
machine_id, round(avg(end_time-start_time),3) as processing_time
from (select 
machine_id, process_id,
max(case when activity_type="start" then timestamp end) as start_time,
max(case when activity_type="end" then timestamp end) as end_time
from activity 
group by machine_id, process_id
) t 
group by machine_id;