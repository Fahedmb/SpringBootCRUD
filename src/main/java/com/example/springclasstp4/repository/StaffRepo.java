package com.example.springclasstp4.repository;

import com.example.springclasstp4.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepo extends JpaRepository<Staff, Integer> {
}
