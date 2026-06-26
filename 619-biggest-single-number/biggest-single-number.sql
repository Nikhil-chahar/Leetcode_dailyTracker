# Write your MySQL query statement below
select max(num) as num from
    (select distinct num,count(num) as cnt
    from mynumbers
    group by num
    having cnt=1) as t
