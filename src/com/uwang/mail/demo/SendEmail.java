package com.uwang.mail.demo;

import com.uwang.mail.demo.util.MailSenderInfo;
import com.uwang.mail.demo.util.SimpleMailSender;

/**
 * 发送邮件客户端
 *
 */
public class SendEmail {

	public static void main(String[] args) {
		send();
	}
	
	public static void send(){
		// 这个类主要是设置邮件
		MailSenderInfo mailInfo = new MailSenderInfo();
		
		// 设置协议服务地址
		mailInfo.setMailServerHost(mailInfo.getMailServerHost());
		// 设置端口
		mailInfo.setMailServerPort(mailInfo.getMailServerPort());
		mailInfo.setValidate(true);
		
		
		// 发送邮件者
		mailInfo.setUserName("2490943211@qq.com");
		// 您的邮箱密码（现在已经改成授权码）
		mailInfo.setPassword("ifsccbsomhzvdjjd");
		// 昵称
		mailInfo.setFromAddress("巨无霸");
		// 发给谁
		mailInfo.setToAddress("255760176@qq.com");
		// 设置邮件标题
		mailInfo.setSubject("这是一个测试的邮件");
		// 设置邮件内容
		mailInfo.setContent(SendEmail.getString().toString());
//		 这个类主要来发送邮件
		SimpleMailSender.sendTextMail(mailInfo); // 执行发送普通文本
//		SimpleMailSender.sendHtmlMail(mailInfo);// 发送html格式
		System.out.println("======================");

	}
	
	/**
	 * 拼成HTML文件
	 * @return
	 */
	public static StringBuffer getString(){
		StringBuffer sb = new StringBuffer();
		sb.append("<!DOCTYPE html>")
		.append("<html>")
		.append("<head>")
		.append("<meta charset=UTF-8\">")
		.append("<title>诚信招聘网用户重设密码说明</title>")
		.append("<style type=\"text/css\">")
		.append(".test{font-family:\"Microsoft Yahei\";font-size: 12px;color: red;}")
		.append("</style>").append("</head>").append("<body>")
		.append("<span class=\"test\">你的密码为:</span><br>")
		.append("123456")
		// .append("<a href=\"http://localhost:8080/recruit/modules/newpassword.jsp\">http://www.honest.com/newpassword.jap?id=9430473&unid=4106fb7188c756a3cebb2943c7d3bfc4</a>")
		.append("</body>").append("</html>");
		return sb;
	}
}
