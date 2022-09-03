package com.example.javatest.JDBCV2.dao.impl;

import com.example.javatest.JDBCV2.bean.User;
import com.example.javatest.JDBCV2.dao.BaseDao;
import com.example.javatest.JDBCV2.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class UserDaoImpl extends BaseDao implements UserDao {

    @Autowired
    private DataSource dataSource;


    public UserDaoImpl(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    @Override
    public void save(User user) {

    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return this.getJdbcTemplate().query("select * from tbl_user", new BeanPropertyRowMapper<>(User.class));
    }
}
