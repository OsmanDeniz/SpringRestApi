package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Payment;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class PaymentDAL_Hibernate implements IPaymentDAL {

    private EntityManager manager;
    @Autowired
    public PaymentDAL_Hibernate(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void add(Payment payment) {
        Session session = this.manager.unwrap(Session.class);
        session.save(payment);
    }

    @Override
    public void update(Payment payment) {
        Session session = this.manager.unwrap(Session.class);
        session.update(payment);
    }

    @Override
    public void delete(Payment payment) {
        Session session = this.manager.unwrap(Session.class);
        Payment paymentToDelete = session.get(Payment.class,payment.getPayment_id());
        session.delete(payment);
    }

    @Override
    @Transactional
    public List<Payment> getAll() {
        Session session = this.manager.unwrap(Session.class);
        List<Payment> paymentList = session.createQuery("from Payment",Payment.class).getResultList();
        return paymentList;
    }

    @Override
    public Payment getById(int payment_id) {
        Session session = this.manager.unwrap(Session.class);
        Payment payment = session.get(Payment.class,payment_id);
        return payment;

    }
}
