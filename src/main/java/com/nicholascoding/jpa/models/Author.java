package com.nicholascoding.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTHOR_TBL")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique = true, updatable = false, length = 36)
    private String id;
    @Column(name="f_name", nullable = false)
    private String firstName;
    @Column(name="l_name", nullable = false)
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;
}
