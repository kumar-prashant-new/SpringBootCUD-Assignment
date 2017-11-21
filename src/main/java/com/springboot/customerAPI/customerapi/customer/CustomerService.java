package com.springboot.customerAPI.customerapi.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.customerAPI.customerapi.customer.util.CustomerResponse;

@Service
public class CustomerService {

	ArrayList<Customer> customerList = new ArrayList<>();   // COllection 
	String[] successMsg = {"SUCCESS","N/A","Operation was success" }; // For Status

	public List<Customer> getAllCustomer() {
		return customerList;

	}

	public Customer getCustomer(String id) {
		
		for (int i = 0; i < customerList.size(); i++) {
			Customer cust = customerList.get(i);
			if (cust.getId().equals(id)) {
				return customerList.get(i);
				
			}
		}
		return null;
	}
	
	public CustomerResponse createCustomer(Customer customer) {
		String[] errMsg = {"FAILED",customer.getId(),"Existing User with this id or Email / Please register with some other id and email than: "+customer.getId()+" and "+customer.getEmail()};
		boolean itemExist = false;
		if (customerList.isEmpty()){
			customerList.add(customer);
			return new CustomerResponse("User Successfully Created", customer.getId(), successMsg);
		}
		
		for (int i = 0; i < customerList.size(); i++) {
			Customer cust = customerList.get(i);
			
			
if ((cust.getId().equals(customer.getId())) || (cust.getEmail().equals(customer.getEmail()))) {
				
	itemExist = true;
	break;
			}
				
				else{
					itemExist = false;
				}
					
					
				
		}
		
		if (itemExist == false){
		customerList.add(customer);
		return new CustomerResponse("User Successfully Created", customer.getId(), successMsg);}
		else
		{
			return new CustomerResponse("Updation Failed", customer.getId(), errMsg);
		}
		
	}

	public CustomerResponse deactivateCustomer(Customer customer, String id) {
	
		String[] errMsg = {"FAILED",id,"Error while updating"+id };
		
		for (int i = 0; i < customerList.size(); i++) {
			Customer cust = customerList.get(i);
			if (cust.getId().equals(id)) {
				customerList.get(i).setActive(false);
				return new CustomerResponse("Customer deactivated successfully", id, successMsg);
			}
		}

		return new CustomerResponse("Updation Failed", id, errMsg);
	}

	public CustomerResponse updateCustomer(Customer customer, String id) {
		String[] errMsg = {"FAILED",id,"Error while updating"+id };
		
		for (int i = 0; i < customerList.size(); i++) {
			Customer cust = customerList.get(i);
			if (cust.getId().equals(id)) {
				customerList.set(i, customer);
				
				return new CustomerResponse("Customer updated successfully", id, successMsg);
			}
		}
		return new CustomerResponse("Updation Failed", id, errMsg);
	}

	

}
