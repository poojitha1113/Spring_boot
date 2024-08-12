package com.test.employee.repository;

import com.test.employee.dao.EmployeeAutoDAO;
import com.test.employee.dao.Employeedao;
import com.test.employee.dao.LombokTestDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepointerface extends JpaRepository<Employeedao,Long> {
     EmployeeAutoDAO  save(EmployeeAutoDAO employeeAutoDAO);
      LombokTestDAO save(LombokTestDAO lombokTestDAO);

}
