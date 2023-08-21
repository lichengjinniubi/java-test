package com.example.javatest.JDBCV3.c_dao.dao.impl;

import com.example.javatest.JDBCV3.c_dao.bean.User;
import com.example.javatest.JDBCV3.c_dao.dao.BaseDao;
import com.example.javatest.JDBCV3.c_dao.dao.UserDao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl2 extends BaseDao implements UserDao {
    
    @Override
    public void save(User user) {
        this.getJdbcTemplate().update("insert into tbl_user (name, tel) values (?, ?)", user.getName(), user.getTel());
    }
    
    @Override
    public User findById(Integer id) {
        List<User> userList = this.getJdbcTemplate()
                .query("select * from tbl_user where id = ?", new BeanPropertyRowMapper<>(User.class), id);
        return userList.size() > 0 ? userList.get(0) : null;
    }
    
    @Override
    public List<User> findAll() {
        return this.getJdbcTemplate().query("select * from tbl_user", new BeanPropertyRowMapper<>(User.class));
    }
}
