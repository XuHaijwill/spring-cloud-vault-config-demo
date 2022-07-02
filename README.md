# spring-cloud-vault-config-demo
Hashicrop vault use demo

## 官网
https://learn.hashicorp.com/tutorials/vault/eaas-spring-demo

## 建表

```
CREATE TABLE orders (
    id bigserial primary key,
    customer_name varchar(60) NOT NULL,
    product_name varchar(20) NOT NULL,
    order_date timestamp NOT NULL
);
SELECT * FROM orders;

select order0_.id as id1_0_, order0_.customer_name as customer2_0_, 
order0_.order_date as order_da3_0_, order0_.product_name as product_4_0_ from orders order0_;
```

