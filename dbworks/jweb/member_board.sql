--회원 테이블
CREATE TABLE t_member(
    memberid VARCHAR2(20) PRIMARY KEY,
    passwd VARCHAR2(20) NOT NULL,
    name VARCHAR2(30) NOT NULL,
    gender VARCHAR2(10),
    joindate DATE DEFAULT SYSDATE
);

INSERT INTO t_member VALUES ('cloud', 'm12345', '김기용', '남', SYSDATE);

SELECT * FROM t_member;

DROP TABLE t_member CASCADE CONSTRAINTS;

COMMIT;

SELECT * FROM t_member WHERE memberid='cloud' and passwd='m12345';