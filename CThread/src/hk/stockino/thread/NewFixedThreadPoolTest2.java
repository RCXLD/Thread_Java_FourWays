package hk.stockino.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewFixedThreadPoolTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScheduledExecutorService scheduledExecutorService=Executors.newScheduledThreadPool(5);
		
		
			scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println("Delay 4 seconds and execute every 3 seconds");
				
				}
			},10,3,TimeUnit.SECONDS);
		
				

	}

}
