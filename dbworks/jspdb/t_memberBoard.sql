-- MemberBoard2(MVC) 
show databases;
use jspdb;

create table t_member(
	memberid	varchar(20),
    passwd		varchar(20) not null,
    name		varchar(30) not null,
    gender 		varchar(10),
    joindate	timestamp default now(),
    primary key(memberid)
);

create table t_board(
	bnum	int primary key auto_increment,
    title	varchar(100) not null,
    content text,
    regdate timestamp default now(),
    memberid varchar(20),
    constraint fk_member_board foreign key (memberid)
    references t_member(memberid) on delete cascade
);

-- 회원 추가
insert into t_member values ('cloud', 'm123456#', '김기용', '남', default);
-- 게시글 추가
insert into t_board values (1, '제목입니다.', '글 내용입니다.', default, 'cloud');

select * from t_member;
select * from t_board;

select count(*) total from t_board;

select * from t_board order by bnum desc limit 11, 10;