package com.developer.employeemanagement.controller;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.service.EmployeeService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/donat")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeEntity> findAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping(consumes = "multipart/form-data")
    public EmployeeEntity saveEmployee(
            @RequestPart("employee") EmployeeEntity employeeEntity,
            @RequestPart(name = "profilePictureFile", required = false) MultipartFile profilePictureFile) {
        return employeeService.saveEmployee(employeeEntity, profilePictureFile);
    }


    @PutMapping("/{id}")
    public EmployeeEntity updateEmployee(@PathVariable("id") Long id,
                                         @RequestPart("employee") EmployeeEntity employeeEntity,
                                         @RequestPart(name = "profilePictureFile", required = false) MultipartFile profilePictureFile) {
        return employeeService.updateEmployee(id, employeeEntity, profilePictureFile);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
    }
}
