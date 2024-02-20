package com.otaku.spring_boot_example2.repositary;
import com.otaku.spring_boot_example2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product,Integer>{
    Product findByName(String name);
}
