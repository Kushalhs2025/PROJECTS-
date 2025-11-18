package com.cpcmongo.crudmongo12.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cpcmongo.crudmongo12.model.Customer;

public interface CustRepo extends MongoRepository<Customer,Integer> {

}
