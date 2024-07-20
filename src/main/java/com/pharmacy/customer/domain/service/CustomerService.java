package com.pharmacy.customer.domain.service;

import java.util.List;
import java.util.Optional;

import com.pharmacy.customer.domain.entities.Customer;

public interface CustomerService {
    void createCustomer(Customer client);
    void updateCustomer(Customer client);
    void deleteCustomer(String id);
    Optional<Customer> findCustomerById(String id);
    Optional<List<Customer>> findAllcustomer();
}
