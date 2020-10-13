package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Address;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AddressDAL_Hibernate implements IAddressDAL {

    private EntityManager manager;

    @Autowired
    public AddressDAL_Hibernate(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void add(Address address) {
        Session session = this.manager.unwrap(Session.class);
        session.save(address);
    }

    @Override
    public void update(Address address) {
        Session session = this.manager.unwrap(Session.class);
        session.update(address);
    }

    @Override
    public void delete(Address address) {
        Session session = this.manager.unwrap(Session.class);
        Address addressToDelete = session.get(Address.class, address.getAddress_id());
        session.delete(addressToDelete);
    }

    @Override
    @Transactional
    public List<Address> getAll() {
        Session session = this.manager.unwrap(Session.class);
        List<Address> addresses = session.createQuery("from Address ", Address.class).getResultList();
        return addresses;
    }

    @Override
    public Address getById(int address_id) {
        Session session = this.manager.unwrap(Session.class);
        Address address = session.get(Address.class, address_id);
        return address;
    }
}
