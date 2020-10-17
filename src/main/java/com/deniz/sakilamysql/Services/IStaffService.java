package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.Entities.Staff;

import java.util.List;

public interface IStaffService {

    void add(Staff staff);

    void update(Staff staff);

    void delete(Staff staff);

    List<Staff> getAll();

    Staff getById(int staff_id);

}
