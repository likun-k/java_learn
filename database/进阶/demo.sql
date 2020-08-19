create table admin(
	id int primary key auto_increment,
	name varchar(255) not null,
	email varchar(255) not null,
	password int not null,
	address varchar(255)
);

create table role(
	id int primary key auto_increment,
	name varchar(255) not null
);

create table admin_role(
	id int primary key auto_increment,
	role_id int,
	admin_id int,
	foreign key(role_id) references role(id),
	foreign key(admin_id) references admin(id)
);

insert into admin values 
(1,'张三','111@abc.com',111,'华夏'),
(2,'李四','222@abc.com',222,'华夏'),
(3,'王五','333@abc.com',333,'华夏'),
(4,'赵六','444@abc.com',444,'华夏'),
(5,'孙七','555@abc.com',555,'华夏');

insert into role values 
(1,'吕布'),		 
(2,'赵云'),
(3,'典韦'),
(4,'关羽'),
(5,'马超'),
(6,'张飞'),
(7,'许褚'),
(8,'黄忠'),
(9,'张辽');
						   	  
insert into admin_role values 
(1,1,1),
(2,2,3),
(3,3,2),	
(4,4,4),
(5,5,2),
(6,6,2),
(7,7,3),
(8,8,1),
(9,9,5),
(10,5,4),
(11,6,3),
(12,8,2),
(13,9,3),
(14,2,1),
(15,1,5),
(16,1,4),
(17,4,3),
(18,8,5),	
(19,5,3),
(20,5,1);

select
	b.id,r.name as '角色',a.name as '管理员',a.email as '邮箱',a.password as '密码',a.address as '地址'
from 
	admin_role b
join 
	role r
on 
	b.role_id = r.id
join 
	admin a
on
	b.admin_id = a.id
order by 
	b.id;

select 
	admin,count(role) as role
from 
	(select
	a.name as admin,r.name as role
from 
	admin_role b
join 
	role r
on 
	b.role_id = r.id
join 
	admin a
on
	b.admin_id = a.id) t
group by
	admin
order by 
	role desc
limit 
	0,1;

select 
	role,count(admin) as admin
from 
	(select
	a.name as admin,r.name as role,b.id
from 
	admin_role b
join 
	role r
on 
	b.role_id = r.id
join 
	admin a
on
	b.admin_id = a.id) t
group by
	role
order by 
	admin desc
limit 
	0,1;

select 
	role,count(admin) as admin
from 
	(select
	a.name as admin,r.name as role,b.id
from 
	admin_role b
join 
	role r
on 
	b.role_id = r.id
join 
	admin a
on
	b.admin_id = a.id) t
group by
	role;



























	