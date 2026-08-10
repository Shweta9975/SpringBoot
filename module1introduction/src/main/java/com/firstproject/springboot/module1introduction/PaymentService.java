package com.firstproject.springboot.module1introduction;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component
public class PaymentService {

    
	public void pay(){
        System.out.println("Paying....");
    }
	
	@PostConstruct
	public void afterInit() {  //PostConstruct
		System.out.println("Before Payment....");
	}
	
	@PreDestroy
	public void beforeDestroy() {  //PreDestroy
		System.out.println("After payment is done...");
	}
}
