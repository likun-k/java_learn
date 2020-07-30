package newInstance;

import java.util.Scanner;

/**
 * 	用户
 * @author apple
 *
 */
public class Users {

	String name;
	String password;
	int passwordchange;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void printUserInfo() {
		System.out.println(" "+name+" "+password);
	}
	
	public void nameChange() {
		System.out.println(""+name);
	}
	
	public String passWordChange() {
		return password;
	}
	
	public static void main(String[] args) {
		Users rec = new Users();
		rec.name="wh";
		rec.password="45678";
		rec.printUserInfo();
		rec.name="sd";
		rec.nameChange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入sd的密码： ");
		String inputpassword = scanner.next();
		rec.setPassword(inputpassword);
		System.out.println("sd的密码： "+rec.passWordChange());
	}
		

}
