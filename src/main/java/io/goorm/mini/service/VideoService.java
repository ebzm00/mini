package io.goorm.mini.service;

import io.goorm.mini.mapper.VideoMapper;
import io.goorm.mini.vo.Video;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class VideoService {

    @Autowired
    private VideoMapper videoMapper;

    public List<Video> getBoards() {

        return videoMapper.selectIndex();
    }
}
