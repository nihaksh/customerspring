package org.cap.apps.customer.service;

import org.cap.apps.customer.dao.*;
import org.cap.apps.customer.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private ICustomerRepository dao;
//	@Override
	public Customer register(Customer customer) {
		customer=dao.add(customer);
		
		return customer;
	}
//	@Override
public Customer updateName(Long id, String name) {
		// TODO Auto-generated method stub
		Customer customer=dao.findById(id);
		customer.setName(name);
		customer=dao.update(customer);
		return customer;
	}


}