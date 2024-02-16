package com.nicholascoding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTHOR_TBL")
@NamedQuery(
        name = "Author.findByNamedQuery",
        query = "select distinct a from Author a where a.age >= :age"
)
public class Author extends BaseEntity {
    @Column(name="f_name", nullable = false)
    private String firstName;
    @Column(name="l_name", nullable = false)
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;

    // mappedBy is reserved to the non-owner of the relationship
    // in many-to-many relationship
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
