package com.example.springbootmanagerums.service;

import com.example.springbootmanagerums.dao.ManagerDao;
import com.example.springbootmanagerums.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServce {

    @Autowired
    private ManagerDao managerDao;

    public Manager login(String name,String pwd){
        return managerDao.findByNameAndPwd(name,pwd);
    }

}
