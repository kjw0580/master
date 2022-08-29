use javaweb;

create table t_member2(
	memberid	varchar(20),
    passwd		varchar(20) not null,
    name		varchar(30) not null,
    gender 		varchar(10),
    joindate	timestamp default now(),
    primary key(memberid)
);

create table t_board2(
	bnum	int primary key auto_increment,
    title	varchar(100) not null,
    content text,
    regdate timestamp default now(),
    hit 	int default 0,
    memberid varchar(20),
    constraint fk_memid foreign key (memberid)
    references t_member2(memberid) on delete cascade
);

-- 회원 추가
insert into t_member2 values ('sky', 's123456@', '강하늘', '남', default);

-- 게시글 추가
insert into t_board2 values (1, '제목입니다.', '글 내용입니다.', default, 0, 'sky');

truncate t_member2;
drop table t_member2;
drop table t_board2;
truncate t_board2;