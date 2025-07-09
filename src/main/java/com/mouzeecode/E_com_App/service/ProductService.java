package com.mouzeecode.E_com_App.service;

import com.mouzeecode.E_com_App.entity.Product;
import com.mouzeecode.E_com_App.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getAllProducts(){
       return productRepo.findAll();
    }
    public  List<Product> getProductByCategory(Long categoryId){
        return productRepo.findByCategoryId(categoryId);
    }
}
