package com.example.demo.security;



import com.example.demo.Repository.AdminRepository;
import com.example.demo.entity.Admin;

import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class AdminDetailsService implements UserDetailsService {

    private final AdminRepository repo;

    public AdminDetailsService(AdminRepository repo){ this.repo = repo; }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        Admin admin = repo.findByAdminUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("Admin not found"));
        return User.builder()
                .username(admin.getAdminUserName())
                .password(admin.getHashedAdminPasssword())
                .authorities(Collections.singleton(() -> admin.getRole() == null ? "ROLE_ADMIN" : "ROLE_" + admin.getRole()))
                .build();
    }
}

