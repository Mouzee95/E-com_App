package com.mouzeecode.E_com_App.service;

import com.mouzeecode.E_com_App.entity.Category;
import com.mouzeecode.E_com_App.repository.CategoryRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public List<Category> getAllCategories(){
        return  categoryRepo.findAll();

    }
}
