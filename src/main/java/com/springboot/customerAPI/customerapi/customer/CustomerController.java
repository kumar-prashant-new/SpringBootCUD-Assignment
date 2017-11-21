package com.springboot.customerAPI.customerapi.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.customerAPI.customerapi.customer.util.CustomerResponse;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;


	@RequestMapping(method = RequestMethod.GET, value = "/customer")
	public List<Customer> getAllCustomer() {
			return customerService.getAllCustomer();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/customer/{id}")
	public Customer getAllCustomer(@PathVariable String id) {
			return customerService.getCustomer(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public CustomerResponse createCustomer(@RequestBody Customer customer) {
			return customerService.createCustomer(customer);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/customer/{id}")
	public CustomerResponse updateCustomer(@RequestBody Customer customer, @PathVariable String id) {
			return customerService.updateCustomer(customer,id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/customer/{id}")
	public CustomerResponse deactivateCustomer(@RequestBody Customer customer, @PathVariable String id) {
			return customerService.deactivateCustomer(customer,id);
	}
	
}
