package com.dayfresh1.view;

import com.dayfresh1.page.PageRespond;
import com.dayfresh1.pojo.User;
import com.dayfresh1.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    private static Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST, name = "注册用户")
    public PageRespond register(String userName, String passWord, String email) {
        logger.info("===========用户注册==========");
        logger.info("=====参数======userName:"+userName+"=====passWord:"+passWord+"========email:"+email);
        User user = new User();
        user.setUsername(userName);
        user.setPassword(passWord);
        user.setEmail(email);
        logger.info("======请求参数========"+user);
        int n = userService.register(user);
        if (n == 0) {
            logger.info("======注册失败=========");
            return new PageRespond(444, "注册失败");
        }
            logger.info("======注册成功=========");
        return new PageRespond(200, "注册成功");
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET, name = "检查用户名是否存在")
    public PageRespond checkUserName(String userName) {
        logger.info("=====检查用户名是否可用=======userName:"+userName);
        User user = userService.check(userName);
        if (user == null) {
            logger.info("可以使用");
            return new PageRespond(200, "该用户名可以使用");
        }
        logger.info("已存在");
        return new PageRespond(444, "该用户已存在");
    }

    @RequestMapping(value = "/checkEmail", method = RequestMethod.GET, name = "检查邮箱是否被使用")
    public PageRespond checkEmail(String email) {
        User user = userService.checkEmail(email);
        if (user == null) {
            return new PageRespond(200, "该邮箱可以使用");
        }
        return new PageRespond(444, "该邮箱已被使用");
    }
}
