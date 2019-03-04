create table user_info(
ui_num number(10,0) not null primary key,
ui_name varchar2(100) not null,
ui_id varchar2(100) not null UNIQUE,
ui_pwd varchar2(100) not null,
ui_email varchar2(200)
);

select * from user_info;
select * from board_info;

create sequence seq_ui_num;

insert into user_info(ui_num, ui_name, ui_id, ui_pwd, ui_email)
values(seq_ui_num.nextval, '꼬부기', 'blue', '이슬이', '2sulisgood@gmail.com');

commit;

alter table board_info
add ui_num number(10,0) references user_info(ui_num);

update board_info set ui_num = 1;
delete from user_info where ui_num = 3;

select * from board_info, user_info;

select * from board_info, user_info
where board_info.ui_num = user_info.ui_num;

select * from board_info, user_info
where board_info.ui_num(+) = user_info.ui_num;

select * from board_info bi, user_info ui
where bi.ui_num(+) = ui.ui_num;

select bi.bi_num, bi.bi_title, bi.bi_content, bi.bi_credat, bi.bi_cretim, bi.BI_ISACTIVE, ui.ui_name, ui.ui_email from board_info bi, user_info ui
where bi.ui_num(+) = ui.ui_num;

desc user_info;
private Integer uiNum;
private String uiName;
private String uiId;
private String uiPwd;
private String uiEmail;

select bi.*, ui.ui_name from board_info bi, user_info ui where bi.ui_num = ui.ui_num;