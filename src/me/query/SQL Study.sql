create table order_board(
order_num number(10) not null primary key,
buyer varchar2(100) not null,
buyAdr varchar2(1000) not null,
reqName varchar2(100) not null,
reqCnt number(10) not null,
reqDat char(8),
reqTim char(6)
);

create SEQUENCE seq_order_board_order_num;