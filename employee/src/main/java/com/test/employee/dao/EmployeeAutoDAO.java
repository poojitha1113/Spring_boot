package com.test.employee.dao;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Table(name="Employeeauto")
public class EmployeeAutoDAO {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empID;


    @Getter
    @Setter
    @Column(name="firstname")
    private String firstname;

    @Getter
    @Setter
    @Column(name="lastname")
    private  String lastname;

    @Getter
    @Setter
    @Column(name = "Address")
    private String Address;

    @Getter
    @Setter
    @Column(name="salary")
    private String salary;


}
