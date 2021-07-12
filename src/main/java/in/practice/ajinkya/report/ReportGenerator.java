package in.practice.ajinkya.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ReportGenerator {
	//Every second execute following method...
	//@Scheduled(cron="* * * * * *")
	//Every 10 second of every minute execute following method...
	@Scheduled(cron="10 * * * * *")
	public void repoGenerator() {
		System.out.println("Hello in Example of Spring Boot Scheduling CRON " +new Date());
	}
}
