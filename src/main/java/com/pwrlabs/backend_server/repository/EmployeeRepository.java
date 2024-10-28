package com.pwrlabs.backend_server.repository;

import com.pwrlabs.backend_server.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
