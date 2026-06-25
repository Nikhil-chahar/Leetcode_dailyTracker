WITH first_order AS (
    SELECT *,
           ROW_NUMBER() OVER(
               PARTITION BY customer_id
               ORDER BY order_date
           ) AS rn
    FROM Delivery
)
SELECT ROUND(
           100 * AVG(
               CASE
                   WHEN order_date = customer_pref_delivery_date
                   THEN 1 ELSE 0
               END
           ),
           2
       ) AS immediate_percentage
FROM first_order
WHERE rn = 1;