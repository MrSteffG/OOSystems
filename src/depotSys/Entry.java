package depotSys;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import depotClasses.Archive;

public class Entry {

	public static void main(String[] args) {
	 
		
			Sys system=new Sys();
			Thread t1 = new Thread(system);
			Archive archive= new Archive();
			Thread t2=new Thread(archive);
			
			ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
			executor.scheduleWithFixedDelay(t1, 0, 2, TimeUnit.SECONDS);
			executor.scheduleWithFixedDelay(t2,2, 10, TimeUnit.SECONDS);
			
		

}
}
