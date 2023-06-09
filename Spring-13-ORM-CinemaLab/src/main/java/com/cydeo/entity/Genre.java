package com.cydeo.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Data
public class Genre extends BaseEntity {
    private String name;

    @ManyToMany(mappedBy = "genreList")
    private Set<Movie> movieList;
}
