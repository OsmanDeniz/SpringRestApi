package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.IPaymentDAL;
import com.deniz.sakilamysql.Entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentManager implements IPaymentService {

    private IPaymentDAL paymentDAL;

    @Autowired
    public PaymentManager(IPaymentDAL paymentDAL) {
        this.paymentDAL = paymentDAL;
    }

    @Override
    @Transactional
    public void add(Payment payment) {
        this.paymentDAL.add(payment);
    }

    @Override
    @Transactional
    public void update(Payment payment) {
        this.paymentDAL.update(payment);
    }

    @Override
    @Transactional
    public void delete(Payment payment) {
        this.paymentDAL.delete(payment);
    }

    @Override
    @Transactional
    public List<Payment> getAll() {
        return this.paymentDAL.getAll();
    }

    @Override
    @Transactional
    public Payment getById(int payment_id) {
        return this.paymentDAL.getById(payment_id);
    }
}
