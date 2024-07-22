package com.pharmacy.customer.infraestructure.in;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.toedter.calendar.JDateChooser;

public class CreateUserUi extends JFrame implements ActionListener {
    private JLabel idLabel, firstNameLabel, lastNameLabel, birthDateLabel;
    private JTextField idField, firstNameField, lastNameField;
    private JButton addButton, backButton;
    private JDateChooser dateChooser;
    public CreateUserUi() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Create Customer");
        getContentPane().setBackground(new Color(200, 200, 200));

        idLabel = new JLabel("Ingrese el ID: ");
        idLabel.setBounds(8, 8, 100, 20);
        idField = new JTextField();
        idField.setBounds(108, 8, 100, 20);

        firstNameLabel = new JLabel("Ingrese el primer nombre: ");
        firstNameLabel.setBounds(8, 32, 200, 20);
        firstNameField = new JTextField();
        firstNameField.setBounds(200, 32, 150, 20);

        lastNameLabel = new JLabel("Ingrese el apellido: ");
        lastNameLabel.setBounds(8, 56, 150, 20);
        lastNameField = new JTextField();
        lastNameField.setBounds(150, 56, 150, 20);

        birthDateLabel = new JLabel("Fecha de nacimiento: ");
        birthDateLabel.setBounds(8, 80, 160, 20);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(168, 80, 100, 20);

        add(idLabel);
        add(idField);
        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(birthDateLabel);
        add(dateChooser);

        setBounds(0, 0, 500, 500);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {}
}
