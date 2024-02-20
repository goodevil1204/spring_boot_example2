package com.otaku.spring_boot_example2.service;
import com.otaku.spring_boot_example2.entity.Product;
import com.otaku.spring_boot_example2.repositary.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product){
      return  repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products){
        return  repository.saveAll(products);
    }

    public List<Product> getProduct(){
        return repository.findAll();
    }
    public Product getProductbyID(int id){
        return repository.findById(id).orElse(null);
    }
    public Product getProductbyName(String name){
        return repository.findByName(name);
    }
    public String deleteProduct(int id){
            repository.deleteById(id);
            return "Product removed !! " + id;
    }
    public Product updateProduct(Product product){
        Product existingProduct=repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());

        return repository.save(existingProduct);
    }
}
