package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Staff;

import java.util.List;

public interface IStaffDAL {
    void add(Staff staff);

    void update(Staff staff);

    void delete(Staff staff);

    List<Staff> getAll();

    Staff getById(int staff_id);

}
