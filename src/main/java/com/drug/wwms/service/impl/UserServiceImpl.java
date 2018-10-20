package com.drug.wwms.service.impl;

import com.drug.wwms.bean.User;
import com.drug.wwms.mapper.UserMapper;
import com.drug.wwms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zyliu on 2018/10/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

}
