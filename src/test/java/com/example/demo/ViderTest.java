package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;

/**
 * @ClassName ViderTest
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/7 15:45
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@AutoConfigureMockMvc
public class ViderTest {


    @Autowired
    MockMvc mockMvc;

    @Test
    public void mockmvc() throws Exception {

        MvcResult mvcResult =mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/pub/video/list"))

                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);

        String context = mvcResult.getResponse().getContentAsString(Charset.forName("UTF-8"));
        System.out.println(context);
    }


}
