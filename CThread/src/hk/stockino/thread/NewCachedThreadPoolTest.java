package hk.stockino.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService cachedThreadPoolExecutorService = Executors
				.newCachedThreadPool();

		for (int i = 0; i < 10; i++) {
			final int index = i;

			try {
				Thread.sleep(index * 100);		
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			cachedThreadPoolExecutorService.execute(new Runnable() {
				public void run() {
					System.out.println(index);
				}
			});//cached
		}//for

	}

}
