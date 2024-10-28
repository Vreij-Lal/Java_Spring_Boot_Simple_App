package com.pwrlabs.backend_server.service.impl;

import com.pwrlabs.backend_server.dto.EmployeeDto;
import com.pwrlabs.backend_server.entity.Employee;
import com.pwrlabs.backend_server.mapper.EmployeeMapper;
import com.pwrlabs.backend_server.repository.EmployeeRepository;
import com.pwrlabs.backend_server.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeesDto(savedEmployee);
    }
}
