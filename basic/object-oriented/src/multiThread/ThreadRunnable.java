package multiThread;

public class ThreadRunnable implements Runnable{

	int count = 0;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "Runnable多线程运行的代码");
		for(int i = 0; i < 5; i++) {
			count++;
			System.out.println(Thread.currentThread().getName() + "这是Runnable多线程的逻辑代码:" + count);
		}
		
	}

}
