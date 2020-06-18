package com.example.springbootmanagerums.dao.impl;

import com.example.springbootmanagerums.dao.ManagerDao;
import com.example.springbootmanagerums.entity.Manager;
import com.example.springbootmanagerums.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ManagerDaoImpl implements ManagerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Manager findByNameAndPwd(String name, String pwd) {
        String sql = "select m.*,r.* from sp_manager m left join sp_role r " +
                "on m.role_id=r.role_id where m.mg_name=? and m.mg_pwd=?";

        return jdbcTemplate.queryForObject(sql, new Object[]{name, pwd}, new RowMapper<Manager>() {
            @Override
            public Manager mapRow(ResultSet resultSet, int i) throws SQLException {
                int mg_id = resultSet.getInt("mg_id");
                String mg_name = resultSet.getString("mg_name");
                String mg_pwd = resultSet.getString("mg_pwd");
                String mg_mobile = resultSet.getString("mg_mobile");
                String mg_email = resultSet.getString("mg_email");
                int mg_state = resultSet.getInt("mg_state");

                int role_id = resultSet.getInt("role_id");
                String role_name = resultSet.getString("role_name");
                String role_desc = resultSet.getString("role_desc");
                Manager manager = new Manager(mg_id,mg_name,mg_pwd,0,mg_mobile,mg_email,mg_state,new Role(role_id,role_name,"","",role_desc));
                return manager;
            }
        });
    }
}
