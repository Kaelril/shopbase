/*characteristic*/
insert into characteristic (char_id, name_characteristic) values (1,'Вкус');
insert into characteristic (char_id, name_characteristic) values (2,'Цвет');
insert into characteristic (char_id, name_characteristic) values (3,'Твердость');
insert into characteristic (char_id, name_characteristic) values (4,'Материал');
insert into characteristic (char_id, name_characteristic) values (5,'Вес');

/*customer*/
insert into customer (customer_id, card_customer, discount_customer) values (1,'ABCD',5);
insert into customer (customer_id, card_customer, discount_customer) values (2,'EFGH',10);
insert into customer (customer_id, card_customer, discount_customer) values (3,'IJKL',15);
insert into customer (customer_id, card_customer, discount_customer) values (4,'MNOP',10);
insert into customer (customer_id, card_customer, discount_customer) values (5,'QRST',5);

/*customerorders*/
insert into orders (orders_id, date_order, customer_id, price_order) values (1,'2018-06-23 11:52:01',2,1242);
insert into orders (orders_id, date_order, customer_id, price_order) values (2,'2018-06-24 13:30:17',3,676);
insert into orders (orders_id, date_order, customer_id, price_order) values (3,'2018-06-25 09:52:28',1,2684);
insert into orders (orders_id, date_order, customer_id, price_order) values (4,'2018-06-27 14:52:45',5,558);
insert into orders (orders_id, date_order, customer_id, price_order) values (5,'2018-06-29 17:59:59',4,800);

/*products*/
insert into products (prod_id, name_product, price_product, desc_product) values (1,'Мороженое "Алиса"',124.2,'Элитное морожение прямиком из Зазеркалья');
insert into products (prod_id, name_product, price_product, desc_product) values (2,'Чипсы "El Ace"',113.2,'Чипсы "El Ace", привезенные из Мексики');
insert into products (prod_id, name_product, price_product, desc_product) values (3,'Кофе "Nice Tlee"',134.2,'Кофе из настоящих кофейных зерен');
insert into products (prod_id, name_product, price_product, desc_product) values (4,'Поливитамины "Огурчик"',93,'Самое действенное лекарство от похмелья');
insert into products (prod_id, name_product, price_product, desc_product) values (5,'Кружка "Сувенирная"',100,'С гравировкой');

/*ordersproduct*/
insert into ordersproduct (orderprod_id, orders_id, prod_id, prod_quant) values (1,1,1,10);
insert into ordersproduct (orderprod_id, orders_id, prod_id, prod_quant) values (2,2,2,5);
insert into ordersproduct (orderprod_id, orders_id, prod_id, prod_quant) values (3,3,3,20);
insert into ordersproduct (orderprod_id, orders_id, prod_id, prod_quant) values (4,4,4,6);
insert into ordersproduct (orderprod_id, orders_id, prod_id, prod_quant) values (5,5,5,8);

/*productCharacteristic*/
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (1,1,1,'Апельсиновый');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (2,1,5,'100 г.');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (11,2,1,'Бекон');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (12,2,5,'150 г.');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (21,3,3,'Молотый рыхленый');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (22,3,5,'900 г.');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (31,4,1,'Безвкусный');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (32,4,2,'Белый');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (33,4,3,'Твердый');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (34,4,5,'310 г.');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (41,5,2,'Коричневый');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (42,5,4,'Глина');
insert into PRODUCTCHARACTERISTIC (prodchar_id,prod_id,char_id,char_value) values (43,5,5,'400 г.');