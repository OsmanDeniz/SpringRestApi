package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.Customer;

import java.util.List;

public interface ICustomerService {
    void add(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);

    List<Customer> getAll();

    Customer getById(int customer_id);
}
