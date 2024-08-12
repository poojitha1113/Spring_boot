package com.test.employee.serviceimp;

import com.test.employee.dao.EmployeeAutoDAO;
import com.test.employee.dao.Employeedao;
import com.test.employee.dao.LombokTestDAO;
import com.test.employee.repository.EmployeeAutoRepoInterface;
import com.test.employee.repository.EmployeeRepointerface;
import com.test.employee.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl  implements EmployeeServiceInterface {
    @Autowired
    EmployeeRepointerface employeeRepointerface;
    @Autowired
    EmployeeAutoRepoInterface employeeAutoRepoInterface;

    @Override
    public Employeedao save(Employeedao employeedao) {
        Employeedao employeedao1=employeeRepointerface.save(employeedao);
        return employeedao1;
    }

  @Override
    public EmployeeAutoDAO save(EmployeeAutoDAO employeeAutoDAO) {
        EmployeeAutoDAO employeeAutoDAO2=employeeRepointerface.save(employeeAutoDAO);
        return employeeAutoDAO2;
    }

    @Override
    public LombokTestDAO save(LombokTestDAO lombokTestDAO) {
        LombokTestDAO lombokTestDAO1=employeeRepointerface.save(lombokTestDAO);
        return lombokTestDAO1;
    }

    @Override
    public Optional<Employeedao> findEmployeedao(long id) {
        Optional<Employeedao> employeedao=employeeRepointerface.findById(id);
        return employeedao;
    }

    @Override
    public Optional<EmployeeAutoDAO> findEmployeeAutoDao(long id) {
        Optional<EmployeeAutoDAO> employeeAutoDAO=employeeAutoRepoInterface.findById(id);
        return employeeAutoDAO;
    }

    @Override
    public String deleteEmployee(Long id) {
        employeeRepointerface.deleteById(id);
        return null;
    }


}
