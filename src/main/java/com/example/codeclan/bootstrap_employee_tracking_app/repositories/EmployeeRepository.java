package com.example.codeclan.bootstrap_employee_tracking_app.repositories;

import com.example.codeclan.bootstrap_employee_tracking_app.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
