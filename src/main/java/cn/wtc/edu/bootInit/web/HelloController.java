package cn.wtc.edu.bootInit.web;

import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @RestController的意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
 * */
@RestController
public class HelloController {
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
	@RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }
}
