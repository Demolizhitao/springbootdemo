package com.example.demo;

import com.example.demo.controller.UserController;
import com.example.demo.domain.Chapter;
import com.example.demo.domain.User;
import com.example.demo.util.JsonUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
public class UserTest {

    /*@Test
	void contextLoads() {
	}*/


    @Autowired
    private UserController userController;

    @Test
    public void login()
    {

        Chapter chapter = new Chapter();
        chapter.setChapter_title("@2");
        User user = new User();
        user.setUsername("lizhitao");
        user.setPassword("123");

        JsonUtil jsonUtil = this.userController.login(user);
        System.out.println("22222"+jsonUtil.toString());
        //TestCase.assertEquals(0,jsonUtil.getCode());
        //return jsonUtil;

    }

    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("after");
    }
}
