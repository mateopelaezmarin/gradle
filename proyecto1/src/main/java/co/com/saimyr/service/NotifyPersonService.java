package co.com.saimyr.service;

import co.com.saimyr.domain.Person;

public class NotifyPersonService {
	private EmailService emailService;
	public NotifyPersonService(EmailService emailService){
		this.emailService=emailService;
	}
	
	public String notify(Person person){
		String message = "welcome" + person.getName() + person.getLastName();
		return emailService.sendEmail(message);
	}
}
