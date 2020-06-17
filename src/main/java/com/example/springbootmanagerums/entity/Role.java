package com.example.springbootmanagerums.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private int role_id;
    private String role_name;
    private String ps_ids;
    private String ps_ca;
    private String role_desc;
}
