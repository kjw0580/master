-- tbl_member 테이블 생성
CREATE TABLE tbl_member(
    userid      VARCHAR2(50) PRIMARY KEY,
    userpw       VARCHAR2(100) NOT NULL,
    username   VARCHAR2(100) NOT NULL,
    regdate       DATE DEFAULT SYSDATE,
    updatedate  DATE DEFAULT SYSDATE,
    enabled       CHAR(1) DEFAULT '1',
    email       VARCHAR2(50) NOT NULL
);

CREATE TABLE tbl_member(
    userid      VARCHAR(50) PRIMARY KEY,
    userpw       VARCHAR(100) NOT NULL,
    username   VARCHAR(100) NOT NULL,
    regdate       DATE DEFAULT current_timestamp,
    updatedate  DATE DEFAULT current_timestamp,
    enabled       CHAR(1) DEFAULT '1',
    email       varchar(50) NOT NULL
);

--권한 인증 테이블
CREATE TABLE tbl_member_auth(
    auth    VARCHAR2(50) NOT NULL,
    userid  VARCHAR2(50) NOT NULL,
    CONSTRAINT fk_member_auth FOREIGN KEY (userid)
    REFERENCES tbl_member(userid) ON DELETE CASCADE
);

--관리자 권한 변경
UPDATE tbl_member_auth SET auth='ROLE_ADMIN' WHERE userid='admin';

-- 외부 조인 : 특정 member의 회원정보와 권한 정보를 출력
SELECT mem.userid, userpw, username, enabled, regdate, updatedate, auth FROM tbl_member mem
    LEFT OUTER JOIN tbl_member_auth auth
    ON mem.userid = auth.userid
WHERE mem.userid = 'admin90';


SELECT * FROM tbl_member;
SELECT * FROM tbl_member_auth;

DROP TABLE tbl_member;
DROP TABLE tbl_member_auth;

COMMIT;