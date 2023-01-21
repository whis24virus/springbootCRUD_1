package com.keshav.crudexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//this is the entity or the model

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "PRODUCTS")
public class Product {


    @Id // primpary key mapping
    @GeneratedValue // annotation is to configure the way of increment of the specified columnd(field)   given by hibernate
    private int id;
    private String name;
    private int quantity;
    private double price;

}
