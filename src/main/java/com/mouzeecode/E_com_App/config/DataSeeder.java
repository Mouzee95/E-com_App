package com.mouzeecode.E_com_App.config;

import com.mouzeecode.E_com_App.entity.Category;
import com.mouzeecode.E_com_App.entity.Product;
import com.mouzeecode.E_com_App.repository.CategoryRepo;
import com.mouzeecode.E_com_App.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepo productRepo;
    private final CategoryRepo categoryRepo;

    public DataSeeder(ProductRepo productRepo, CategoryRepo categoryRepo) {
        this.productRepo = productRepo;
        this.categoryRepo = categoryRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        //Clear existing data
        productRepo.deleteAll();
        categoryRepo.deleteAll();


        //category Data
        Category gadgets = new Category();
        gadgets.setName("laptop");
//            gadgets=categoryRepo.save(gadgets);

        Category car = new Category();
        car.setName("van");


//        Category sportCar = new Category();
//        car.setName("sportCar");

//            car=categoryRepo.save(car);

        categoryRepo.saveAll(Arrays.asList(gadgets, car));


        //Create prodcut data
        Product laptop = new Product();
        laptop.setName("Dell");
        laptop.setDescription("Latitude 5210");
        laptop.setImageUrl("/images/img_1.png");
        laptop.setPrice(19500.96);
        laptop.setCurrency("R");
        laptop.setCategory(gadgets);

        Product van = new Product();
        van.setName("Izuzu");
        van.setDescription("Single cab Dmax with diesel fuel consumption");
        van.setImageUrl("/images/img_2.png");
        van.setPrice(340000.98);
        laptop.setCurrency("R");
        van.setCategory(car);

        Product sportCar = new Product();
        sportCar.setName("Mercedes Benz");
        sportCar.setDescription("AMG A45 with Sky blue color");
        sportCar.setImageUrl("/images/img.png");
        sportCar.setPrice(340000.98);
        laptop.setCurrency("R");
        sportCar.setCategory(car);

        productRepo.saveAll(Arrays.asList(laptop, van, sportCar));
    }
}
