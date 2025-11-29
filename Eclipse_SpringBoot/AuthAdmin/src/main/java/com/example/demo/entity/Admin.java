package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Admin")
@Data
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminId")
    private Integer adminId;

    @Column(name = "adminName")
    private String adminName;

    @Column(name = "domain")
    private String domain;

    @Column(name = "adminUserName", unique = true, nullable = false)
    private String adminUserName;

    @Column(name = "HashedAdminPasssword")  
    private String hashedAdminPasssword;

    @Column(name = "role")
    private String role;
}
