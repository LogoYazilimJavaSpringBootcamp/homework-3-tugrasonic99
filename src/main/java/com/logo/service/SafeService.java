package com.logo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.logo.model.Bank;
import com.logo.model.Customer;
import com.logo.model.Safe;
import com.logo.repository.CustomerRepository;

public class SafeService {
	
	@Autowired
	private CustomerRepository customerRepository;
	

	public void addSafe(Customer c, Safe safe) {// Müşteriye kasa ekleme işlemi
		List<Safe> holderList=c.getSafeList();
		holderList.add(safe);
		c.setSafeList(holderList);
		customerRepository.setCustomerList(customerRepository.getCustomerList().stream().filter(f->f.getName().equals(c.getName())).map(x->c).collect(Collectors.toList()));
		
	}
	
	
	public void deleteBank(Customer c, String safeName) {// Müşteriden kasa silme işlemi
		List<Safe> holderList=c.getSafeList();
		holderList.removeIf(x->x.getSafeName().equals(safeName));
		c.setSafeList(holderList);
		customerRepository.setCustomerList(customerRepository.getCustomerList().stream().filter(f->f.getName().equals(c.getName())).map(x->c).collect(Collectors.toList()));
		
	}
	
	public List<Safe> getSafesUsedByCustomer(Customer c){// Müşteriye ait tüm kasaları listeleme işlemi
		if(customerRepository.getCustomerList().stream().filter(f-> f.getName().equals(c.getName())).findFirst()!=null) {
			return customerRepository.getCustomerList().stream().filter(f-> f.getName().equals(c.getName())).findFirst().get().getSafeList();
		}
		
		return null;
	}

}
