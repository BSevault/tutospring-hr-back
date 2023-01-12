package com.tutospring.hr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.tutospring.hr.model.Employee;

// indique que la classe est un bean et que son rôle est de communiquer avec une source de données
// = @Component mais permet une meilleure lisibilité
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {}
