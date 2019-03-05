
/* Drop Triggers */

DROP TRIGGER TRI_Class_info_ci_num;
DROP TRIGGER TRI_StudentInfo_si_num;
DROP TRIGGER TRI_Student_Info_si_num;



/* Drop Tables */

DROP TABLE Student_Info CASCADE CONSTRAINTS;
DROP TABLE Class_info CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_Class_info_ci_num;
DROP SEQUENCE SEQ_StudentInfo_si_num;
DROP SEQUENCE SEQ_Student_Info_si_num;




/* Create Sequences */

CREATE SEQUENCE SEQ_Class_info_ci_num INCREMENT BY 1 START WITH 1;
CREATE SEQUENCE SEQ_Student_Info_si_num INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE Class_info
(
	ci_num number(2,0) NOT NULL,
	ci_name varchar2(100) NOT NULL UNIQUE,
	ci_cnt number(3,0) DEFAULT 0 NOT NULL,
	ci_desc varchar2(4000),
	PRIMARY KEY (ci_num)
);


CREATE TABLE Student_Info
(
	si_num number(4,0) NOT NULL,
	si_id varchar2(100) NOT NULL UNIQUE,
	si_pwd varchar2(100) NOT NULL,
	si_name varchar2(100) NOT NULL,
	si_age number(3,0) NOT NULL,
	si_phone varchar2(15),
	ci_num number(2,0) NOT NULL,
	PRIMARY KEY (si_num)
);



/* Create Foreign Keys */

ALTER TABLE Student_Info
	ADD FOREIGN KEY (ci_num)
	REFERENCES Class_info (ci_num)
;



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_Class_info_ci_num BEFORE INSERT ON Class_info
FOR EACH ROW
BEGIN
	SELECT SEQ_Class_info_ci_num.nextval
	INTO :new.ci_num
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_StudentInfo_si_num BEFORE INSERT ON StudentInfo
FOR EACH ROW
BEGIN
	SELECT SEQ_StudentInfo_si_num.nextval
	INTO :new.si_num
	FROM dual;
END;

/

CREATE OR REPLACE TRIGGER TRI_Student_Info_si_num BEFORE INSERT ON Student_Info
FOR EACH ROW
BEGIN
	SELECT SEQ_Student_Info_si_num.nextval
	INTO :new.si_num
	FROM dual;
END;

/




