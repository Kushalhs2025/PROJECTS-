package com.cpcmongo.crudmongo12.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpcmongo.crudmongo12.model.Customer;
import com.cpcmongo.crudmongo12.repositary.CustRepo;


@RestController
public class CustController {
	@Autowired
	CustRepo custrepo;
	@RequestMapping("/add")
	public String addcust(@RequestBody Customer customer) {
		custrepo.save(customer);
		return "Record Inserted Sucessfully";
	}
	@GetMapping("/get")
	public List<Customer> getCust(){
		return custrepo.findAll();
	}
	@RequestMapping("/del/{cid}")
	public String delcust (@PathVariable int cid) {
		custrepo.deleteById(cid);
		return "Record Deleted Sucessfully";
	}
	@RequestMapping("/upd/{cid}")
	public String updcust(@RequestBody Customer customer) {
		Customer newCust=custrepo.findById(customer.getCid()).get();
		newCust.setCname(customer.getCname());
		newCust.setFname(customer.getFname());
		newCust.setLname(customer.getLname());
		newCust.setLocation(customer.getLocation());
		custrepo.save(newCust);
		return "Record Updated Sucessfully";

		

		
	}
}
