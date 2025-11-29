package com.example.demo.controller;

import com.example.demo.dto.AuthRequest;
import com.example.demo.dto.AuthResponse;
import com.example.demo.entity.Admin;
import com.example.demo.service.AdminService;
import com.example.demo.util.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AdminService adminService;
    private final JwtUtil jwtUtil;

    public AuthController(AdminService adminService, JwtUtil jwtUtil) {
        this.adminService = adminService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest request){
        var opt = adminService.findByUserName(request.getAdminUserName());
        if(opt.isEmpty()) return ResponseEntity.status(401).body("Invalid credentials");
        Admin admin = opt.get();
        boolean ok = adminService.checkPassword(admin, request.getAdminPassword());
        if(!ok) return ResponseEntity.status(401).body("Invalid credentials");
        String token = jwtUtil.generateToken(admin.getAdminUserName());
        return ResponseEntity.ok(new AuthResponse(token));
    }
}
