package com.infyflight.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infyflight.DAO.Customer;
import com.infyflight.DAO.CustomerDTO;
import com.infyflight.interfaces.CustomerRepository;
import com.infyflight.interfaces.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO addCustomer(CustomerDTO dto) {
        Customer customer = new Customer();
        customer.setName(dto.getName());
        customer.setEmailId(dto.getEmailId());
        customer.setDateOfBirth(dto.getDateOfBirth());

        Customer saved = customerRepository.saveCustomer(customer);

        CustomerDTO response = new CustomerDTO();
        response.setCustomerId(saved.getCustomerId());
        response.setName(saved.getName());
        response.setEmailId(saved.getEmailId());
        response.setDateOfBirth(saved.getDateOfBirth());
        return response;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.getAllCustomers().stream().map(c -> {
            CustomerDTO dto = new CustomerDTO();
            dto.setCustomerId(c.getCustomerId());
            dto.setName(c.getName());
            dto.setEmailId(c.getEmailId());
            dto.setDateOfBirth(c.getDateOfBirth());
            return dto;
        }).collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomerById(Integer id) {
        Customer customer = customerRepository.getCustomerById(id);
        if (customer == null)
            return null;

        CustomerDTO dto = new CustomerDTO();
        dto.setCustomerId(customer.getCustomerId());
        dto.setName(customer.getName());
        dto.setEmailId(customer.getEmailId());
        dto.setDateOfBirth(customer.getDateOfBirth());
        return dto;
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepository.deleteCustomer(id);
    }
}
