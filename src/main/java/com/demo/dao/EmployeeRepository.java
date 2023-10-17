package com.demo.dao;

import com.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Add a method to sort by name
    // NOT: JpaRepository sort işlemini alttaki methodla otomatikman yapacak. Service layerındaki findAll() metodunu güncellemeliyiz
    List<Employee> findAllByOrderByFirstNameAsc();
}
