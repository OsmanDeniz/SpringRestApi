package com.deniz.sakilamysql.DataAccessLayer;
import com.deniz.sakilamysql.Entities.Payment;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IPaymentDAL {
    void add(Payment payment);

    void update(Payment payment);

    void delete(Payment payment);

    List<Payment> getAll();

    Payment getById(int payment_id);


}
