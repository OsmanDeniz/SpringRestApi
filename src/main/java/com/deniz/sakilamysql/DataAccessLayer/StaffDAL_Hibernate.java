package com.deniz.sakilamysql.DataAccessLayer;

import com.deniz.sakilamysql.Entities.Staff;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.security.SecureRandom;
import java.util.List;

@Repository
public class StaffDAL_Hibernate implements IStaffDAL {

    private EntityManager entityManager;

    @Autowired
    public StaffDAL_Hibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void add(Staff staff) {
        Session session = entityManager.unwrap(Session.class);
        session.save(staff);
    }

    @Override
    public void update(Staff staff) {
        Session session = entityManager.unwrap(Session.class);
        session.update(staff);
    }

    @Override
    public void delete(Staff staff) {
        Session session = entityManager.unwrap(Session.class);
        Staff staffToDelete = session.get(Staff.class,staff.getStaff_id());
        session.delete(staffToDelete);
    }

    @Override
    @Transactional
    public List<Staff> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<Staff> staffList = session.createQuery("from Staff ",Staff.class).getResultList();
        return staffList;
    }

    @Override
    public Staff getById(int staff_id) {
        Session session = entityManager.unwrap(Session.class);
        Staff staff = session.get(Staff.class,staff_id);
        return staff;
    }
}
