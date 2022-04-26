package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.*;

@Entity
@NoArgsConstructor
@Data
public class Genre extends BaseEntity{
    private String name;

    @ManyToMany(mappedBy = "genreList")
    private Set<Movie> movieList;
}
