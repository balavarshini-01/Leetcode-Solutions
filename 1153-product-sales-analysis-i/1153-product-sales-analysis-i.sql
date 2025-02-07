select product.product_name,sales.year,sales.price
from Sales
join product 
on product.product_id=sales.product_id; 