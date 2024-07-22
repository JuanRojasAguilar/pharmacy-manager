package com.pharmacy.customer.infraestructure.in;

import javax.swing.*;

public class CustomerUi {
    private final CreateCustomer createCustomer = new CreateCustomer();
    public CustomerUi() {}

    private void getChoice(int choice) {
        switch (choice) {
            case 0:
                createCustomer.execute();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                System.exit(0);
        }
    }

    public void showUserMenu() {
        Object[] options = {"Crear cliente", "Consultar cliente", "Lista de clientes", "Eliminar cliente", "Volver"};
        int usrChoice = JOptionPane.showOptionDialog(null, "Welcome", "Customers", JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE, null, options, options[4]);

        getChoice(usrChoice);
    }



    private void createUserForm() {
        String createUserLabel = "Enter user First Name: ";
    }
}
