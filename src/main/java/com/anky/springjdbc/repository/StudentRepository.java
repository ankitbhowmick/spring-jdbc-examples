package com.anky.springjdbc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ankitbhowmick@hotmail.com
 * 9/9/18 11:43 PM
 */
@Repository
public class StudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void create(String name, int age) {
        String sql = "INSERT INTO `springjdbc`.`Student`(`NAME`,`AGE`) VALUES (?,?)";
        jdbcTemplate.update(sql,name,age);
    }
}
