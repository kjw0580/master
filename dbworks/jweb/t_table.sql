--게시글 테이블
CREATE TABLE t_board(
    bnum NUMBER(4) PRIMARY KEY,
    title VARCHAR2(100) NOT NULL,
    content VARCHAR2(2000) NOT NULL,
    regdate DATE DEFAULT SYSDATE,
    memberId VARCHAR2(20),
    CONSTRAINT FK_MemberBoard FOREIGN KEY (memberId) REFERENCES t_member(memberId)
);

CREATE SEQUENCE b_seq;

INSERT INTO t_board VALUES (b_seq.NEXTVAL, '제목입니다.', '글 내용입니다', SYSDATE, 'cloud');

SELECT * FROM t_board;

COMMIT;

SELECT * FROM t_member WHERE memberid='cloud' and passwd='m12345';