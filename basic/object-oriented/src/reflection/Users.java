package reflection;

import java.util.Date;

public class Users {

    private String name;

    private String password;

    private int age;

    private Date birthday;
    
    public void eat(String food) {
    	System.out.println(name + "吃了" + food);
    }
    
    public void sleep() {
    	System.out.println(name + "正在睡觉！");
    }

    public String toString() {
    	return "User : [" 
    			+ "name: " + this.name
    			+ ",password: " + this.password 
    			+ ",age:" + this.age
    			+ ",birthday:" + this.birthday
    			+ "]";
    }

    
}
