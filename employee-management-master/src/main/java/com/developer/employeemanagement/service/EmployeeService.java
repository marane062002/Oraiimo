package com.developer.employeemanagement.service;

import com.developer.employeemanagement.entity.EmployeeEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    Optional<EmployeeEntity> findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity, MultipartFile profilePictureFile);
    EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeEntity, MultipartFile profilePictureFile);
    void deleteEmployee(Long id);
}

