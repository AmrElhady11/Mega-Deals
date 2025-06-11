package com.MegaDeals.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
@EqualsAndHashCode(callSuper = false)
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @OneToOne(cascade = CascadeType.ALL)     //it will be added after implementing security
//    private User user;

//    @OneToOne(cascade = CascadeType.ALL)/  /it will be added after implementing order class
//    private List<Order> orders;


    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Cart cart ;



}
