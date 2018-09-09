package com.anky.springjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * @author ankitbhowmick@hotmail.com
 * 30/8/18 8:03 AM
 */
@Configuration
public class SpringJDBCConfig {

        @Bean
        public DataSource mysqlDataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
            dataSource.setUsername("root");
            dataSource.setPassword("");

            return dataSource;
        }
        }

