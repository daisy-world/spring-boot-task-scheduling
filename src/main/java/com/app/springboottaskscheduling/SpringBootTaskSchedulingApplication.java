package com.app.springboottaskscheduling;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class SpringBootTaskSchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTaskSchedulingApplication.class, args);
	}
	
	
	

/*	@Scheduled(fixedRate=1000)
	public void fixedRate() throws InterruptedException {  // it should be no-args method
		
		Thread.sleep(2000);
	System.out.println("current system date .............. "   +   new Date() );
		
	}*/
	
	
	
/*	@Scheduled(fixedDelay=1000)
	public void fixedDelay() {  // it should be no-args method
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	System.out.println("current system date .............. "   +   new Date() );
		
	}*/
	
	
	@Scheduled(cron="0 31 19 * * *")            // sec min  hr  dayof month  month  day of week
	public void cronJobDemo() {
	
		
		System.out.println("current system date .............. "   +   new Date() );

		
	}
	


}
