# Write your MySQL query statement below
SELECT v.customer_id, COUNT(*) as count_no_trans from Visits v
left join Transactions t on v.visit_id = t.visit_id
WHERE t.visit_id IS null
GROUP BY v.customer_id;
