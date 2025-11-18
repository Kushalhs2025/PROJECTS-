package com.cpcapi.crudapi05.repositary;

import org.springframework.data.repository.CrudRepository;

import com.cpcapi.crudapi05.model.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer> {

}
