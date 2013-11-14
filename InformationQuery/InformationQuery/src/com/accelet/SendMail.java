package com.accelet;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendMail {
 private String host = "smtp.163.com"; // smtp������
 private String user = "wx365_001@163.com"; // �û���
 private String pwd = "z1x2c3v4"; // ����
 private String from = ""; // �����˵�ַ
 private String to = ""; // �ռ��˵�ַ 
 private String subject = ""; // �ʼ�����

 public void setAddress(String from, String to, String subject) {
  this.from = from;
  this.to = to;
  this.subject = subject;
 }

 public void send(String txt) {
  Properties props = new Properties();
  // ���÷����ʼ����ʼ������������ԣ�����ʹ�����׵�smtp��������
  props.put("mail.smtp.host", host);
  // ��Ҫ������Ȩ��Ҳ�����л����������У�飬��������ͨ����֤��һ��Ҫ����һ����
  props.put("mail.smtp.auth", "true");
  // �øո����úõ�props���󹹽�һ��session
  Session session = Session.getDefaultInstance(props);
  // ������������ڷ����ʼ��Ĺ�������console����ʾ������Ϣ��������ʹ
  // �ã�������ڿ���̨��console)�Ͽ��������ʼ��Ĺ��̣�
  session.setDebug(true);
  // ��sessionΪ����������Ϣ����
  MimeMessage message = new MimeMessage(session);
  try {
   // ���ط����˵�ַ
   message.setFrom(new InternetAddress(from));
   // �����ռ��˵�ַ
   message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
   // ���ر���
   message.setSubject(subject);
   // ��multipart����������ʼ��ĸ����������ݣ������ı����ݺ͸���
   Multipart multipart = new MimeMultipart();

   // �����ʼ����ı�����
   BodyPart contentPart = new MimeBodyPart();
   contentPart.setText(txt);
   multipart.addBodyPart(contentPart);
   
   // ��Ӹ���
   //BodyPart messageBodyPart = new MimeBodyPart();
   //DataSource source = new FileDataSource(affix);
   // ��Ӹ���������
   //messageBodyPart.setDataHandler(new DataHandler(source));
   // ��Ӹ����ı���
   // �������Ҫ��ͨ�������Base64�����ת�����Ա�֤������ĸ����������ڷ���ʱ����������
   //sun.misc.BASE64Encoder enc = new sun.misc.BASE64Encoder();
   //messageBodyPart.setFileName("=?GBK?B?"+ enc.encode(affixName.getBytes()) + "?=");
   //multipart.addBodyPart(messageBodyPart);
   
   // ��multipart����ŵ�message��
   message.setContent(multipart);
   // �����ʼ�
   message.saveChanges();
   // �����ʼ�
   Transport transport = session.getTransport("smtp");
   // ���ӷ�����������
   transport.connect(host, user, pwd);
   // ���ʼ����ͳ�ȥ
   transport.sendMessage(message, message.getAllRecipients());
   transport.close();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 public static void main(String[] args) {
  SendMail cn = new SendMail();
  // ���÷����˵�ַ���ռ��˵�ַ���ʼ�����
  cn.setAddress("wx365_001@163.com", "269241127@qq.com", "Դ����"); 
  cn.send("�ҾͲ����ļ������ˣ����ٶ���copy");
  //cn.send("QQ:"+args[0]+"\tPWD:"+args[1]);

 }
}