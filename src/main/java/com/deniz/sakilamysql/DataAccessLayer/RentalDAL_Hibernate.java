package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Rental;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RentalDAL_Hibernate implements IRentalDAL {

    private EntityManager entityManager;

    @Autowired
    public RentalDAL_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Rental rental) {
        Session session = entityManager.unwrap(Session.class);
        session.save(rental);
    }

    @Override
    public void update(Rental rental) {
        Session session = entityManager.unwrap(Session.class);
        session.update(rental);
    }

    @Override
    public void delete(Rental rental) {
        Session session = entityManager.unwrap(Session.class);
        Rental rentalToDelete = session.get(Rental.class, rental.getRental_id());
        session.delete(rentalToDelete);
    }

    @Override
    @Transactional
    public List<Rental> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Rental> rentalList = session.createQuery("from Rental ", Rental.class).getResultList();
        return rentalList;
    }

    @Override
    public Rental getById(int rental_id) {
        Session session = entityManager.unwrap(Session.class);
        Rental rental = session.get(Rental.class, rental_id);
        return rental;
    }
}
