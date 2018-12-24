package com.baizhi.service;

import com.baizhi.entity.Poetry;

import java.util.List;

public interface PoetryService {
    //查询所有诗歌及所对应的诗人
    public List<Poetry> findAll();
}
