package com.itheima.dao;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("userDao")
public interface UserDao {


    @Select("select * from tab_user")
    List<User> queryAll();
}
