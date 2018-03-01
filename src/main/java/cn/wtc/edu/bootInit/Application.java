package cn.wtc.edu.bootInit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @EnableAutoConfiguration 用于自动配置。
 * 简单的说，它会根据你的pom配置（实际上应该是根据具体的依赖）来判断这是一个什么应用，并创建相应的环境。
 */
@SpringBootApplication
@ComponentScan("cn.wtc.edu.bootInit")
@EnableSwagger2
public class Application 
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
