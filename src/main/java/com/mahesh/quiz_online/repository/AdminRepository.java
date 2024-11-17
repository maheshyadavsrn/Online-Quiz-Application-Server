package com.mahesh.quiz_online.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahesh.quiz_online.entitiy.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);
}
