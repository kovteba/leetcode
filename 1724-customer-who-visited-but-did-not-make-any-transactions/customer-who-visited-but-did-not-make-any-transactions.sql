-- Write your PostgreSQL query statement below
  SELECT v.customer_id,
         COUNT(v.customer_Id) as count_no_trans
    FROM Visits v
         left join Transactions t
                   on v.visit_id = t.visit_id
   WHERE t.transaction_id is null
GROUP BY v.customer_id;