
WITH latest AS (
    SELECT product_id,
           MAX(change_date) AS last_date
    FROM Products
    WHERE change_date <= '2019-08-16'
    GROUP BY product_id
)

SELECT DISTINCT p1.product_id,
       COALESCE(p2.new_price, 10) AS price
FROM Products p1
LEFT JOIN latest l
       ON p1.product_id = l.product_id
LEFT JOIN Products p2
       ON l.product_id = p2.product_id
      AND l.last_date = p2.change_date;