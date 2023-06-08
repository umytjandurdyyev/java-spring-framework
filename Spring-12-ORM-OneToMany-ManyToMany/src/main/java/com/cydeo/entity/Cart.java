package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "carts")
@Data
@NoArgsConstructor
public class Cart extends BaseEntity{

    @ManyToMany
//    @JoinTable(name = "cart_item_rel",
//            joinColumns = @JoinColumn(name = "c_id"),
//            inverseJoinColumns = @JoinColumn(name = "i_id"))
    private List<Item> itemList;
}
