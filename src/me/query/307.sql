select * from tabs;
desc food;

create table food(
food_num number(3,0) not null primary key,
food_name varchar2(100) not null unique,
food_price number(5,0) not null
);

insert into food(food_num, food_name, food_price)
values(1, '¬¸ƒ°', 40000);

insert into food(food_num, food_name, food_price)
values(2, '¡∑πﬂ', 35000);

insert into food(food_num, food_name, food_price)
values(3, '√ π‰', 20000);

insert into food(food_num, food_name, food_price)
values(4, '¿Ø∫Œ√ π‰', 8000);

insert into food(food_num, food_name, food_price)
values(5, 'µ∑±ÓΩ∫', 8000);

commit;

select food_num, food_name, food_price from food;

select sum(Food_price), count(*), avg(food_price),
max(food_price), min(food_price) from food;

select * from food
where food_price = (select max(food_price) from food);

select * from food 
where food_price >= (select avg(food_price) from food);

select * from food 
where food_price < (select avg(food_price) from food);

select * from food
where food_price > 20000 and food_price < 40000;

select * from food
where food_price between 20001 and 39999;

select count(*) from food where food_price > (select avg(food_price) from food);

select * from food where food_price > (select avg(food_price) from food);

select * from food
where food_name like '√ π‰%';