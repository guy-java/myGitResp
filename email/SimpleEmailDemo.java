package org.guy.email;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SimpleEmailDemo {

	public static void main(String[] args) {
		Email email = new SimpleEmail();
		email.setHostName("smtp.sina.com");
		email.setAuthentication("eclipse3", "this is password");
		email.setCharset("UTF-8");
		
		try {
			email.setFrom("eclipse3@sina.com");
			email.addTo("52998109@qq.com");
			email.setSubject("测试邮件发送");
			email.setMsg("这是利用apache下的邮件发送工具进行的测试");
			email.send();
			System.out.println("发送成功");
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
