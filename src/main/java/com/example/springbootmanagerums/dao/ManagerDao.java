package com.example.springbootmanagerums.dao;


import com.example.springbootmanagerums.entity.Manager;

public interface ManagerDao {
    /**
     * 登录方法
     * @param name 账户
     * @param pwd 密码
     * @return
     */
    Manager findByNameAndPwd(String name,String pwd);
}
