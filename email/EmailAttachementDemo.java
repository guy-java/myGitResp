package org.guy.email;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class EmailAttachementDemo {
	public static void main(String[] args) {
		EmailAttachment attache = new EmailAttachment();
		attache.setPath("e:/test.jpg");
		attache.setDisposition(EmailAttachment.ATTACHMENT);
		attache.setDescription("appacheCommons pic");
		attache.setName("appacheCommons");
		
		MultiPartEmail email = new MultiPartEmail();
		email.setHostName("smtp.sina.com");
		
		email.setAuthentication("eclipse3", "password");
		email.setCharset("UTF-8");
		
		try {
			email.setFrom("eclipse3@sina.com");
			email.addTo("52998109@qq.com");
			email.setSubject("带附件的邮件");
			email.setMsg("这是利用apache下的邮件发送工具进行的测试");
			email.attach(attache);
			email.send();
			System.out.println("发送成功");
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
	}

}
