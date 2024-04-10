package com.dhvani.h2integration.service;

import com.dhvani.h2integration.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    Department saveDepartment(Department department);
    List<Department> fetchDepartmentList();
    Department updateDepartment(Department department);
    void deleteDepartmentById(Long departmentId);
}
