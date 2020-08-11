package multiThread;

import java.util.concurrent.FutureTask;

public class ThreadApplication {

	
	public static void main(String[] args) {
		Thread t=new TestThread();
		t.start();
		
		System.out.println("===============================");
		
		Thread t1=new Thread(new ThreadRunnable(),"t-1");
		t1.start();
		
		System.out.println("===============================");
	
		TestCallable t2=new TestCallable();
		FutureTask<Integer> ft=new FutureTask<>(t2);{
			for(int i = 0;i < 5;i++) {  
				System.out.println(Thread.currentThread().getName()+" 的循环变量i的值"+i);  
				if(i==20) {  
					new Thread(ft,"有返回值的线程").start();  
				}  
			}  
		}
		
		System.out.println("===============================");

		
	}	
}























