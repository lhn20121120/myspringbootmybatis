package com.lk.lambda.service;

import com.lk.lambda.mapper.WifeMapper;
import com.lk.lambda.model.User;
import com.lk.lambda.model.Wife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WifeService {
    @Autowired
    private WifeMapper wifeMapper;

    public List<Wife> selectList() {
      return   wifeMapper.selectAll();
    }

    public Wife save(Wife wife) {
        if(wife.getId()!=null){
            wifeMapper.updateByPrimaryKey(wife);
        }else{
            wifeMapper.insert(wife);
        }
        return wife;
    }

    public Wife getById(Integer id) {
        return wifeMapper.selectByPrimaryKey(id);
    }

}
