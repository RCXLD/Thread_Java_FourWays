package hk.stockino.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolTest {

	public static void main(String[] argStrings)
	{
		ExecutorService fixedThreadPoolExecutorService=Executors.newFixedThreadPool(3);
		
		for(int i=0;i<10;i++){
			final int index=i;
			
			fixedThreadPoolExecutorService.execute(new Runnable(){
				public void run (){
					try {
						System.out.println(index);
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}
	}
	
}
