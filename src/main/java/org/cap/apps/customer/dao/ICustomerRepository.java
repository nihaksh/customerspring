package org.cap.apps.customer.dao;

import org.cap.apps.customer.entities.Customer;

public interface ICustomerRepository {
Customer add(Customer customer);
Customer update(Customer customer);
Customer findById(Long id);
}
