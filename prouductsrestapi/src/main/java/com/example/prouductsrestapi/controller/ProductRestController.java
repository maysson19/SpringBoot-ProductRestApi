package com.example.prouductsrestapi.controller;

import com.example.prouductsrestapi.entities.Product;
import com.example.prouductsrestapi.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {
    @Autowired
    ProductRepository repository;

    //Get all products
    @GetMapping("/products/")
    public List<Product>getProducts(){
        return repository.findAll();
    }
    //Get one product id
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") int id){
        return repository.findById(id).get();
    }

    //Post send to data in body
    @PostMapping("/Products/")
    public Product createProduct(@RequestBody Product product){
        return repository.save(product);
    }

    //Put update
    @PutMapping("/Products/")
    public Product updateProduct(@RequestBody Product product){
        return repository.save(product);
    }
    //Delete
    @DeleteMapping("/Products/{id}")
    public void deleteProduct(@PathVariable("id") int id){
        repository.deleteById(id);
    }
    
}
