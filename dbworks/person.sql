-- person 테이블 생성
CREATE TABLE person(
    userid  VARCHAR2(10) PRIMARY KEY,
    userpw  VARCHAR2(10) NOT NULL,
    name    VARCHAR2(20) NOT NULL,
    age     NUMBER(3)
);


--CS
DROP TABLE person;

SELECT * FROM person