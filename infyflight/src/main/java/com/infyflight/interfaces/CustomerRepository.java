package com.infyflight.interfaces;

import java.util.List;

import com.infyflight.DAO.Customer;

public interface CustomerRepository {

    Customer saveCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(Integer id);

    void deleteCustomer(Integer id);

    public List<Customer> findByType(String type);

    public List<Customer> findAllOrderByName();

    public List<Object[]> countCustomersByType();

    public Double findAverageCustomerId();
}
