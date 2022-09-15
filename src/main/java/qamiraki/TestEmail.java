package qamiraki;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class TestEmail {

	public static void main(String[] args) throws EmailException {
		// TODO Auto-generated method stub
		Email email = new SimpleEmail();
		email.setHostName("mail.myserver.com");
		email.setSmtpPort(465);
		email.setAuthentication("suramrajesh42538@gmail.com", "Suram@1996");
		email.setSSLOnConnect(true);
		email.setFrom("suramrajesh42538@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("naveenmiraki@gmail.com");
		email.send();

	}

}
