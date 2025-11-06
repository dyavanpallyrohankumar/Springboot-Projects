package com.infyflight.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infyflight.DAO.CustomerDTO;
import com.infyflight.interfaces.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public CustomerDTO addCustomer(@RequestBody CustomerDTO dto) {
        return customerService.addCustomer(dto);
    }

    @GetMapping("/")
    public List<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDTO getCustomerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
        return "Customer deleted successfully with ID: " + id;
    }

}
