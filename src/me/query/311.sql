create table users(
name varchar2(200),
birth varchar2(200), 
id varchar2(200),
pwd varchar2(200));

select * from users;

select * from users where name is null;

delete from users where rtrim(name);

select * from order_board;
desc order_board;

select * from food;


insert into order_board (order_num, buyer, buyadr, reqname, reqcnt, reqdat, reqtim)
values (10, '123', '123', '123', 123, to_char(sysdate, 'yyyymmdd'), to_char(sysdate, 'hh24miss'));

commit;