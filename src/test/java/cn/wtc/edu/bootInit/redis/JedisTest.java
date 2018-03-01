package cn.wtc.edu.bootInit.redis;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.wtc.edu.bootInit.ApplicationTests;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ApplicationTests.class)
public class JedisTest {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	
	@Test
	public void testConnection(){
		 String redisValue = stringRedisTemplate.opsForValue().get("key");
		 Assert.assertNull(redisValue);

	}
}
