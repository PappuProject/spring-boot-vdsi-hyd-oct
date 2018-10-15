package com.demo.spring;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class MyMessageSender {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(JmsConfig.class);
		JmsTemplate jt = (JmsTemplate)ctx.getBean("jtPubsub");

				
		for (int i = 0; i < 10; i++) {
			int count = i;
			jt.send("demoTopic", new MessageCreator() {

				@Override
				public Message createMessage(Session session) throws JMSException {
					TextMessage tm = session.createTextMessage();
					tm.setText("Message " + count);
					return tm;
				}
			});
		}
		System.out.println("Message Sent....");
	}

}
