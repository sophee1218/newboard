
/* Drop Triggers */

DROP TRIGGER TRI_Alone_num;



/* Drop Tables */

DROP TABLE member_tbl_02 CASCADE CONSTRAINTS;



/* Drop Sequences */

DROP SEQUENCE SEQ_Alone_num;




/* Create Sequences */

CREATE SEQUENCE SEQ_Alone_num INCREMENT BY 1 START WITH 1;



/* Create Tables */

CREATE TABLE member_tbl_02
(
	custno number(6) NOT NULL,
	custname varchar2(20),
	phone varchar2(13),
	address varchar2(60),
	joindate date,
	grade char(1),
	city char(2),
	PRIMARY KEY (custno)
);



/* Create Triggers */

CREATE OR REPLACE TRIGGER TRI_Alone_num BEFORE INSERT ON Alone
FOR EACH ROW
BEGIN
	SELECT SEQ_Alone_num.nextval
	INTO :new.num
	FROM dual;
END;

/




