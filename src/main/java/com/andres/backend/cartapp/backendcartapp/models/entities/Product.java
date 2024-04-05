package com.andres.backend.cartapp.backendcartapp.models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//package models.entities;
import jakarta.persistence.Table;

//@Table(name="products")
@Entity
@Table(name="products")
public class Product {

    // GenerationType.IDENTITY para mysql es para el id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     //@Column(name="name_product") //en caso de otro nombre
    private String name;

    private String description;

    private Long price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    
    
}
