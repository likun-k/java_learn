package ArrayAndList;

public class Test1 {
	
	public static void main(String[] args) {
		
		int[] myArray = new int[]{12,32,52,334,12,547,12,3,1,5,6,43,23,1,8,70,78,65,97,23,7,985,4,3,8};
		
		for (int i=0;i<myArray.length-1;i++) {//外层循环控制排序趟数
			for(int j=0;j<myArray.length-i-1;j++) {//内层循环控制每一趟排序多少次
				
				if(myArray[j]>myArray[j+1]) {// 把小的值交换到前面
					int temp=myArray[j];
					myArray[j]=myArray[j+1];
					myArray[j+1]=temp;
				}
			}
		}
		//循环输出结果
		for(int a=0;a<myArray.length;a++) {
			System.out.println(myArray[a]);
		}
	}
}
