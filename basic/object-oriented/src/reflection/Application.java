package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {

	public static void main(String[] args) throws Exception {
		try {
			Class<?> c = Class.forName("reflection.Users");
			//第一种写法
			Constructor con = c.getConstructor();
			Users user = (Users)con.newInstance();
			
//			Users user = new Users();//第二种写法
//			Users user = (Users) c.newInstance();//第三种写法
		
			//循环打印出所有属性
			Field[] ms = user.getClass().getDeclaredFields();
			for(Field f : ms) {
				System.out.println("属性名称:  " + f.getName());
			}
			
			System.out.println("--------------------");
			
			//获取构造方法名称
			Constructor[] cons = c.getDeclaredConstructors();
			for(Constructor a : cons) {
				System.out.println("构造方法名称： " + a.getName());
			}
			
			System.out.println("--------------------");
			
			//单独对name属性赋值
//			Field f1 = user.getClass().getDeclaredField("name");
//			f1.setAccessible(true);
//			f1.set(user, "A");
			
			Field f1 = c.getDeclaredField("name");
			f1.setAccessible(true);
			f1.set(user, "JayZhou");
			String name = (String)f1.get(user);
			System.out.println("名字是： " + name);
			
			Field f2 = c.getDeclaredField("password");
			f2.setAccessible(true);
			f2.set(user, "3284");
			String password = (String)f2.get(user);
			System.out.println("密码是： " + password);
			
			Field f3 = c.getDeclaredField("age");
			f3.setAccessible(true);
			f3.set(user, 21);
			int age = (int)f3.get(user);
			System.out.println("年龄是： " + age);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse("1995-10-27");
			
			Field f4 = c.getDeclaredField("birthday");
			f4.setAccessible(true);
			f4.set(user, d);
			Date birthday = (Date)f4.get(user);
			System.out.println("生日是： " + birthday);
						
			System.out.println("--------------------");
			//调用eat和sleep方法			
			Method m = c.getMethod("eat", String.class);
			m.invoke(user, "一大包薯片");
			
			Method m1 = c.getMethod("sleep");
			m1.invoke(user);
			
			System.out.println("--------------------");
			
			//调用toString
			Method m2 = c.getDeclaredMethod("toString");
			System.out.println(m2.invoke(user));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

	
}























