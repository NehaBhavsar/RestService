package com.myapp.model;

import com.myapp.Customer;
import com.myapp.RespCode;

public class CustomerResp {

	private Customer customer;
	private RespCode resp;
	private String msg;
	
	

	public CustomerResp(RespCode resp, String msg) {
		super();
		this.resp = resp;
		this.msg = msg;
	}

	public CustomerResp(Customer customer, RespCode resp, String msg) {
		this(resp,msg);
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public RespCode getResp() {
		return resp;
	}

	public void setResp(RespCode resp) {
		this.resp = resp;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
