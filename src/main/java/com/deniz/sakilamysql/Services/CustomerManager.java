package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.ICustomerDAL;
import com.deniz.sakilamysql.Entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerManager implements ICustomerService {

    private ICustomerDAL customerDAL;

    @Autowired
    public CustomerManager(ICustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }

    @Override
    @Transactional
    public void add(Customer customer) {
        this.customerDAL.add(customer);
    }

    @Override
    @Transactional
    public void update(Customer customer) {
        this.customerDAL.update(customer);
    }

    @Override
    @Transactional
    public void delete(Customer customer) {
        this.customerDAL.delete(customer);
    }

    @Override
    @Transactional
    public List<Customer> getAll() {
        return this.customerDAL.getAll();
    }

    @Override
    @Transactional
    public Customer getById(int customer_id) {
        return this.customerDAL.getById(customer_id);
    }
}
