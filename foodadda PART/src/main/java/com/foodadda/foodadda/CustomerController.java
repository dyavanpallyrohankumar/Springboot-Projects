package com.foodadda.foodadda;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // 🔹 Create or Update
    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    // 🔹 Get All
    @GetMapping
    public Iterable<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // 🔹 Get by ID
    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }

    // 🔹 Delete
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Integer id) {
        customerService.deleteCustomer(id);
        return "Customer deleted successfully!";
    }

    // 🔹 Find by Email ID
    @GetMapping("/email/{emailId}")
    public Optional<Customer> findByEmailId(@PathVariable String emailId) {
        return customerService.findByEmailId(emailId);
    }

    // 🔹 Find by Email and Name
    @GetMapping("/email/{emailId}/name/{name}")
    public Optional<Customer> findByEmailIdAndName(@PathVariable String emailId,
            @PathVariable String name) {
        return customerService.findByEmailIdAndName(emailId, name);
    }

    // 🔹 OR Condition
    @GetMapping("/email-or-name")
    public Optional<Customer> findByEmailOrName(@RequestParam String email,
            @RequestParam String name) {
        return customerService.findByEmailIdAndName(email, name);
    }

    // 🔹 Between Dates
    @GetMapping("/dob-between")
    public List<Customer> findByDateOfBirthBetween(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return customerService.findByDateOfBirthBetween(from, to);
    }

    // 🔹 Before Date
    @GetMapping("/dob-before/{date}")
    public List<Customer> findByDateOfBirthBefore(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return customerService.findByDateOfBirthBefore(date);
    }

    // 🔹 After Date
    @GetMapping("/dob-after/{date}")
    public List<Customer> findByDateOfBirthAfter(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return customerService.findByDateOfBirthBefore(date);
    }

    // 🔹 Name like pattern
    @GetMapping("/name-like/{pattern}")
    public List<Customer> findByNameLike(@PathVariable String pattern) {
        return customerService.findByNameLike("%" + pattern + "%");
    }

    // 🔹 Order by DOB Asc
    @GetMapping("/order/asc/{name}")
    public List<Customer> findByNameOrderByDateOfBirth(@PathVariable String name) {
        return customerService.findByNameOrderByDateOfBirth(name);
    }

    // 🔹 Order by DOB Desc
    @GetMapping("/order/desc/{name}")
    public List<Customer> findByNameOrderByDateOfBirthDesc(@PathVariable String name) {
        return customerService.findByNameOrderByDateOfBirth(name);
    }
}
