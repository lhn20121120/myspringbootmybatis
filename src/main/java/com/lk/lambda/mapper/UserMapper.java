package com.lk.lambda.mapper;

import com.lk.lambda.utils.MyMapper;
import com.lk.lambda.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}
