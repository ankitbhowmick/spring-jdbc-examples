package com.anky.springjdbc.model;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ankitbhowmick@hotmail.com
 * 9/9/18 11:30 PM
 */
public class StudentMapper implements RowMapper<Student> {

    public Student mapRow(ResultSet resultSet,int rowNo) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setAge(resultSet.getInt("age"));
        student.setName(resultSet.getString("name"));
        return student;
    }
}
