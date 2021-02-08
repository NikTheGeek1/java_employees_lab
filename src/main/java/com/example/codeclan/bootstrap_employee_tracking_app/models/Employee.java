package com.example.codeclan.bootstrap_employee_tracking_app.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id()
    private Long employeeNum;
    @Column(name = "email")
    private String email;

    public Employee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(Long employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
