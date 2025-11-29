package com.example.demo.controller;

import com.example.demo.entity.Admin;
import com.example.demo.dto.AdminDTO;
import com.example.demo.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService){
        this.adminService = adminService;
    }

    // 1) Add Admin (PUBLIC)
    @PostMapping
    public ResponseEntity<?> addAdmin(@RequestBody AdminDTO dto){
        if(adminService.findByUserName(dto.getAdminUserName()).isPresent()){
            return ResponseEntity.badRequest().body("Username already exists");
        }

        Admin admin = new Admin();
        admin.setAdminName(dto.getAdminName());
        admin.setDomain(dto.getDomain());
        admin.setAdminUserName(dto.getAdminUserName());
        admin.setRole(dto.getRole());

        Admin saved = adminService.createAdmin(admin, dto.getAdminPassword());

        // Do not return hashed password
        saved.setHashedAdminPasssword(null);

        return ResponseEntity.ok(saved);
    }

    // 2) Show all Admins (JWT REQUIRED)
    @GetMapping
    public ResponseEntity<List<Admin>> showAdmins(){
        List<Admin> list = adminService.findAll();
        list.forEach(a -> a.setHashedAdminPasssword(null));
        return ResponseEntity.ok(list);
    }

    // 3) Search Admin by username (PUBLIC)
    @GetMapping("/search")
    public ResponseEntity<?> searchByUserName(@RequestParam String username){
        return adminService.findByUserName(username)
                .map(a -> { 
                    a.setHashedAdminPasssword(null); 
                    return ResponseEntity.ok(a); 
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // 4) Update Admin (JWT REQUIRED)
    @PutMapping("/{id}")
    public ResponseEntity<?> updateAdmin(@PathVariable Integer id, @RequestBody AdminDTO dto){
        Admin updated = new Admin();
        updated.setAdminName(dto.getAdminName());
        updated.setDomain(dto.getDomain());
        updated.setRole(dto.getRole());

        try {
            Admin saved = adminService.updateAdmin(id, updated, dto.getAdminPassword());
            saved.setHashedAdminPasssword(null);
            return ResponseEntity.ok(saved);
        } catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    // 5) Delete Admin (JWT REQUIRED)
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAdmin(@PathVariable Integer id){
        adminService.deleteAdmin(id);
        return ResponseEntity.ok("Deleted");
    }
}
