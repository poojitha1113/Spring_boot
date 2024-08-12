package com.test.employee.repository;

import com.test.employee.dao.EmployeeAutoDAO;
import com.test.employee.dao.Employeedao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeAutoRepoInterface extends JpaRepository<EmployeeAutoDAO,Long> {
}
