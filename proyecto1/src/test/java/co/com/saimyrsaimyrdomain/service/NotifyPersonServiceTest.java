package co.com.saimyrsaimyrdomain.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import co.com.saimyr.domain.Person;
import co.com.saimyr.service.EmailService;
import co.com.saimyr.service.NotifyPersonService;
import co.com.saimyrdomain.testdatabuilder.PersonTestDataBuilder;

public class NotifyPersonServiceTest {
	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup(){
		emailService = new EmailService();
		emailService = Mockito.mock(EmailService.class);
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notifyTest(){
		//Arrange
		Person person = new PersonTestDataBuilder().build();
		Mockito.when(emailService.sendEmail(Mockito.anyString())).thenReturn("hola mundo");
		//Act
		String message = notifyPersonService.notify(person);
		//Assert
		Assert.assertNotNull(message);
	}

}
