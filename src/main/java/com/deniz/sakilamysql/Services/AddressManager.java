package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.IAddressDAL;
import com.deniz.sakilamysql.Entities.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class AddressManager implements IAddressService {

    private IAddressDAL addressDAL;
    @Autowired
    public AddressManager(IAddressDAL addressDAL) {
        this.addressDAL = addressDAL;
    }

    @Override
    @Transactional
    public void add(Address address) {
        this.addressDAL.add(address);
    }

    @Override
    @Transactional
    public void update(Address address) {
        this.addressDAL.update(address);
    }

    @Override
    @Transactional
    public void delete(Address address) {
        this.addressDAL.delete(address);
    }

    @Override
    @Transactional
    public List<Address> getAll() {
        return this.addressDAL.getAll();
    }

    @Override
    @Transactional
    public Address getById(int address_id) {
        return this.addressDAL.getById(address_id);
    }
}
