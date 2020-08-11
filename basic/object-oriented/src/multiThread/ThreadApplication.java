package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadApplication {

	public static void main(String[] args) {
		Thread t = new TestThread();
		t.start();

		System.out.println("===============================");

		Thread t1 = new Thread(new ThreadRunnable(), "t-1");
		t1.start();
//		ExecutorService service = Executors.newFixedThreadPool(5);
//		ThreadRunnable task = new ThreadRunnable();
//		service.submit(task);
//		service.shutdown();
		
		System.out.println("===============================");
		

		ExecutorService service = Executors.newFixedThreadPool(5);
		TestCallable c = new TestCallable();
		service.submit(c);
		service.shutdown();
		
		System.out.println("===============================");

	}
}
