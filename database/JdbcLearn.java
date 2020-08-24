import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcLearn {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basic","root","kuso3284");

            //获取数据库操作对象
            stmt = conn.createStatement();

            //执行SQL语句

            String sql = "create table user_info(\n" +
                    "\tid int(11) not null primary key auto_increment,\n" +
                    "\tname varchar(64) not null,\n" +
                    "\tage int(11),\n" +
                    "\tbirthday datetime,\n" +
                    "\tpassword varchar(64) not null\n" +
                    ")";

            stmt.executeUpdate(sql);


            String sql1 = "insert into user_info\n" +
                    "\t(id,name,age,birthday,password)\n" +
                    "values\n" +
                    "\t(11,'吕布',1,'1990-10-30 12:21:30',1)";

            stmt.executeUpdate(sql1);

            String sql2 = "insert into user_info\n" +
                    "\t(id,name,age,birthday,password) \n" +
                    "values\n" +
                    "\t(1,'Jayzhou',30,'2019-07-30 04:34:50',3453),\n" +
                    "\t(2,'张三',30,'2009-06-30 09:01:50',33),\n" +
                    "\t(3,'李四',24,'1000-12-30 12:21:33',1233),\n" +
                    "\t(4,'王五',15,'1279-07-30 12:21:20',145),\n" +
                    "\t(5,'赵六',14,'1934-11-30 12:21:32',1543),\n" +
                    "\t(12,'赵云',2,'1995-10-25 12:24:55',95),\n" +
                    "\t(13,'典韦',2,'1128-02-13 11:22:33',96),\n" +
                    "\t(14,'关羽',2,'1455-10-25 12:24:55',97),\n" +
                    "\t(15,'马超',2,'3455-11-25 09:24:15',98),\n" +
                    "\t(16,'张飞',2,'2345-06-25 04:24:55',99)";

            stmt.executeUpdate(sql2);

            String sql7 = "select id,name,age,birthday,password from user_info";
            rs = stmt.executeQuery(sql7);
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String birthday = rs.getString("birthday");
                String password = rs.getString("password");
                System.out.println(id+"-姓名:"+name+"-年龄:"+age+"-生日:"+birthday+"-密码:"+password);
            }

            System.out.println("------------------------------------------------------");

            String sql8 = "select * from user_info where id < 10";
            rs = stmt.executeQuery(sql8);
            while (rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                System.out.println(id+"-姓名:"+name);
            }

            System.out.println("------------------------------------------------------");

            String sql9 = "select * from user_info where birthday = null";
            rs = stmt.executeQuery(sql9);
            while (rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                System.out.println(id+"-姓名:"+name);
            }


            String sql3 = "delete from user_info where id = 1";
            stmt.executeUpdate(sql3);

            String sql4 = "delete from user_info where id > 5 and age <18";
            stmt.executeUpdate(sql4);

            String sql5 = "update user_info set password = 87654321 where id = 2";
            stmt.executeUpdate(sql5);

            String sql6 = "update user_info set birthday = '2020-08-12 12:21:59' where name = '张三'";
            stmt.executeUpdate(sql6);

            System.out.println("------------------------------------------------------");

            String sql10 = "select id,name,age,birthday,password from user_info";
            rs = stmt.executeQuery(sql10);
            System.out.println("最后的结果");
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String birthday = rs.getString("birthday");
                String password = rs.getString("password");
                System.out.println(id+"-姓名:"+name+"-年龄:"+age+"-生日:"+birthday+"-密码:"+password);
            }

            System.out.println("------------------------------------------------------");

            String sql11 = "select\n" +
                    "\ta.name as admin,count(r.name) as role\n" +
                    "from \n" +
                    "\tadmin_role b\n" +
                    "join \n" +
                    "\trole r\n" +
                    "on \n" +
                    "\tb.role_id = r.id\n" +
                    "join \n" +
                    "\tadmin a\n" +
                    "on\n" +
                    "\tb.admin_id = a.id\n" +
                    "group by\n" +
                    "\tadmin\n" +
                    "order by \n" +
                    "\trole desc\n" +
                    "limit \n" +
                    "\t0,1";
            rs = stmt.executeQuery(sql11);

            //处理查询结果集
            while(rs.next()){
                String admin = rs.getString("admin");
                String role = rs.getString("role");
                System.out.println("角色最多的管理员是：" + admin + ",有" + role + "个角色");
            }

            String sql12 = "select\n" +
                    "\tcount(a.name) as admin,r.name as role\n" +
                    "from \n" +
                    "\tadmin_role b\n" +
                    "join \n" +
                    "\trole r\n" +
                    "on \n" +
                    "\tb.role_id = r.id\n" +
                    "join \n" +
                    "\tadmin a\n" +
                    "on\n" +
                    "\tb.admin_id = a.id\n" +
                    "group by\n" +
                    "\trole\n" +
                    "order by \n" +
                    "\tadmin desc\n" +
                    "limit \n" +
                    "\t0,1";
            rs = stmt.executeQuery(sql12);
            while(rs.next()){
                String admin = rs.getString("admin");
                String role = rs.getString("role");
                System.out.println("分配的管理员最多的角色是：" + role + ",有" + admin + "个管理员");
            }

            String sql13 = "select\n" +
                    "\tcount(a.name) as admin,r.name as role\n" +
                    "from \n" +
                    "\tadmin_role b\n" +
                    "join \n" +
                    "\trole r\n" +
                    "on \n" +
                    "\tb.role_id = r.id\n" +
                    "join \n" +
                    "\tadmin a\n" +
                    "on\n" +
                    "\tb.admin_id = a.id\n" +
                    "group by\n" +
                    "\trole";
            rs = stmt.executeQuery(sql13);
            while(rs.next()){
                String admin = rs.getString("admin");
                String role = rs.getString("role");
                System.out.println("角色：" + role + "有" + admin + "个管理员");
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null){
                try{
                    stmt.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if (conn != null){
                try{
                    conn.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
