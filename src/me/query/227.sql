create table board_info(
bi_num number(10,0) not null primary key,
bi_title varchar2(1000) not null, 
bi_content varchar2(4000) not null,
bi_credat char(8) not null, 
bi_cretim char(6) not null,
bi_cnt number default 0,
bi_isactive char(1) default 1
);

insert into board_info(bi_num, bi_title, bi_content, bi_credat, bi_cretim)
values(seq_bi_num.nextval, '게시물1번', '게시물내용1',to_char(sysdate, 'yyyymmdd'), to_char(sysdate, 'hh24miss'));

select sysdate, to_char(sysdate, 'yyyymmdd'),
to_char(sysdate, 'hh24miss')  from dual;

select * from board_info;

rollback;

select seq_bi_num.nextval from dual;

update board_info
set bi_title = '게시물3번',
bi_content = '게시물 내용2'
where bi_num = 1;

commit;

delete from board_info
where bi_num = 4;

create sequence seq_bi_num;

drop sequence seq_bi_num;

select seq_bi_num.nextval from dual;