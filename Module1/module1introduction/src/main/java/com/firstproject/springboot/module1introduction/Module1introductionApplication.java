package com.firstproject.springboot.module1introduction;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.firstproject.springboot.module1introduction.impl.SmsNotificationService;

@SpringBootApplication
public class Module1introductionApplication implements CommandLineRunner{

	//@Autowired
//	final NotificationService notificationServiceObj; //Dependency Injection
//	
//	Module1introductionApplication(NotificationService notificationServiceObj){ //constructor DI preferred
//		this.notificationServiceObj=notificationServiceObj;
//	}
	@Autowired
	Map<String,NotificationService>notificationServiceMap=new HashMap<>();
	//PaymentService paymentserviceObj;
	public static void main(String[] args) {
		SpringApplication.run(Module1introductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	paymentserviceObj.pay();
		//notificationServiceObj=new SmsNotificationService();
		//notificationServiceObj.send("hello");
		
		for(var notificationService:notificationServiceMap.entrySet()) {
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello");
		}
	}

}
