package com.developer.employeemanagement.service.impl;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.repository.EmployeeRepository;
import com.developer.employeemanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Value("C:/Users/user/Desktop/upload")
    private String uploadDir;
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    //    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//
//        // Create the upload directory if it doesn't exist
//        try {
//            Files.createDirectories(Paths.get(uploadDir));
//        } catch (IOException e) {
//            throw new RuntimeException("Could not initialize upload directory!", e);
//        }
//    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity, MultipartFile profilePictureFile) {
        if (profilePictureFile != null && !profilePictureFile.isEmpty()) {
            String fileName = System.currentTimeMillis() + "_" + profilePictureFile.getOriginalFilename();
            Path filePath = Paths.get(uploadDir, fileName);

            try {
                Files.write(filePath, profilePictureFile.getBytes());
            } catch (IOException e) {
                throw new RuntimeException("Failed to store file: " + fileName, e);
            }

            employeeEntity.setNom(employeeEntity.getNom());
            employeeEntity.setNomar(employeeEntity.getNomar());
            employeeEntity.setPrenom(employeeEntity.getPrenom());
            employeeEntity.setPrenomar(employeeEntity.getPrenomar());
            employeeEntity.setCin(employeeEntity.getCin());
            employeeEntity.setAttribut(employeeEntity.getAttribut());
            employeeEntity.setEmail(employeeEntity.getEmail());
            employeeEntity.setPhone(employeeEntity.getPhone());
            employeeEntity.setProfilePicture(employeeEntity.getProfilePicture());
            employeeEntity.setProfilePictureUrl("C:/Users/user/Desktop/upload/" + fileName);
        }
//
//        EmployeeEntity employee = new EmployeeEntity();



        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(Long id, EmployeeEntity employeeEntity, MultipartFile profilePictureFile) {
        if (employeeRepository.existsById(id)) {
            if (profilePictureFile != null && !profilePictureFile.isEmpty()) {
                String fileName = System.currentTimeMillis() + "_" + profilePictureFile.getOriginalFilename();
                Path filePath = Paths.get(uploadDir, fileName);

                try {
                    Files.write(filePath, profilePictureFile.getBytes());
                } catch (IOException e) {
                    throw new RuntimeException("Failed to store file: " + fileName, e);
                }

                // Set the file URL in the entity
                employeeEntity.setProfilePictureUrl("C:/Users/user/Desktop/upload/" + fileName); // Adjust the URL structure as needed
            }

            employeeEntity.setId(id);
            return employeeRepository.save(employeeEntity);
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
