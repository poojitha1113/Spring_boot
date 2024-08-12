package com.employee.demo.controller;

import com.employee.demo.dao.Employee;
import com.employee.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tc_001 {
    @Autowired
    private EmployeeService employeeService;
   /* @PostMapping("/insertempdynamic")
    public String insertemp(@RequestBody Employee employee)
    {
        Employee emp=new Employee();
        emp.setEmpid(employee.getEmpid());
        emp.setFirstname(employee.getFirstname());
        emp.setLastname(employee.getLastname());
        emp.setAddress(employee.getAddress());
        emp.setSalary(employee.getSalary());
        employeeService.save(emp);
        return "dynamically done";
    }*/
}
