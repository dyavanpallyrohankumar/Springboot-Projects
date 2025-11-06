package com.infyflight.interfaces;

import java.util.List;

import com.infyflight.DAO.CustomerDTO;

public interface CustomerService {
    public CustomerDTO addCustomer(CustomerDTO dto);

    public List<CustomerDTO> getAllCustomers();

    public void deleteCustomer(Integer id);

    public CustomerDTO getCustomerById(Integer id);
}