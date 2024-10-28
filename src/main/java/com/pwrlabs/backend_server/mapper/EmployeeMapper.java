package com.pwrlabs.backend_server.mapper;

import com.pwrlabs.backend_server.dto.EmployeeDto;
import com.pwrlabs.backend_server.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeesDto(Employee employee){
        return  new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
