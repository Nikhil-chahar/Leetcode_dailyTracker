# Write your MySQL query statement below
SELECT V.customer_id,count(V.customer_id) as count_no_trans
FROM Visits V
left join Transactions T
ON V.visit_id = T.visit_id
where T.visit_id is null
group by V.customer_id 

