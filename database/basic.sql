create table user_info(
id int(11) not null primary key auto_increment,
name varchar(64) not null,
age int(11),
birthday datetime,
password varchar(64) not null
);

insert into user_info
(id,name,age,birthday,password)
values
(11,'吕布',1,'1990-10-30 12:21:30',1);


insert into user_info
(id,name,age,birthday,password) 
values
(1,'Jayzhou',30,'2019-07-30 04:34:50',3453),
(2,'张三',30,'2009-06-30 09:01:50',33),
(3,'李四',24,'1000-12-30 12:21:33',1233),
(4,'王五',15,'1279-07-30 12:21:20',145),
(5,'赵六',14,'1934-11-30 12:21:32',1543),
(12,'赵云',2,'1995-10-25 12:24:55',95),
(13,'典韦',2,'1128-02-13 11:22:33',96),
(14,'关羽',2,'1455-10-25 12:24:55',97),
(15,'马超',2,'3455-11-25 09:24:15',98),
(16,'张飞',2,'2345-06-25 04:24:55',99) ;


delete from user_info where id = 1 ;
delete from user_info where id > 5 and age < 18; 

update user_info set password = 87654321 where id = 2 ;
update user_info set birthday = '2020-08-12 12:21:59' where name = '张三' ;

select * from user_info;
select * from user_info where id < 10 ;
select * from user_info where birthday = null ;