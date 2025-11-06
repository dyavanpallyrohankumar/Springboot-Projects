package com.infyflight.repository;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.infyflight.DAO.Customer;
import com.infyflight.interfaces.CustomerRepository;

@Repository
@Transactional
public class CustomerRepositoryImpl implements CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Customer saveCustomer(Customer customer) {
        if (customer.getCustomerId() == null) {
            entityManager.persist(customer); // for new records
            return customer;
        } else {
            return entityManager.merge(customer); // for update
        }
    }

    @Override
    public List<Customer> getAllCustomers() {
        return entityManager.createQuery("SELECT c FROM Customer c", Customer.class)
                .getResultList();
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void deleteCustomer(Integer id) {
        Customer customer = entityManager.find(Customer.class, id);
        if (customer != null) {
            entityManager.remove(customer);
        }
    }

    @Override
    public List<Customer> findAllOrderByName() {
        String jpql = "SELECT c FROM Customer c ORDER BY c.name ASC";
        return entityManager.createQuery(jpql, Customer.class)
                .getResultList();
    }

    @Override
    public List<Object[]> countCustomersByType() {
        String jpql = "SELECT c.customerType, COUNT(c) FROM Customer c GROUP BY c.customerType";
        return entityManager.createQuery(jpql, Object[].class).getResultList();
    }

    @Override
    public Double findAverageCustomerId() {
        String jpql = "SELECT AVG(c.customerId) FROM Customer c";
        return entityManager.createQuery(jpql, Double.class).getSingleResult();
    }

    @Override
    public List<Customer> findByType(String type) {
        String jpql = "SELECT c FROM Customer c WHERE c.customerType = :type";
        return entityManager.createQuery(jpql, Customer.class)
                .setParameter("type", type)
                .getResultList();
    }

}