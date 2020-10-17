package com.deniz.sakilamysql.Services;

import com.deniz.sakilamysql.DataAccessLayer.IStaffDAL;
import com.deniz.sakilamysql.Entities.Staff;
import com.deniz.sakilamysql.Services.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StaffManager implements IStaffService {

    private IStaffDAL dal;

    @Autowired
    public StaffManager(IStaffDAL dal) {
        this.dal = dal;
    }

    @Override
    @Transactional
    public void add(Staff staff) {
        this.dal.add(staff);
    }

    @Override
    @Transactional
    public void update(Staff staff) {
        this.dal.update(staff);
    }

    @Override
    @Transactional
    public void delete(Staff staff) {
        this.dal.delete(staff);
    }

    @Override
    @Transactional
    public List<Staff> getAll() {
        return this.dal.getAll();
    }

    @Override
    @Transactional
    public Staff getById(int staff_id) {
        return this.dal.getById(staff_id);
    }
}
