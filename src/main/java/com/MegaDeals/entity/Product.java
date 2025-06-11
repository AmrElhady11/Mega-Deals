package com.MegaDeals.entity;

import jakarta.persistence.*;
import lombok.*;

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity
    @Table(name = "menu_item")
    @EqualsAndHashCode(callSuper = false)
    public class Product extends BaseEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String description;
        private Double price;

    }


