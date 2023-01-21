package com.keshav.crudexample.service;


import com.keshav.crudexample.entity.Product;
import com.keshav.crudexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    //get method - read    200 (OK), single entity. 404 (Not Found), if ID not found or inval
    //200 (OK), list of entities. Use pagination, sorting and filtering to navigate big lists.


    //post - create  201 (Created), Response contains response similar to GET /user/{id} containing new ID.


    // patch - update  BatchApi   200 (OK) or 204 (No Content).       404 (Not Found), if ID not found or invalid.



    //delete - delete  204 (No Content).  400(Bad Request) if no filter is specified. 404 (Not Found), if ID not found or invalid.



    //put - update/Replace




    //post method to save or create product object to the database

    public Product saveProduct(Product product){
        return repository.save(product);
    }

    //post method ro save list of products
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }





    //get method to fetch product object from the database

    public List<Product> getProducts(){
        return repository.findAll();

    }


    //get method to fetch product object by using single field
    public Optional<Product> getProductById(int id){
        return repository.findById(id);

    }

    public List<Product> getProductByName(String name){
        return repository.findByName(name);

    }






    //method for deleting

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product removed with the id -----> " + id+" ******";
    }



    //update method patch or put(replace)

    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repository.save(existingProduct);


    }






























}
