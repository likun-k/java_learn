package newInstance;

import java.util.Scanner;

/**
 * 	用户
 * @author apple
 *
 */
public class Users {

	String name,name1;
	String password;
	int password1;
	int passwordchange;
	
	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getPassword1() {
		return password1;
	}

	public void setPassword1(int password1) {
		this.password1 = password1;
	}

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
		System.out.println(""+name1);
	}
	
	public int passWordChange() {
		return password1;
	}
	
	public static void main(String[] args) {
		Users rec = new Users();
		rec.name="wh";
		rec.password="45678";
		rec.name1="lisi";
		rec.printUserInfo();
		rec.nameChange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入密码： ");
		int inputpassword1 = scanner.nextInt();
		rec.setPassword1(inputpassword1);
		System.out.println("密码： "+rec.passWordChange());
	}
		

}
