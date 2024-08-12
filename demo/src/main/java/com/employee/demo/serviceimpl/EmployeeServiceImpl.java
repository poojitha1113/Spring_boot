package com.employee.demo.serviceimpl;

import com.employee.demo.dao.Employee;
import com.employee.demo.repository.EmployeeRepository;
import com.employee.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee emp) {
        employeeRepository.save(emp);
        return null;
    }
}
