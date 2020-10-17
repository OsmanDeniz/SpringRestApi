package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.IRentalDAL;
import com.deniz.sakilamysql.Entities.Rental;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class RentalManager implements IRentalService {

    private IRentalDAL rentalService;

    @Autowired
    public RentalManager(IRentalDAL rentalService) {
        this.rentalService = rentalService;
    }

    @Override
    @Transactional
    public void add(Rental rental) {
        this.rentalService.add(rental);
    }

    @Override
    @Transactional
    public void update(Rental rental) {
        this.rentalService.update(rental);
    }

    @Override
    @Transactional
    public void delete(Rental rental) {
        this.rentalService.delete(rental);
    }

    @Override
    @Transactional
    public List<Rental> getAll() {
        return this.rentalService.getAll();
    }

    @Override
    @Transactional
    public Rental getById(int rental_id) {
        return this.rentalService.getById(rental_id);
    }
}
