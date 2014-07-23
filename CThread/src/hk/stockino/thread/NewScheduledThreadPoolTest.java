package hk.stockino.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewScheduledThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ScheduledExecutorService scheduledExecutorService = Executors
				.newScheduledThreadPool(5);

		scheduledExecutorService.schedule(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Delay for 3 seconds");

			}
		}, 3, TimeUnit.SECONDS);

	}

}
