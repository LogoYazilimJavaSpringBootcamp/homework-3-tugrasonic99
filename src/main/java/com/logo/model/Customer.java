package com.logo.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private int age;
	private List<Order> orderList;
	
	// Bu yeni sınıfları Customer'a bağlamanın sebebi isim değerini customer üzerinden çekmek veya aratabilip ilişkilendirmektir.
	// Default değerleri boş olacak.
	private List<Bank> bankList;
	private List<Check> checkList;
	private List<Safe> safeList;

	public Customer(String name, int age, List<Order> orderList) {
		super();
		this.name = name;
		this.age = age;
		this.orderList = orderList;
		bankList=new ArrayList<Bank>();
		checkList=new ArrayList<Check>();
		safeList=new ArrayList<Safe>();
	}
	
	
	

	
	
	public List<Check> getCheckList() {
		return checkList;
	}






	public void setCheckList(List<Check> checkList) {
		this.checkList = checkList;
	}






	public List<Safe> getSafeList() {
		return safeList;
	}






	public void setSafeList(List<Safe> safeList) {
		this.safeList = safeList;
	}






	public List<Bank> getBankList() {
		return bankList;
	}




	public void setBankList(List<Bank> bankList) {
		this.bankList = bankList;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

}
