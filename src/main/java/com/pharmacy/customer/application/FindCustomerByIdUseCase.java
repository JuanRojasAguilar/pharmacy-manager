package com.pharmacy.customer.application;

import com.pharmacy.customer.domain.service.CustomerService;

public class FindCustomerByIdUseCase {
    private final CustomerService customerService;

    public FindCustomerByIdUseCase(CustomerService customerService) {
        this.customerService = customerService;
    }
}
