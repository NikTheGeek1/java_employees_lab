package com.example.codeclan.bootstrap_employee_tracking_app;

import com.example.codeclan.bootstrap_employee_tracking_app.models.Employee;
import com.example.codeclan.bootstrap_employee_tracking_app.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootstrapEmployeeTrackingAppApplicationTests {


	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void canAddEmployee() {
		Employee employee = new Employee("Anna", 35, "anna@anna.com");
		employeeRepository.save(employee);
	}

}
