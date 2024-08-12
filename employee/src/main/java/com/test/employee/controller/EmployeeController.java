package com.test.employee.controller;

import com.test.employee.dao.EmployeeAutoDAO;
import com.test.employee.dao.Employeedao;
import com.test.employee.dao.LombokTestDAO;
import com.test.employee.service.EmployeeServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {
    private static final Logger logger= LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    @PostMapping("/insertEmployee")
    public String insertEmployee(Employeedao employeedao)
    {
        Employeedao obj=new Employeedao();
        logger.info("Insdie emp dao class and it has post static api");
        obj.setEmpId(101);

        obj.setFirstname("poojitha");
        obj.setLastname("Gutha");
        obj.setAddress("hyd");
        obj.setSalary(10000);
        logger.info(employeedao.toString());
        logger.info("employee info"+employeedao.getEmpId());


        employeeServiceInterface.save(obj);
        return "Successfully done static insertion";

    }

    @PostMapping("/dynamicinsertEmployee")
    public String dynamicinsertEmployee(@RequestBody Employeedao employeedao)
    {
        Employeedao obj=new Employeedao();
        obj.setEmpId(employeedao.getEmpId());
        obj.setFirstname(employeedao.getFirstname());
        obj.setLastname(employeedao.getLastname());
        obj.setAddress(employeedao.getAddress());
        obj.setSalary(employeedao.getSalary());
        employeeServiceInterface.save(obj);
        return "Successfully done dynamic insertion";
    }
    @PostMapping("/dynamicinsertEmployeeretun")
    public Employeedao dynamicinsertEmployeeretun(@RequestBody Employeedao employeedao)
    {
        Employeedao obj=new Employeedao();
        obj.setEmpId(employeedao.getEmpId());
        obj.setFirstname(employeedao.getFirstname());
        obj.setLastname(employeedao.getLastname());
        obj.setAddress(employeedao.getAddress());
        obj.setSalary(employeedao.getSalary());
        Employeedao employeedao1=employeeServiceInterface.save(obj);
        return employeedao1;
    }

    @PostMapping("/insertemployeeandreturn")
    public EmployeeAutoDAO insertemployeeandreturn(@RequestBody EmployeeAutoDAO employeeAutoDAO)
    {
        EmployeeAutoDAO employeeAutoDAO1=employeeServiceInterface.save(employeeAutoDAO);
        return employeeAutoDAO1;
    }
   @PostMapping("/insertsample")
    public LombokTestDAO insertsample(@RequestBody LombokTestDAO lombokTestDAO)
        {
            LombokTestDAO LombokTestDAO01=employeeServiceInterface.save(lombokTestDAO);
            return LombokTestDAO01;
    }
    @GetMapping("/getEmp/{id}")
    public Optional<Employeedao> getEmp(@PathVariable("id") long id)
    {
        Optional<Employeedao> employeedao=employeeServiceInterface.findEmployeedao(id);
        return employeedao;
    }
    @GetMapping("/getEmpAuto/{id}")
    public Optional<EmployeeAutoDAO> getEmpAuto(@PathVariable("id") long id)
    {
        Optional<EmployeeAutoDAO> employeeAutoDAO=employeeServiceInterface.findEmployeeAutoDao(id);
        return employeeAutoDAO;
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id") long id)
    {
        if(employeeServiceInterface.findEmployeedao(id).isEmpty()){
            return "No Employee  is to delete";
        }
        else {
            employeeServiceInterface.deleteEmployee(id);
            return "Succesfully Deleted";
        }
    }
}
