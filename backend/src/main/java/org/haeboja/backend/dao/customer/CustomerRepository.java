package org.haeboja.backend.dao.customer;

import org.haeboja.backend.dto.Customer;

public interface CustomerRepository {
    long save(Customer customer);

    public Customer getCustomerById(String id);
}
