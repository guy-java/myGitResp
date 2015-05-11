package org.guy.email;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

public class HtmlEmailDemo {

	public static void main(String[] args) {
		
		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.sina.com");
		email.setAuthentication("eclipse3", "password");
		email.setCharset("UTF-8");
		
		try {
			email.addTo("52998109@qq.com");
			email.setFrom("eclipse3@sina.com");
			email.setSubject("htmlEmail");
			email.setHtmlMsg("<b>html格式的邮件</b>");
			email.send();
			System.out.println("success");
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
