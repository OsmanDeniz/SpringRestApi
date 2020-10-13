package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Address;

import java.util.List;

public interface IAddressDAL {
    void add(Address address);

    void update(Address address);

    void delete(Address address);

    List<Address> getAll();

    Address getById(int address_id);
}
