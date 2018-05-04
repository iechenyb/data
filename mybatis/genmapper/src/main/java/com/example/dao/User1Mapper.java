package com.example.dao;

import com.example.model.User1;

public interface User1Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(User1 record);

    int insertSelective(User1 record);

    User1 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User1 record);

    int updateByPrimaryKey(User1 record);
}