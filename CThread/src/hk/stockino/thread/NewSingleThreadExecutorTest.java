package hk.stockino.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutorTest {

	public static void main(String[] argStrings) {
		ExecutorService singlExecutorService=Executors.newSingleThreadExecutor();
		for (int i=0;i<10;i++)
		{
			final int index=i;
			
			singlExecutorService.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
					System.out.println(index);
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}
	}

}
