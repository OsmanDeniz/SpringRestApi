package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Customer;

import java.util.List;

public interface ICustomerDAL {
    void add(Customer customer);

    void update(Customer customer);

    void delete(Customer customer);

    List<Customer> getAll();

    Customer getById(int customer_id);
}
