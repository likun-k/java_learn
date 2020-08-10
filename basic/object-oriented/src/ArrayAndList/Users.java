package ArrayAndList;

public class Users {
	
	int age=21;
	String name="lisi";
	int sex=0;
	


	public static void main(String[] args) {
		
		Users[] User = new Users[3];
		
		Users user2 = new Users();
		user2.name = "2";
		
		Users user3 = new Users();
		user3.name = "3";
		
		Users user4 = new Users();
		user4.name = "4";
		
		User[0] = user2;
		User[1] = user3;
		User[2] = user4;
		
		
		
		String[] sss = new String[User.length+1];//创建一个长度比原来大的数组
		
		for(int i=0;i<User.length;i++) {//复制数组内容
			sss[i] = User[i].name;
		}
		
		sss[User.length]="lisi";//将新元素添加到新数组内

		//打印输出
		for(int i=0;i<User.length;i++) {
			System.out.println(User[i]);
		}
	}
}
