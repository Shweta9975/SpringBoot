package com.firstproject.springboot.module1introduction.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.firstproject.springboot.module1introduction.NotificationService;

@Component
@Qualifier("smsnotif")
@ConditionalOnProperty(name="notification.type",value="sms")
public class SmsNotificationService implements NotificationService{

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Sms sending...."+msg);
	}

}
