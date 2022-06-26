package com.logo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.logo.model.Bank;
import com.logo.model.Customer;
import com.logo.repository.CustomerRepository;

public class BankService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	
	public void addBank(Customer c, Bank b) { // Müşteriye banka ekleme işlemi
		List<Bank> holderList=c.getBankList();
		holderList.add(b);
		c.setBankList(holderList);
		customerRepository.setCustomerList(customerRepository.getCustomerList().stream().filter(f->f.getName().equals(c.getName())).map(x->c).collect(Collectors.toList()));
		
		
		
		
	}
	
	
	public void deleteBank(Customer c, String bankName) {// Müşteriden banka silme işlemi
		List<Bank> holderList=c.getBankList();
		holderList.removeIf(x->x.getBankName().equals(bankName));
		c.setBankList(holderList);
		customerRepository.setCustomerList(customerRepository.getCustomerList().stream().filter(f->f.getName().equals(c.getName())).map(x->c).collect(Collectors.toList()));
		
		
		
	}
	
	public List<Bank> getBanksUsedByCustomer(Customer c){// Müşterinin kullandığı tüm bankaların listesi
		if(customerRepository.getCustomerList().stream().filter(f-> f.getName().equals(c.getName())).findFirst()!=null) {
			return customerRepository.getCustomerList().stream().filter(f-> f.getName().equals(c.getName())).findFirst().get().getBankList();
		}
		
		return null;
	}

}
