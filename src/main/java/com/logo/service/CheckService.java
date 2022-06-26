package com.logo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.logo.model.Bank;
import com.logo.model.Check;
import com.logo.model.Customer;
import com.logo.repository.CustomerRepository;

public class CheckService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	
	
	public void addCheck(Customer c, Check check) {// Müşteriye çek ekleme işlemi
		List<Check> holderList=c.getCheckList();
		holderList.add(check);
		c.setCheckList(holderList);
		customerRepository.setCustomerList(customerRepository.getCustomerList().stream().filter(f->f.getName().equals(c.getName())).map(x->c).collect(Collectors.toList()));
		
		
	}
	
	
	public void deleteCheck(Customer c, String checkNo) {// Müşteriden çek silme işlemi
		List<Check> holderList=c.getCheckList();
		holderList.removeIf(x->x.getCheckNo().equals(checkNo));
		c.setCheckList(holderList);
		customerRepository.setCustomerList(customerRepository.getCustomerList().stream().filter(f->f.getName().equals(c.getName())).map(x->c).collect(Collectors.toList()));
		
		
	}
	
	public List<Check> getChecksUsedByCustomer(Customer c){// Müşteriye ait tüm çekleri listeleme işlemi
		if(customerRepository.getCustomerList().stream().filter(f-> f.getName().equals(c.getName())).findFirst()!=null) {
			return customerRepository.getCustomerList().stream().filter(f-> f.getName().equals(c.getName())).findFirst().get().getCheckList();
		}
		
		return null;
	}

}
