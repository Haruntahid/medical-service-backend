package com.medical.medical_service.repository;

import com.medical.medical_service.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
}