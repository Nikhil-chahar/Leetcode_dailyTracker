SELECT s.product_id, s.year AS first_year,s.quantity,s.price
FROM sales s
join (
    select product_id, min(year) as first_year
    from sales
    group by product_id
) f
on s.product_id = f.product_id and
s.year = f.first_year;