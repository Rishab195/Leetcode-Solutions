# Write your MySQL query statement below

-- select s.machine_id ,round(avg(e.timestamp-s.timestamp),3)
-- as processing_time
-- from activity s
-- join activity e
-- on e.machine_id=s.machine_id
-- where s.activity_type='start' and e.activity_type='end'
-- group by e.machine_id;


Select s.machine_id , round(avg(e.timestamp-s.timestamp),3)
as processing_time from Activity s join Activity e on s.machine_id=e.machine_id
where s.activity_type='start' and e.activity_type='end' group by s.machine_id;