package com.myapp;

/**
 * @author neha
 * 
 * created on 09/08/2015
 *
 */
public class Customer {

	private int custId;
	private String fName;
	private String lName;
	private long contactNo;

	/**
	 * Default constructor.
	 */
	public Customer() {

	}

	public Customer(int custId, String fName, String lName, long contactNo) {
		super();
		this.custId = custId;
		this.fName = fName;
		this.lName = lName;
		this.contactNo = contactNo;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	
}
