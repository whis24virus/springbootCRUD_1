package com.keshav.crudexample.controller;


import com.keshav.crudexample.entity.Product;
import com.keshav.crudexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//this controller will talk with the service class
@RestController
public class ProductController {


    //injecting service class
    @Autowired
    private ProductService service;


    //writing the rest endpoints for all the methods present in the service

    //post method api

    //@RequestBody to parse input jason to the Product object
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }



    //get api

    @GetMapping("/products")
    public List<Product> findAll(){
        return service.getProducts();
    }


    @GetMapping("/products/{id}")
    public Optional<Product> findProductId(@PathVariable int id){
        return service.getProductById(id);
    }



    @GetMapping("/products/{name}")
    public List<Product> findByName(@PathVariable String name){
        return service.getProductByName(name);
    }



    // put api

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }


    //delete api

    @DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }





}
