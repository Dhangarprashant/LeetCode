# Write your MySQL query statement below

# select p.product_id,ROUND(sum(p.price*u.units)/sum(u.units),2) as average_price
# from Prices p
# inner join UnitsSold u
# on p.product_id=u.product_id
# where u.purchase_date between p.start_date and p. end_date
# group by p.product_id;

SELECT p.product_id, IFNULL(round(SUM(p.price*u.units)/sum(u.units),2),0) as average_price
FROM Prices p 
LEFT JOIN UnitsSold u
ON p.product_id = u.product_id AND 
u.purchase_date BETWEEN p.Start_date and p.end_date
GROUP BY p.product_id