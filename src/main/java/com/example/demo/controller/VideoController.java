package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.domain.Video;
import com.example.demo.service.IViderService;
import com.example.demo.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @ClassName VideoController
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:19
 * @Version 1.0
 **/
@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {

    @Autowired
    private IViderService iViderService;

    @GetMapping("list")
    public JsonUtil login(){
        List<Video> listVideo = this.iViderService.list();
        System.out.println(listVideo);

        return JsonUtil.JsonSuccess(listVideo);
    }
}
