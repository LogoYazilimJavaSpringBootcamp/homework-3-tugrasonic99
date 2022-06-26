package com.logo.model;

public class Bank {// Bank sınıfı Logo İşbaşı sitesinin Banka bölümünden esinlenerek yapıldı. Amaco müşterinin ilişkisi olduğu bankaları depolamak. 
	
	private String customerName;
	private String bankName;
	private String branchName;
	private String personel;
	private String phoneNo;
	
	
	
	
	
	
	
	public Bank(String customerName, String bankName, String branchName, String personel, String phoneNo) {
		super();
		this.customerName = customerName;
		this.bankName = bankName;
		this.branchName = branchName;
		this.personel = personel;
		this.phoneNo = phoneNo;
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getPersonel() {
		return personel;
	}
	public void setPersonel(String personel) {
		this.personel = personel;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	};
	
	

}
