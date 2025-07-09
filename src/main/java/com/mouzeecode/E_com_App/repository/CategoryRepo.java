package com.mouzeecode.E_com_App.repository;

import com.mouzeecode.E_com_App.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
