package com.nicholascoding.jpa.services;

import com.nicholascoding.jpa.dto.AuthorResponseDto;
import com.nicholascoding.jpa.mapper.AuthorMapper;
import com.nicholascoding.jpa.models.Author;
import com.nicholascoding.jpa.repositories.AuthorRepository;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
public class AuthorService {
    private final AuthorRepository repository;
    private final AuthorMapper mapper;

    public List<AuthorResponseDto> getAuthorsByFirstName(String firstName) {
        List<Author> authors = repository.findAllByFirstName(firstName);
        return authors.stream().map(mapper::AuthorResponseDto).collect(Collectors.toList());
    }

    public List<AuthorResponseDto> getAuthorsByFirstNameIgnoreCase(String firstName) {
        List<Author> authors = repository.findAllByFirstNameIgnoreCase(firstName);
        return authors.stream().map(mapper::AuthorResponseDto).collect(Collectors.toList());
    }

    public List<AuthorResponseDto> getAuthorsByFirstNameContainingIgnoreCase(String firstName) {
        List<Author> authors = repository.findAllByFirstNameContainingIgnoreCase(firstName);
        return authors.stream().map(mapper::AuthorResponseDto).collect(Collectors.toList());
    }

    public List<AuthorResponseDto> getAuthorsByFirstNameStartingWithIgnoreCase(String firstName) {
        List<Author> authors = repository.findAllByFirstNameStartingWithIgnoreCase(firstName);
        return authors.stream().map(mapper::AuthorResponseDto).collect(Collectors.toList());
    }

    public List<AuthorResponseDto> getAuthorsByFirstNameEndingWithIgnoreCase(String firstName) {
        List<Author> authors = repository.findAllByFirstNameEndingWithIgnoreCase(firstName);
        return authors.stream().map(mapper::AuthorResponseDto).collect(Collectors.toList());
    }

    public List<AuthorResponseDto> getAuthorsByFirstNameInIgnoreCase(String firstNames) {
        List<String> splitNames = Arrays.stream(firstNames.split(",")).toList();
        List<Author> authors = repository.findAllByFirstNameInIgnoreCase(splitNames);
        return authors.stream().map(mapper::AuthorResponseDto).collect(Collectors.toList());
    }


    public int getCountByAge(int age) {
        return repository.countAllByAge(age);
    }

    public void deleteAllByAge(int age) {
        repository.deleteAllByAge(age);
    }

    public void updateAuthorFirstName(String firstName, String id) {
        repository.updateAuthorFirstName(firstName, id);
    }
}
