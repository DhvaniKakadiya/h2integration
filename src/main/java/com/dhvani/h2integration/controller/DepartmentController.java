package com.dhvani.h2integration.controller;

import com.dhvani.h2integration.entity.Department;
import com.dhvani.h2integration.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getDepartments(){
        return departmentService.fetchDepartmentList();
    }

    @PutMapping("/department/{departmentId}")
    public Department updateDepartment(@Valid @RequestBody Department department, @PathVariable Long departmentId){
        department.setDepartmentId(departmentId);
        return departmentService.saveDepartment(department);
    }

    @DeleteMapping("/department/{departmentId}")
    public String deleteByDepartmentId(@PathVariable Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Deleted Successfully";
    }
}
