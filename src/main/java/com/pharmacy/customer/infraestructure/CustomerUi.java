package com.pharmacy.customer.infraestructure;

import com.pharmacy.customer.domain.entities.Customer;
import com.pharmacy.customer.infraestructure.CreateCustomer;

import javax.swing.*;

public class CustomerUi {
    public CreateCustomer createCustomer;
    public CustomerUi() {}

    private void getChoice(int choice) {
        switch (choice) {
            case 0:
                createUserForm();
                break;
            case 1:
                createCustomer = new CreateCustomer();
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
        Customer customer = new Customer();
        JLabel firstName = new JLabel("Enter user first name:");
        firstName.setBounds(1, 1, 24, 3);
        JTextField firstNameInput = new JTextField();
        firstNameInput.setBounds(250, 1, 50, 3);

        JFrame frame = new JFrame();
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(firstName);
        frame.add(firstNameInput);
        frame.setLocation(500, 500);
        frame.setVisible(true);
    }
}
