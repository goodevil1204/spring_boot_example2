package com.otaku.spring_boot_example2.controller;
//hjkhkjhkfdsf
import com.otaku.spring_boot_example2.entity.Product;
import com.otaku.spring_boot_example2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class PoductController {

    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findallProducts(){
        return service.getProduct();
    }

    @GetMapping("productByID/{id}")
    public Product getProductbyId(@PathVariable int id){
        return service.getProductbyID(id);
    }

    @GetMapping("productByName/{name}")
    public Product getProductbyname(@PathVariable String name){
        return service.getProductbyName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
