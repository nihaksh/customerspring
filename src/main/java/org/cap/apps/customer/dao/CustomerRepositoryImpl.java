package org.cap.apps.customer.dao;

import org.cap.apps.customer.entities.Customer;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CustomerRepositoryImpl implements ICustomerRepository {

	private Map<Long, Customer> store = new HashMap<Long, Customer>();

	private Long generatedId;

	Long generateId() {
		++generatedId;
		return generatedId;
	}

	
//@Override
	public Customer add(Customer customer) {
		
		Long id = generateId();
		customer.setId(id);
		store.put(id, customer);
		return customer;
			}
//@Override
public Customer update(Customer customer) {
	
		Long id =customer.getId();
		store.put(id, customer);
		return customer;
		
		
	}
//@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		
		return store.get(id);
		
	}

}
