package com.deniz.sakilamysql.RestApi;

import com.deniz.sakilamysql.Entities.Staff;
import com.deniz.sakilamysql.Services.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/staff")
public class StaffController {

    private IStaffService service;

    @Autowired
    public StaffController(IStaffService service) {
        this.service = service;
    }

    @PostMapping("/add")
    public void add(@RequestBody Staff staff) {
        this.service.add(staff);
    }

    @PostMapping("/update")
    public void update(@RequestBody Staff staff) {
        this.service.update(staff);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Staff staff) {
        this.service.delete(staff);
    }

    @GetMapping("/")
    public List<Staff> getAll() {
        return this.service.getAll();
    }

    @GetMapping("/{staff_id}")
    public Staff getById(@PathVariable int staff_id) {
        return this.service.getById(staff_id);
    }
}