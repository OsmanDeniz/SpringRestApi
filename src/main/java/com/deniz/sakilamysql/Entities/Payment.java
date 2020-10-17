package com.deniz.sakilamysql.Entities;

import org.hibernate.Session;
import org.hibernate.annotations.Generated;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int payment_id;
    @Column(name = "customer_id")
    private int customer_id;
    @Column(name = "staff_id")
    private int staff_id;
    @Column(name = "rental_id")
    private Integer rental_id;
    @Column(name = "amount")
    private float amount;
    @Column(name = "payment_date")
    private String  payment_date;
    @Column(name = "last_update")
    private String  last_update;

    public Payment() {
    }

    public Payment(int payment_id, int customer_id, int staff_id, int rental_id, float amount, String payment_date, String last_update) {
        this.payment_id = payment_id;
        this.customer_id = customer_id;
        this.staff_id = staff_id;
        this.rental_id = rental_id;
        this.amount = amount;
        this.payment_date = payment_date;
        this.last_update = last_update;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(String payment_date) {
        this.payment_date = payment_date;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}

