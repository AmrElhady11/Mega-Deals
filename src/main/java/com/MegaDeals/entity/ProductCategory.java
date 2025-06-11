package com.MegaDeals.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product_category")
public class ProductCategory {
    @EmbeddedId
    private ProductCategoryID id;

    @ManyToOne
    @MapsId("categoryID")
    private Category category;

    @ManyToOne
    @MapsId("productID")
    private Product product;

    @Embeddable
    public class ProductCategoryID {
        private Long productID;
        private Long categoryID;
    }
}
