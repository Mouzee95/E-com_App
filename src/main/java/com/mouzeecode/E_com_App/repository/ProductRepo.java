package com.mouzeecode.E_com_App.repository;

import com.mouzeecode.E_com_App.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
}
