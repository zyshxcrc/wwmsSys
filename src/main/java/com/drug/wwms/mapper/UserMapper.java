package com.drug.wwms.mapper;

import com.drug.wwms.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by zyliu on 2018/10/20.
 */
public interface UserMapper {
    @Select("SELECT * FROM user")
    List<User> getUserList();
}
