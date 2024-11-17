package com.mahesh.quiz_online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.quiz_online.entitiy.Admin;
import com.mahesh.quiz_online.service.AdminService;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    public boolean login(@RequestBody Admin loginRequest) {
        return adminService.validateAdmin(loginRequest.getUsername(), loginRequest.getPassword());
    }
}
