-- Write your PostgreSQL query statement below
  SELECT a0.machine_id,
         ROUND(CAST(AVG(a1.timestamp - a0.timestamp) as numeric), 3) as processing_time
    FROM Activity a0
         join Activity a1
              on a0.machine_id = a1.machine_id
   WHERE a0.activity_type = 'start'
     AND a1.activity_type = 'end'
GROUP BY a0.machine_id;
   