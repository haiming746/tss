package com.baizhi.dao;

import com.baizhi.entity.Poetry;

import java.util.List;

/**
 * 诗歌DAO
 */
public interface PoetryDAO {
    //查询所有诗歌及所对应的诗人
    public List<Poetry> queryAll();
}
