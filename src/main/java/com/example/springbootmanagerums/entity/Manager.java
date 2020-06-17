package com.example.springbootmanagerums.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

    private int mg_id;
    private String mg_name;
    private char mg_pwd;
    private int mg_time;
    private String mg_mobile;
    private String mg_email;
    private int mg_state;
    private Role role;
}
