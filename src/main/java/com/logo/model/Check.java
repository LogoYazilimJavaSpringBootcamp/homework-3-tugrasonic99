package com.logo.model;

public class Check {
	
	// Check sınıfı Logo İşbaşı sitesinin Çek bölümünden esinlenerek yapıldı.
	
	private String checkNo;
	private Customer customer;
	private String vade;
	private String date;
	private double cost;
	private String type;
	private String desc;
	
	
	
	
	
	public Check(String checkNo, Customer customer, String vade, String date, double cost, String type, String desc) {
		super();
		this.checkNo = checkNo;
		this.customer = customer;
		this.vade = vade;
		this.date = date;
		this.cost = cost;
		this.type = type;
		this.desc = desc;
	}
	
	
	
	public String getCheckNo() {
		return checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getVade() {
		return vade;
	}
	public void setVade(String vade) {
		this.vade = vade;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
