package com.firstproject.springboot.module1introduction.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.firstproject.springboot.module1introduction.NotificationService;
//@Primary
@Component
@Qualifier("emailnotif")
@ConditionalOnProperty(name="notification.type",value="email")
public class EmailNotificationService implements NotificationService{

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Email sending..."+msg);
	}

}
