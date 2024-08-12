package com.test.employee.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "sample")
public class LombokTestDAO {
    @Id
    @Column(name="Id")
    private int Id;
    private String name;
    private String address;
    private String city;

}
