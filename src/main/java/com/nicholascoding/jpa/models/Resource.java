package com.nicholascoding.jpa.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// The subclass table will inherit all the attributes in the parent class with TABLE_PER_CLASS
@DiscriminatorColumn(name = "resource_type")
// --> Only with SINGLE_TABLE
public class Resource {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;
    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}