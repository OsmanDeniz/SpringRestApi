package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.Payment;

import java.util.List;

public interface IPaymentService {

    void add(Payment payment);

    void update(Payment payment);

    void delete(Payment payment);

    List<Payment> getAll();

    Payment getById(int payment_id);


}
