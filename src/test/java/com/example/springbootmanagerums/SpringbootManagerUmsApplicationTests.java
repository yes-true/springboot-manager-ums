package com.example.springbootmanagerums;

import com.example.springbootmanagerums.service.ManagerServce;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringbootManagerUmsApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private ManagerServce managerServce;

    @Test
    void contextLoads() {
        System.out.println("jdbcTemplate = " + jdbcTemplate);
    }

    @Test
    void login(){
        System.out.println(managerServce.login("root","root"));
    }

}
