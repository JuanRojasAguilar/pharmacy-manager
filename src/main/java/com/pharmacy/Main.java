package com.pharmacy;


import com.pharmacy.customer.infraestructure.in.CustomerUi;

public class Main {
    public static void main(String[] args) {
        CustomerUi customerUi = new CustomerUi();
        customerUi.showUserMenu();
    }
}