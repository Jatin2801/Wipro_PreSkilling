package com.example.demo.service;


import com.example.demo.Repository.AdminRepository;
import com.example.demo.entity.Admin;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    private final AdminRepository repo;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public AdminService(AdminRepository repo) {
        this.repo = repo;
    }

    // Create admin (hash password)
    public Admin createAdmin(Admin admin, String rawPassword) {
        admin.setHashedAdminPasssword(encoder.encode(rawPassword));
        return repo.save(admin);
    }

    public Optional<Admin> findByUserName(String username){
        return repo.findByAdminUserName(username);
    }

    public List<Admin> findAll(){
        return repo.findAll();
    }

    public Optional<Admin> findById(Integer id){
        return repo.findById(id);
    }

    public Admin updateAdmin(Integer id, Admin updated, String rawPassword){
        return repo.findById(id).map(a -> {
            a.setAdminName(updated.getAdminName());
            a.setDomain(updated.getDomain());
            a.setRole(updated.getRole());
            if(rawPassword != null && !rawPassword.isEmpty()){
                a.setHashedAdminPasssword(encoder.encode(rawPassword));
            }
            return repo.save(a);
        }).orElseThrow(() -> new RuntimeException("Admin not found"));
    }

    public void deleteAdmin(Integer id){
        repo.deleteById(id);
    }

    public boolean checkPassword(Admin admin, String rawPassword){
        return encoder.matches(rawPassword, admin.getHashedAdminPasssword());
    }
}

