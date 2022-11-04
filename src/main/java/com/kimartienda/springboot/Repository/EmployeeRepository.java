package com.kimartienda.springboot.Repository;

import com.kimartienda.springboot.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all CRUD database methods here
}
