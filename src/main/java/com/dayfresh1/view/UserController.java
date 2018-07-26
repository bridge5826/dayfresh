package com.dayfresh1.view;

import com.dayfresh1.page.PageRespond;
import com.dayfresh1.pojo.User;
import com.dayfresh1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST,name = "注册用户")
    public PageRespond register(String userName, String passWord, String email) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(passWord);
        user.setEmail(email);
        int n = userService.register(user);
        if (n == 0){
            return new PageRespond(444,"注册失败");
        }
        return new PageRespond(200,"注册成功");
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET,name = "检查用户名是否存在")
    public PageRespond checkUserName(String userName){
        User user = userService.check(userName);
        if (user == null){
            return new PageRespond(200 , "该用户名可以使用");
        }
        return new PageRespond(444,"该用户已存在");
    }

    @RequestMapping(value = "/checkEmail",method = RequestMethod.GET,name = "检查邮箱是否被使用")
    public PageRespond checkEmail(String email){
        User user = userService.checkEmail(email);
        if (user == null){
            return new PageRespond(200 , "该邮箱可以使用");
        }
        return new PageRespond(444,"该邮箱已被使用");
    }
}
