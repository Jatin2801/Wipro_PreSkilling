package com.example.demo.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AdminDTO {
    private String adminName;
    private String domain;
    private String adminUserName;
    private String adminPassword;
    private String role;
}
