# Write your MySQL query statement below

# with cte As
# (select query_name,rating/position As ratio,
# case when rating < 3 then 1
# else 0 end as quality_binary
# from Queries)

# select query_name , ROUND(avg(ratio),2) as
# quality,round((sum(quality_binary)/count(*))*100,2) as poor_query_percentage
# from cte
# group by query_name

SELECT 
    query_name,
    ROUND(AVG(rating/position), 2) AS quality,
    ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) / COUNT(*) * 100, 2) AS poor_query_percentage
FROM 
    Queries
WHERE query_name is not null
GROUP BY
    query_name;
