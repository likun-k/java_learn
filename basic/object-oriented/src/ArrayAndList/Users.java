package ArrayAndList;

public class Users {
	
	int age=21;
	String name="lisi";
	int sex=0;
	
	public static void main(String[] args) {
		
		String arr[]= {"1","24","abd","777","369","555"};
		
		String[] sss = new String[arr.length+1];//创建一个长度比原来大的数组
		
		for(int i=0;i<arr.length;i++) {//复制数组内容
			sss[i]=arr[i];
		}
		
		sss[arr.length]="lisi";//将新元素添加到新数组内

		arr=sss;
		//打印输出
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
