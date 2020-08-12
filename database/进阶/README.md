# 数据库 
	以mysql 为例、 此页内容写在同级目录 demo.sql 文件中
	
_*_ 在此目录下操作 _*_

### 1. 建表 
	此次建表需要自己补充。不一一列举
	a. 创建一个管理员表 admin_info
		id, name, password, create_time, email, phone ...
		id为主键且自增  自己可以添加一些字段
	b. 创建一个角色表 role
		id, name, create_time, ...
		id为主键且自增
	c. 创建一个 管理员角色管理表 admin_role
		id, admin_id, role_id
		id为主键且自增、admin_id 是admin_info的外键、role_id 是 role表的外键

```
	了解 主键、外键
```

初始化一些数据、

### 2. 查
	a. 查询 所有的admin 信息，包括 name\password\email\phone\role_name\
	b. 查询 角色最多的一个管理员
	c. 查询 哪一种角色 分配的最多
	d. 查询 统计每个角色都分配了几个管理员
