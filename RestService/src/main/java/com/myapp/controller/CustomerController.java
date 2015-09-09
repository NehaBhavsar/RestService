package com.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myapp.Customer;
import com.myapp.RespCode;
import com.myapp.exception.CustomerNotFoundException;
import com.myapp.model.CustomerResp;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	private static List<Customer> lstCust = new ArrayList<Customer>();

	static {
		lstCust.add(new Customer(1, "Shree", "Ganesha", 1231231234));

	}

	/**
	 * @param custId
	 * @return
	 */
	@RequestMapping(value = "/{custId}", method = RequestMethod.GET)
	@ResponseBody
	public CustomerResp getcustomerById(@PathVariable("custId") int custId) {
		for (Customer customer : lstCust) {
			if (customer.getCustId() == custId){
				return new CustomerResp(customer, RespCode.SUCCESS, "Customer found with id  : " + custId);
			}
		}
		throw new CustomerNotFoundException();
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Customer> getAllCustomer() {
		return lstCust;
	}

	@RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public CustomerResp addCustomer(@RequestBody Customer customer) {
		if (null != customer) {
			lstCust.add(customer);
			return new CustomerResp(customer, RespCode.SUCCESS, "Cusotmer created with id : " + customer.getCustId());
		} else {
			return new CustomerResp(RespCode.FAILURE, "Customer not Found.");
		}

	}

	@RequestMapping(value = "/{custId}", method = RequestMethod.DELETE)
	@ResponseBody
	public CustomerResp deleteCustomer(@PathVariable("custId") int custId) {
		Customer cust = null;
		for (Customer customer : lstCust) {			
			if (customer.getCustId() == custId) {
				cust = customer;
				lstCust.remove(cust);
				return new CustomerResp(RespCode.SUCCESS, "Customer deleted with id  : " + custId);
			} 
		}
		throw new CustomerNotFoundException();
	}

}
