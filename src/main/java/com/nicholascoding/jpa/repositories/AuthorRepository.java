package com.nicholascoding.jpa.repositories;

import com.nicholascoding.jpa.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, String> {
    List<Author> findAllByFirstName(String firstName);
    List<Author> findAllByFirstNameIgnoreCase(String firstName);
    List<Author> findAllByFirstNameContainingIgnoreCase(String firstName);
    List<Author> findAllByFirstNameStartingWithIgnoreCase(String firstName);
    List<Author> findAllByFirstNameEndingWithIgnoreCase(String firstName);
    List<Author> findAllByFirstNameInIgnoreCase(List<String> firstNames);
    int countAllByAge(int age);
    void deleteAllByAge(int age);

    // Update query
    @Modifying
    @Transactional
    @Query("update Author author set author.firstName = :firstName where author.id = :id")
    void updateAuthorFirstName(String firstName, String id);
}
