package com.pharmacy.customer.application;

import com.pharmacy.customer.domain.service.CustomerService;

public class DeleteCustomerUseCase {
    CustomerService customerService;
    
    public DeleteCustomerUseCase(CustomerService customerService) {
        this.customerService = customerService;
    }
}
