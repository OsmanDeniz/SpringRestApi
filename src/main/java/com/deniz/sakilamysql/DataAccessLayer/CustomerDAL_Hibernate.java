package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Customer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CustomerDAL_Hibernate implements ICustomerDAL {

    private EntityManager manager;

    @Autowired
    public CustomerDAL_Hibernate(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void add(Customer customer) {
        Session session = manager.unwrap(Session.class);
        session.save(customer);
    }

    @Override
    public void update(Customer customer) {
        Session session = manager.unwrap(Session.class);
        session.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        Session session = manager.unwrap(Session.class);
        Customer customerToDelete = session.get(Customer.class, customer.getCustomer_id());
        session.delete(customerToDelete);
    }

    @Override
    @Transactional
    public List<Customer> getAll() {
        Session session = manager.unwrap(Session.class);
        List<Customer> customers = session.createQuery("from Customer ", Customer.class).getResultList();
        return customers;
    }

    @Override
    public Customer getById(int customer_id) {
        Session session = manager.unwrap(Session.class);
        Customer customer = session.get(Customer.class, customer_id);
        return customer;
    }
}
