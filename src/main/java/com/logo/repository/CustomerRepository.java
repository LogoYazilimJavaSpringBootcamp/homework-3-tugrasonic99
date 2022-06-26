package com.logo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Repository;

import com.logo.model.Customer;
import com.logo.model.Order;
import com.logo.model.Product;

@Repository
public class CustomerRepository {
	
	private static List<Customer> customerList= new ArrayList<Customer>();
	
	
	// Bu yapıların orjinale nazaran bir repository'e alınmasının sebebi başlangıç itibariyle birçok sınıfta kullanılacak olma durumu içindir.
	// Örnek olarak CustomerRepository yaratılan 3 model tarafından erişilerek customerlist alınabiliyor.
	public List<Customer> prepareCustomerList() {
		int randomOrderNumber = new Random().nextInt(50);
		customerList.add(new Customer("bilisim.io", randomOrderNumber, new ArrayList<>()));
		customerList.add(new Customer("cem", randomOrderNumber, prepareOrderList()));
		customerList.add(new Customer("ömer", randomOrderNumber, prepareOrderList()));
		customerList.add(new Customer("haluk", randomOrderNumber, prepareOrderList()));
		customerList.add(new Customer("halil", randomOrderNumber, prepareOrderList()));
		customerList.add(new Customer("fatih", randomOrderNumber, prepareOrderList()));
		return customerList;
	}
	
	
	private List<Order> prepareOrderList() {
		List<Order> orders = new ArrayList<>();
		int randomOrderNumber = new Random().nextInt(5);
		for (int i = 0; i < randomOrderNumber; i++) {
			Order order = new Order(prepareProductList(randomOrderNumber));
			orders.add(order);
		}
		return orders;
	}

	private List<Product> prepareProductList(int randomOrderNumber) {
		List<Product> products = new ArrayList<>();
		Random random = new Random();
		products.add(new Product("MacBook Pro", random.nextDouble(1000)));
		products.add(new Product("MacBook air", random.nextDouble(1000)));
		products.add(new Product("Mac Mini", random.nextDouble(1000)));
		products.add(new Product("iPhone 11", random.nextDouble(1000)));
		products.add(new Product("iPhone 12", random.nextDouble(1000)));

		return products.stream().limit(randomOrderNumber).toList();
	}
	



	public static List<Customer> getCustomerList() {
		return customerList;
	}


	public static void setCustomerList(List<Customer> customerList) {
		CustomerRepository.customerList = customerList;
	}
	
	
	
	
	

}
