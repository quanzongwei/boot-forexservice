INSERT  INTO exchange_value(id,currency_from,currency_to,conversion_multiple,port)
VALUES (1,'USD','INR',10,0);

INSERT  INTO exchange_value(id,currency_from,currency_to,conversion_multiple,port)
VALUES (2,'USD','EUR',20,0);
-- 奇怪 会报主键冲突,数据却没有插进去 TODO 不管
INSERT  INTO exchange_value(id,currency_from,currency_to,conversion_multiple,port)
VALUES (3,'USD','INR',30,0);