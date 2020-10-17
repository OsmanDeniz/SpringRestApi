package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Payment;
import com.deniz.sakilamysql.Services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/payment")
public class PaymentController {

    private IPaymentService service;

    @Autowired
    public PaymentController(IPaymentService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public void add(@RequestBody Payment payment) {
        this.service.add(payment);
    }
    @PostMapping("/update")
    public void update(@RequestBody Payment payment) {
        this.service.update(payment);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody Payment payment) {
    this.service.delete(payment);
    }
    @GetMapping("/")
    public List<Payment> getAll() {
        return this.service.getAll();
    }
    @GetMapping("/{payment_id}")
    public Payment getById(@PathVariable int payment_id) {
        return this.service.getById(payment_id);
    }
}
