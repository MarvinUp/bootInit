package cn.wtc.edu.bootInit.util.act;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;


@Configuration
@EnableJms
public class Gloable {
	public static final String ACTIVEMQ_QUENE="boot-quene";
	public static final String ACTIVEMQ_TOPIC="boot-topic";
	
	@Bean(name="testQuene")
    public Queue testQuene() {
        return new ActiveMQQueue(ACTIVEMQ_QUENE);
    }
	
}
