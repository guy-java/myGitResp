package org.guy.email;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailAttachementWithUrl {

	public static void main(String[] args) {
		//创建附件
		EmailAttachment attachement = new EmailAttachment();
		try {
			attachement.setURL(new URL("http://commons.apache.org/proper/commons-email/images/email-logo-white.png"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		attachement.setDisposition(EmailAttachment.ATTACHMENT);
		attachement.setDescription("apache Email logo");
		attachement.setName("appachelogo");
		//创建email
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.sina.com");
		email.setAuthentication("eclipse3", "password");
		email.setCharset("UTF-8");
		try {
			email.addTo("52998109@qq.com");
			email.setFrom("eclipse3@sina.com");
			email.setSubject("emailWithUrl");
			email.setMsg("this is a email");
			email.attach(attachement);
			email.send();
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
