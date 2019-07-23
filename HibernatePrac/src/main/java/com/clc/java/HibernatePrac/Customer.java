/**
 * 
 */
package com.clc.java.HibernatePrac;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Snehal
 *
 */

public class Customer {
	
	private int custId;
	private String custName;
	private String custAddress;
	private int custBalance;
	private int custAge;
	
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", custBalance=" + custBalance + ", custAge=" + custAge + "]";
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public int getCustBalance() {
		return custBalance;
	}
	public void setCustBalance(int custBalance) {
		this.custBalance = custBalance;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public Customer(int custId, String custName, String custAddress, int custBalance, int custAge) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custBalance = custBalance;
		this.custAge = custAge;
	}
	public Customer() {
		super();
	}
	
	
	
}
