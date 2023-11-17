package com.developer.employeemanagement.dto.mapper;

import com.developer.employeemanagement.dto.request.EmployeeRequest;
import com.developer.employeemanagement.dto.response.EmployeeResponse;
import com.developer.employeemanagement.entity.EmployeeEntity;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-16T15:27:26+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeEntity fromRequestToEntity(EmployeeRequest employeeRequest) {
        if ( employeeRequest == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setPrenom( employeeRequest.getPrenom() );
        employeeEntity.setPrenomar( employeeRequest.getPrenomar() );
        employeeEntity.setNom( employeeRequest.getNom() );
        employeeEntity.setNomar( employeeRequest.getNomar() );
        employeeEntity.setCin( employeeRequest.getCin() );
        employeeEntity.setAttribut( employeeRequest.getAttribut() );
        employeeEntity.setPhone( employeeRequest.getPhone() );
        employeeEntity.setEmail( employeeRequest.getEmail() );

        return employeeEntity;
    }

    @Override
    public EmployeeResponse fromEntityToResponse(EmployeeEntity employeeEntity) {
        if ( employeeEntity == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setId( employeeEntity.getId() );
        employeeResponse.setPrenom( employeeEntity.getPrenom() );
        employeeResponse.setPrenomar( employeeEntity.getPrenomar() );
        employeeResponse.setNom( employeeEntity.getNom() );
        employeeResponse.setNomar( employeeEntity.getNomar() );
        employeeResponse.setCin( employeeEntity.getCin() );
        employeeResponse.setAttribut( employeeEntity.getAttribut() );
        employeeResponse.setPhone( employeeEntity.getPhone() );
        employeeResponse.setEmail( employeeEntity.getEmail() );

        return employeeResponse;
    }
}
