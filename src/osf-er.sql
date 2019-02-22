
/* Drop Tables */

DROP TABLE board CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE board
(
	-- 이것은 번호다.
	num number(10,0) NOT NULL,
	-- 이것은 제목임
	title varchar2(150) NOT NULL,
	-- 이것은 내용이다.
	content varchar2(4000)
);



/* Comments */

COMMENT ON COLUMN board.num IS '이것은 번호다.';
COMMENT ON COLUMN board.title IS '이것은 제목임';
COMMENT ON COLUMN board.content IS '이것은 내용이다.';



