package com.example.javatest.JDBC.f_listener.dao;

import com.example.javatest.JDBC.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao {
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    public void save(User user) {
        jdbcTemplate.update("insert into tbl_user (name, tel) values (?, ?)", user.getName(), user.getTel());
    }
    
    public User findById(Integer id) {
        List<User> userList = jdbcTemplate
                .query("select * from tbl_user where id = ?", new BeanPropertyRowMapper<>(User.class), id);
        return userList.size() > 0 ? userList.get(0) : null;
    }
}
