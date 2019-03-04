create table board (
num number(3, 0) not null,
title VARCHAR2(100) not null,
reg_date date not null,
content varchar2(4000)
);

insert into board(num, title, reg_date)
values (1, '테스트1', sysdate);

insert into board(num, title, content, reg_date)
values (2, '테스트2', '내용', SYSDATE);

select * from board where num = 2 or num = 1 order by reg_date desc, num;
insert into board
values(999);
delete from board where num = 1;
drop table board;