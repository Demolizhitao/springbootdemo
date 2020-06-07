package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.domain.Video;
import com.example.demo.mapper.impl.VideoMapper;
import com.example.demo.service.IViderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ViderServiceImpl
 * @Description TODO
 * @Author lizhitao
 * @Data 2020/6/6 23:29
 * @Version 1.0
 **/
@Service
public class ViderServiceImpl implements IViderService{

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> list() {
        return videoMapper.listVideo();
    }
}
