package com.example.javatest.JDBCV3.transcation.dao.impl;

import com.example.javatest.JDBCV3.c_dao.bean.User;
import com.example.javatest.JDBCV3.transcation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(com.example.javatest.JDBCV3.transcation.bean.User user) {
        jdbcTemplate.update("insert into tbl_user (name, tel) values (?, ?)", user.getName(), user.getTel());
    }

    @Override
    public com.example.javatest.JDBCV3.transcation.bean.User findById(Integer id) {
        List<com.example.javatest.JDBCV3.transcation.bean.User> userList = jdbcTemplate
                .query("select * from tbl_user where id = ?", new BeanPropertyRowMapper<>(com.example.javatest.JDBCV3.transcation.bean.User.class), id);
        return userList.size() > 0 ? userList.get(0) : null;
    }

    @Override
    public List<com.example.javatest.JDBCV3.transcation.bean.User> findAll() {
        return jdbcTemplate.query("select * from tbl_user", new BeanPropertyRowMapper<>(com.example.javatest.JDBCV3.transcation.bean.User.class));
    }
}
