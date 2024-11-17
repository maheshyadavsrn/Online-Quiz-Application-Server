package com.mahesh.quiz_online.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mahesh.quiz_online.repository.AdminRepository;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public boolean validateAdmin(String username, String password) {
        return adminRepository.findByUsername(username)
            .map(admin -> passwordEncoder.matches(password, admin.getPassword()))
            .orElse(false);
    }
}
