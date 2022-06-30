package com.cydeo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"},ignoreUnknown = true)
public class Location extends BaseEntity {

    private String name;
    private BigDecimal latitude;
    private BigDecimal langitude;
    private String postalCode;
    private String country;
    private String state;
    private String city;
    private String address;

}
