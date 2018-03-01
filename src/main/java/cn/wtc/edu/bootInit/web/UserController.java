package cn.wtc.edu.bootInit.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.wtc.edu.bootInit.dao.UserDao;
import cn.wtc.edu.bootInit.domain.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {
	@Autowired
	private UserDao userRepository;
	
	@ApiOperation(value="获取用户详细信息", notes="根据用户名字获取用户信息")
	@ApiImplicitParam(name = "name", value = "用户名字", required = true, dataType = "String", paramType = "path")
    @RequestMapping("/getUser/{name}")
    @Cacheable(value="user-key")
    public User getUser(@PathVariable(value = "name") String name) {
    	User user=userRepository.findByUserName("aa1");
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return user;
    }
    
    @RequestMapping("/getUsers")
    @Cacheable(value="key-Users")
    public List<User> getUsers() {
    	List<User> users=userRepository.findAll();
    	System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");  
        return users;
    }
}
