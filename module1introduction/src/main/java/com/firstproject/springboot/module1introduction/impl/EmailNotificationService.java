package com.firstproject.springboot.module1introduction.impl;

import com.firstproject.springboot.module1introduction.NotificationService;

public class EmailNotificationService implements NotificationService{

	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Email sending..."+msg);
	}

}
