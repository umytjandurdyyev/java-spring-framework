package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
@Data
@NoArgsConstructor
public class Region extends BaseEntity{
    private String region;
    private String country;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }
}
