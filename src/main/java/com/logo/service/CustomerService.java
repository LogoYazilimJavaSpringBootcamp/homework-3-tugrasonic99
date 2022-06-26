package com.logo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.logo.model.Bank;
import com.logo.model.Customer;
import com.logo.model.Order;
import com.logo.model.Product;
import com.logo.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private static OrderService orderService;

	@Autowired
	private static ProductService productService;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	private static List<Customer> customerList;
	
	
	@PostConstruct// Burada customerList'i bir değere atabilmek için kullanıldı
	private void postConstruct() {
		customerList=customerRepository.prepareCustomerList();
	        
	 }

	public CustomerService(OrderService orderService) {
		this.orderService = orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public static Customer create(String name) {
		Customer customer = new Customer(name, 25, new ArrayList<>());

		System.out.println("orderService:" + orderService.toString());
		// orderService.createOrder();

		System.out.println("productService:" + productService.toString());
		
		customerList.add(customer);

		return customer;
	}
	
	public Customer getCustomer(String customerName) {// İsime dayalı customer bulma.
		return customerList.stream().filter(x->x.getName().equals(customerName)).findFirst().get();
		
	}
	
	

	
	
	public void deleteCustomer(String customerName) {// İsime dayalı customer silme.
		customerList.removeIf(x->x.getName().equals(customerName));
		customerRepository.setCustomerList(customerList);
	}
	
	public List<Customer> getActiveCustomerList(){// OrderList'i empty olmayan, aktif müşetrileri bulma
		List<Customer> activeCustomers=new ArrayList<Customer>();
		customerList.stream().filter(x->x.getOrderList().isEmpty()!=true).forEach(h->activeCustomers.add(h));
		return activeCustomers;
	}
	
	public List<Customer> getPassiveCustomerList(){// OrderList'i empty olan, pasif müşteriler
		List<Customer> passiveCustomers=new ArrayList<Customer>();
		customerList.stream().filter(x->x.getOrderList().isEmpty()==true).forEach(h->passiveCustomers.add(h));
		return passiveCustomers;
	}
	
	
	
	
	
	public List<Customer> getCustomers(){
		return customerList;
	}
	
	
	


}
