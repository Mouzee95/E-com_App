    package com.mouzeecode.E_com_App.entity;

    import jakarta.persistence.*;

    import lombok.Data;

    @Entity
    @Data
    public class Product {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String description;
        private String imageUrl;
        private Double price;
        private String currency = "R";

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "category_id", nullable = false)
        @com.fasterxml.jackson.annotation.JsonBackReference
        private Category category;

    }
