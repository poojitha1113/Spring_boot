package com.employee.demo.controller;

import com.employee.demo.dao.Employee;
import com.employee.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/insertemp")
    public String insertemp(Employee employee)
    {
        Employee empobj=new Employee();
        empobj.setEmpid(10);
        empobj.setFirstname("poojitha");
        empobj.setLastname("gutha");
        empobj.setAddress("ind");
        empobj.setSalary(10000);
        employeeService.save(empobj);
        return "done";

    }
    @PostMapping("/insertempdynamic")
    public String insertempdynamic(Employee employee)
    {
        Employee empobj=new Employee();
        empobj.setEmpid(employee.getEmpid());
        empobj.setFirstname(employee.getFirstname());
        empobj.setLastname(employee.getLastname());
        empobj.setSalary(employee.getSalary());
        empobj.setAddress(employee.getAddress());
        employeeService.save(empobj);
        return "done";

    }
}
