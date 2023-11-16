package com.example.springclasstp4.service;

import com.example.springclasstp4.entity.Staff;

import java.util.List;

public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}
