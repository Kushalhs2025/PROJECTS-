package com.shree.shak.repositary;

import org.springframework.data.repository.CrudRepository;

import com.shree.shak.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}