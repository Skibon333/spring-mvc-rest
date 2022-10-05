package vlad.skiba.web.services;

import vlad.skiba.web.domain.Customer;

import java.util.List;

/**
 * Copyright Vlad Skiba (c) 2022.
 */
public interface CustomerService {

    List<Customer> findAllCustomers();

    Customer findCustomerById(Long id);

    Customer saveCustomer(Customer customer);

}
