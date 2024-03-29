package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailSenderApplication {
	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailSenderApplication.class, args);
	}
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendEmail("s.jathar0711@gmail.com", "This is subject", "This is body of email");;
	}

}
