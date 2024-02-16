package com.nicholascoding.jpa.specification;

import com.nicholascoding.jpa.models.Author;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

/*
Only useful when you want to create dynamic or complex SQL queries.
*/
public class AuthorSpecification
{
    public static Specification<Author> hasAge(int age) {
        return (
                Root<Author> root,
                CriteriaQuery<?> query,
                CriteriaBuilder builder
        ) -> {
            if (age < 0) return null;
            // WHERE age = age
            return builder.equal(root.get("age"), age);
        };
    }

    public static Specification<Author> firstNameContains(String firstName) {
        return (
                Root<Author> root,
                CriteriaQuery<?> query,
                CriteriaBuilder builder
        ) -> {
            if (firstName == null) return null;
            // WHERE firstName LIKE %firstName%
            return builder.like(root.get("firstName"), "%" + firstName + "%");
        };
    }
}
