//package com.example.dockerdemo.controller;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//@Controller
////@RequestMapping("/index")
//public class HelloController {
//
//    @RequestMapping("/index")
////    @RequestMapping(value = "/hello")
//    public String sayHello(){
//        return "hello world";
//    }
//}

package com.example.dockerdemo.controller;

import com.example.dockerdemo.bean.UserBean;
import com.example.dockerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    //将Service注入Web层
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }

    @RequestMapping(value = "/loginIn",method = RequestMethod.POST)
    public String login(String name,String password){
        UserBean userBean = userService.loginIn(name,password);
        if(userBean!=null){
            return "success";
        }else {
            return "error";
        }
    }



}