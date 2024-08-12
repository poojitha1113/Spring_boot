package com.test.employee.service;

import com.test.employee.dao.EmployeeAutoDAO;
import com.test.employee.dao.Employeedao;
import com.test.employee.dao.LombokTestDAO;

import java.util.Optional;


public interface EmployeeServiceInterface {
    Employeedao save(Employeedao employeedao);

  EmployeeAutoDAO save(EmployeeAutoDAO employeeAutoDAO);

    LombokTestDAO save(LombokTestDAO lombokTestDAO);
    Optional<Employeedao> findEmployeedao(long id);
    Optional<EmployeeAutoDAO> findEmployeeAutoDao(long id);
    String deleteEmployee(Long id);

}
