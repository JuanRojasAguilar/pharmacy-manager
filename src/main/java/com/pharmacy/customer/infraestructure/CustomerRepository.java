package com.pharmacy.customer.infraestructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

import com.mysql.cj.PreparedQuery;
import com.mysql.cj.xdevapi.Result;
import com.pharmacy.customer.domain.entities.Customer;
import com.pharmacy.customer.domain.service.CustomerService;

public class CustomerRepository implements CustomerService{
    private Connection connection;

    public CustomerRepository() {
        try {
            Properties props = new Properties();
            props.load(getClass().getClassLoader().getResourceAsStream("db.properties"));
            String url = props.getProperty("url");
            String user = props.getProperty("user");
            String password = props.getProperty("password");
            connection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void createCustomer(Customer customer) {
        try {
            String query = "INSERT INTO customers (id, id_type, first_name, last_name, birth_date, register_date, id_city, district) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, customer.getId());
            ps.setInt(2, customer.getIdCity());
            ps.setString(3, customer.getFirstName());
            ps.setString(4, customer.getLastName());
            ps.setDate(5, customer.getBirthDate());
            ps.setDate(6, customer.getRegisterDate());
            ps.setInt(7, customer.getIdCity());
            ps.setString(8, customer.getDistrict());
            ps.executeUpdate();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCustomer(Customer client) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
    }

    @Override
    public void deleteCustomer(String id) {
        try {
            String query = "DELETE FROM customers WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Customer> findCustomerById(String id) {
        try {
            String query = "SELECT * FROM customers WHERE id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Customer customer = new Customer();
                return Optional.of(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }

    @Override
    public Optional<List<Customer>> findAllcustomer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAllcustomer'");
    }
}
