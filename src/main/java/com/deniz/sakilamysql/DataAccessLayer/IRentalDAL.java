package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Rental;

import java.util.List;

public interface IRentalDAL {
    void add(Rental rental);

    void update(Rental rental);

    void delete(Rental rental);

    List<Rental> getAll();

    Rental getById(int rental_id);
}
