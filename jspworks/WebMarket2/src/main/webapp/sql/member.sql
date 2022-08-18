--member 테이블
create table member(
	id varchar(10) not null,
	password varchar(10) not null,
	name varchar(20) not null,
	gender varchar(4),
	birth varchar(20),
	mail varchar(30),
	phone varchar(20),
	address varchar(50),
	regist_day varchar(30),	
	primary key(id)
);

insert into member values ('cloud', 'c1234', '김구름', '여', '1998-08-20'
, 'cld1234@naver.com', '010-1234-5678', '서울시 한복판 어딘가', '2022-08-17');

commit;
select * from member;

--drop table member;




