package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Customer;
import com.deniz.sakilamysql.Services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    private ICustomerService service;
    @Autowired
    public CustomerController(ICustomerService service) {
        this.service = service;
    }


    @PostMapping("/add")
    void add(@RequestBody Customer customer) {
        this.service.add(customer);
    }

    @PostMapping("/update")
    void update(@RequestBody Customer customer) {
        this.service.update(customer);

    }

    @PostMapping("/delete")
    void delete(@RequestBody Customer customer) {
        this.service.delete(customer);
    }

    @GetMapping("/")
    List<Customer> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{customer_id}")
    Customer getById(@PathVariable int customer_id) {
        return this.service.getById(customer_id);
    }
}
