package com.lk.lambda.service;

import com.lk.lambda.mapper.UserMapper;
import com.lk.lambda.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> selectList() {
      return   userMapper.selectAll();
    }

    public User save(User user) {
        if(user.getId()!=null){
            userMapper.updateByPrimaryKey(user);
        }else{
            userMapper.insert(user);
        }
        return user;
    }

    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

}
