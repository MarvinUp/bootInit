package cn.wtc.edu.bootInit.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wtc.edu.bootInit.ApplicationTests;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ApplicationTests.class)
public class ProPertiesTest {
	@Autowired
    private NeoProperties neoProperties;


    @Test
    public void getHello() throws Exception {
    	System.out.println(neoProperties.getTitle());
        Assert.assertEquals(neoProperties.getTitle(), "title");
        Assert.assertEquals(neoProperties.getDescription(), "内容");
    }

    
    @Test
    public void testMap() throws Exception {
    	Map<String, Long> orderMinTime=new HashMap<String, Long>();
    	long xx=orderMinTime.get("123");
    }
}
