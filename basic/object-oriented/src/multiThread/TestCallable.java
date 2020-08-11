package multiThread;

import java.util.concurrent.Callable;

public class TestCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("Callable");
		for(int i = 0; i < 5; i++) {
			System.out.println("A" + "的循环变量i的值" + i);
		}
		return null;
	}

}
