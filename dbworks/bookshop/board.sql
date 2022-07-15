--시퀀스 생성
CRATE SEQUENCE mySeq


--board 테이블 생성
CREATE TABLE board(
    bno NUMBER(4) PRIMARY KEY, --글번호
    title VARCHAR2(50) NOT NULL, --글제목
    content VARCHAR2(2000) NOT NULL, --글내용
    regDate DATE DEFAULT SYSDATE --등록일
);

--게시글 추가
INSERT INTO board (bno, title, content, regDate) VALUES(mySeq.NEXTVAL, '제목1', '제목1 내용입니다', SYSDATE);
INSERT INTO board (bno, title, content, regDate) VALUES(mySeq.NEXTVAL, '제목2', '제목2 내용입니다', SYSDATE);
INSERT INTO board (bno, title, content, regDate) VALUES(mySeq.NEXTVAL, '제목3', '제목3 내용입니다', SYSDATE);

SELECT * FROM board;

SELECT * FROM board WHERE bno=2;

--게시글 번호를 기준으로 내림차순 정렬하시오.
SELECT * FROM board ORDER BY bno DESC;

--게시글 3번의 글내용을 '감사합니다'로 수정하시오.
UPDATE board SET title = 'hello', content = '감사합니다.' WHERE bno = 3;

--게시글 2번을 삭제하시오
DELETE FROM board WHERE bno = 2;

COMMIT;