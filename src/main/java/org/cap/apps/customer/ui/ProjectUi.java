package org.cap.apps.customer.ui;

import org.cap.apps.customer.entities.Customer;
import org.cap.apps.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;




@Component
public class ProjectUi {
	@Autowired
	private ICustomerService service;

	public void run()
	{
		Customer customer = add(1L, "panda");
		Customer customer1 = add(2L, "sonu");
		Customer customer2= add(3L, "rashu");
		Long id1 = customer.getId();
		System.out.println("Before update: "+customer.toString());
		customer = update(id1, "sonu");
		System.out.println("After update: "+customer.toString());
		System.out.println("Before update: "+customer1.toString());
		Long id2 = customer1.getId();
		customer1 = update(id2, "panda");
		System.out.println("After update: "+customer1.toString());
		System.out.println(customer2.toString());
	}
	
	public Customer add(Long id, String name)
	{
		Customer customer = new Customer(id, name);
		customer = service.register(customer);
		return customer;
	}
	
	public Customer update(Long id, String newName)
	{
		return service.updateName(id, newName);
	}
	
}
