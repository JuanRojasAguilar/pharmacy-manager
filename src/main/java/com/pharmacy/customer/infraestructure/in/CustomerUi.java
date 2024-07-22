package com.pharmacy.customer.infraestructure.in;

import javax.swing.*;
import java.sql.Date;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class CustomerUi {
    private Scanner scanner = new Scanner(System.in);
    public CustomerUi() {}

    private void getChoice(int choice) {
        switch (choice) {
            case 0:
                CreateUserUi createUserUi = new CreateUserUi();
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.exit(0);
            default:
                showUserMenu();
        }
    }

    public void showUserMenu() {
        System.out.println("Bienvenido al menu de clientes!");
        System.out.println("\t1. Agregar cliente.");
        System.out.println("\t2. Buscar cliente.");
        System.out.println("\t3. Listar clientes.");
        System.out.println("\t4. Eliminar cliente.");
        System.out.println("\t5. Salir");

        try {
            int userChoice = scanner.nextInt();
            getChoice(userChoice - 1);
        } catch (InputMismatchException e) {
            showUserMenu();
        }
    }

    private void createUserForm() {
        CreateUserUi userUi = new CreateUserUi();
        Object[] options = {"Registrar", "Cancelar"};
        JOptionPane.showOptionDialog(null, userUi, "Crear cliente",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, null);
    }

    private void showUserCard(String id, String fName, String lName) {
        System.out.println("Se ha creado el usuario");
        System.out.printf("%s %s - %s\n", fName, lName, id);
    }

    private String getUserId() {
        String userId = null;
        try {
            System.out.print("Ingresa el numero de documento: ");
            userId = scanner.nextLine();
            if (userId.isEmpty()) {
                System.out.println("No puedes agregar cosas vacias");
                getUserId();
            }
        } catch (Exception e) {
            System.out.println("Algo ha fallado, intenta de nuevo");
            showUserMenu();
        }
        return userId;
    }

    private String getUserFirstName() {
        try {
            System.out.print("Ingresa el nombre: ");
            String userName = scanner.nextLine();
            if (userName.isEmpty()) {
                System.out.println("No puedes agregar cosas vacias");
                getUserFirstName();
            } else {
                return userName;
            }
        } catch (Exception e) {
            System.out.println("Algo ha fallado, intenta de nuevo");
            showUserMenu();
        }
        return null;
    }
    private String getUserLastName() {
        try {
            System.out.print("Ingresa el apellido: ");
            String userName = scanner.nextLine();
            if (userName.isEmpty()) {
                System.out.println("No puedes agregar cosas vacias");
                getUserLastName();
            } else {
                return userName;
            }
        } catch (Exception e) {
            System.out.println("Algo ha fallado, intenta de nuevo");
            showUserMenu();
        }
        return null;
    }

    private Date getUserBirthday() {
        String year, month, day;
        scanner.nextLine();

        System.out.print("Ingresa el año de nacimiento: ");
        year = scanner.nextLine();
        System.out.println("Ingresa el mes de navcimiento: ");
        month = scanner.nextLine();
        System.out.println("Ingresa el dia de nacimiento: ");
        day = scanner.nextLine();

        Date usrDate = Date.valueOf(MessageFormat.format("%s-%s-%s", year,
                month, day));
        return usrDate;
    }
}
