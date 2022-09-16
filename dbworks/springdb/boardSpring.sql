CREATE TABLE tbl_board(
    bno NUMBER(5),
    title VARCHAR2(200),
    writer VARCHAR2(20),
    content VARCHAR2(2000),
    regdate DATE DEFAULT SYSDATE,
    updatedate DATE DEFAULT SYSDATE,
    cnt NUMBER(5) DEFAULT 0
);

ALTER TABLE tbl_board ADD CONSTRAINT pk_board PRIMARY KEY(bno);

--자동 번호
CREATE SEQUENCE seq;
DROP SEQUENCE  seq;

--게시글 추가
INSERT INTO tbl_board(bno, title, writer, content) 
VALUES (seq.nextval, '가입인사', '관리자', '잘 부탁드립니다.');

--users 테이블 생성
CREATE TABLE tbl_users(
    id       VARCHAR2(8) PRIMARY KEY,
    passwd   VARCHAR2(8) NOT NULL,
    name     VARCHAR2(20) NOT NULL,
    role     VARCHAR2(5)
 );
 
DROP TABLE tbl_board; 

 --회원 추가
INSERT INTO tbl_users
VALUES ('test', 'test123', '관리자', 'Admin');

INSERT INTO tbl_users
VALUES ('user1', 'user123', '장그래', 'User');

SELECT * FROM tbl_board;
SELECT * FROM tbl_users;

--2페이지 가져올 수 없음 (0보다 크게 시작해야만 가져올수 있음)
SELECT /*+ INDEX_DESC(tbl_board pk_board) */
ROWNUM, bno, title, writer, content
FROM tbl_board WHERE ROWNUM >10 AND ROWNUM <=20;

SELECT * FROM
(
    SELECT /*+ INDEX_DESC(tbl_board pk_board) */
    ROWNUM rn, bno, title, writer, content
    FROM tbl_board
    WHERE ROWNUM <= (2 * 10)
)
WHERE rn > (1-1) * 10;

COMMIT;