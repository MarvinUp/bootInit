package cn.wtc.edu.bootInit.util.act.quene;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import cn.wtc.edu.bootInit.util.act.Gloable;

@Component
public class Consumer {
	@JmsListener(destination=Gloable.ACTIVEMQ_QUENE)
	public void receive(TextMessage message) throws JMSException{
		System.out.println("----Consumer收到消息---:"+message.getText());
	}
}
