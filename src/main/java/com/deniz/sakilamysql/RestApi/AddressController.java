package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Address;
import com.deniz.sakilamysql.Services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {

    private IAddressService addressService;

    @Autowired
    public AddressController(IAddressService addressService) {
        this.addressService = addressService;
    }

    @PostMapping("/add")
    void add(@RequestBody Address address) {
        this.addressService.add(address);
    }

    @PostMapping("/update")
    void update(@RequestBody Address address) {
        this.addressService.update(address);
    }

    @PostMapping("/delete")
    void delete(@RequestBody Address address) {
        this.addressService.delete(address);
    }

    @GetMapping("/")
    List<Address> getAll() {
        return this.addressService.getAll();
    }

    @GetMapping("/{address_id}")
    Address getById(@PathVariable int address_id) {
        return this.addressService.getById(address_id);
    }


}
