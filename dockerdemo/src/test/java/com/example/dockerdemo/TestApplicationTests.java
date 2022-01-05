//package com.example.dockerdemo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
//class DockerdemoApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//
//}

package com.example.dockerdemo;

import com.example.dockerdemo.bean.UserBean;
import com.example.dockerdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("abc","123");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

    @Test
    public void contextLoads2() {
        UserBean userBean = userService.loginIn("a","a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
