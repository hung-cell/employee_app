package com.itsacademy.employee_app.repository;

import com.itsacademy.employee_app.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}