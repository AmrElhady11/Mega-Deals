package com.MegaDeals.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart")
@EqualsAndHashCode(callSuper = false)
public class Cart extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "total_price")
    private Double totalPrice;
    @Column(name = "total_items")   // we need to update it to make it driven
    private Integer totalItems;

    @Enumerated(EnumType.STRING)
    private Integer status;
    private double discount;
    @OneToOne
    @JoinColumn(name = "customer_id",referencedColumnName = "id")
    private Customer customer;

    @OneToMany(mappedBy ="cart",cascade = CascadeType.ALL)
    private List<CartItem> cartItems;

}
