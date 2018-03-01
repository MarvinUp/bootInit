package cn.wtc.edu.bootInit.util.act.quene;


import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer{
	
	  @Autowired
      private JmsMessagingTemplate jmsMessagingTemplate;
	  
	  @Autowired
	  private Queue testQuene;
	  
	  // 发送消息，destination是发送到的队列，message是待发送的消息  
	  public void sendMessage(String message){  
	    	jmsMessagingTemplate.convertAndSend(testQuene, message);  
	  }  
}
