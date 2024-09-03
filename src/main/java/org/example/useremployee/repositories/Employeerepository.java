package org.example.useremployee.repositories;

import org.example.useremployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employeerepository extends JpaRepository<Employee, Integer> {
}
