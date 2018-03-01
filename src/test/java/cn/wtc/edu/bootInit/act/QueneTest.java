package cn.wtc.edu.bootInit.act;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wtc.edu.bootInit.ApplicationTests;
import cn.wtc.edu.bootInit.util.act.quene.Producer;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ApplicationTests.class)
public class QueneTest {
	@Autowired
	private Producer producer;
	@Test
	public void testQuene(){
		for(int i=0,j=100;i<j;i++){
			String str="消息体:"+i;
			System.out.println("----添加消息--producer---:"+str);
			producer.sendMessage(str);
		}
	}
}
