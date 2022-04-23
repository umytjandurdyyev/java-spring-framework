package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "carts")
public class Cart extends BaseEntity{

    @ManyToMany
    @JoinTable(name = "cart_item_rel",
            joinColumns = @JoinColumn(name = "c_id"),
            inverseJoinColumns = @JoinColumn(name = "i_id"))
    private List<Item> itemList;
}
