package com.logo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logo.model.Bank;
import com.logo.model.Check;
import com.logo.model.Customer;
import com.logo.model.Safe;
import com.logo.model.User;
import com.logo.repository.CustomerRepository;
import com.logo.service.BankService;
import com.logo.service.CheckService;
import com.logo.service.CustomerService;
import com.logo.service.SafeService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	// Customer ile alakalı olan tüm servisler bu controller üzerinden kontrol edilecek
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CheckService checkService;
	
	@Autowired
	private SafeService safeService;
	
	@Autowired
	private BankService bankService;
	
	
	
	private Customer currentCustomer;// Bu değer yapılacak işlemlerde kullanılacak olan müşteriyi eşitlemek için kullanılacak.
	
	
	@PostMapping
	public void createCustomer(@RequestBody String name) {// Yeni müşteri
		currentCustomer=customerService.create(name);
		System.out.println("Current customer is"+name);
		
	}
	
	@PostMapping(value="/changecustomer")// Session içerisindeki müşteri değişimi
	public void changeCustomer(@RequestBody String customer) {
		currentCustomer=customerService.getCustomer(customer);
		System.out.println("Current customer is"+customer);
		
	}
	
	
	@PostMapping(value = "/addbank")// Müşteriye kullanmak üzere banka ekleme
	public void addBank(@RequestBody Bank bank) {
		bankService.addBank(currentCustomer,bank);
		System.out.println("Bank account is created for"+currentCustomer.getName());
		
	}
	
	@PostMapping(value = "/deletebank")// Müşterinin kullandığı bankalardan birini silme
	public void deleteBank(@RequestBody String bank) {
		bankService.deleteBank(currentCustomer,bank);
		System.out.println("Bank account is created for"+currentCustomer.getName());
		
	}
	
	@GetMapping(value="/allcustomers")// Tüm müşteriler
	public List<Customer> allCustomers(){
		return customerService.getCustomers();
	}
	
	@PostMapping(value="/addcheck")// Müşteriye çek ekleme
	public void addCheck(@RequestBody Check check){
		checkService.addCheck(currentCustomer, check);
	}
	
	@GetMapping(value="/allchecks")// Müşterinin tüm çekleri
	public List<Check> allChecks(){
		return checkService.getChecksUsedByCustomer(currentCustomer);
	}
	
	@PostMapping(value="/addsafe")// Müşteriye kasa ekleme
	public void addSafe(@RequestBody Safe safe){
		safeService.addSafe(currentCustomer, safe);
	}
	
	@GetMapping(value="/allsafes")// Müşterinin tüm kasaları
	public List<Safe> allSafes(){
		return safeService.getSafesUsedByCustomer(currentCustomer);
	}
	
	
	
	
	
	
	

}
