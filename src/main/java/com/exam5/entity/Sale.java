package com.exam5.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sale {
    @Id
    private long id;
    private long salesman_Id;
    private long product_Id;
    private String salesmanName;
    private long dos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSalesman_Id() {
        return salesman_Id;
    }

    public void setSalesman_Id(long salesman_Id) {
        this.salesman_Id = salesman_Id;
    }

    public long getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(long product_Id) {
        this.product_Id = product_Id;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public long getDos() {
        return dos;
    }

    public void setDos(long dos) {
        this.dos = dos;
    }
}
