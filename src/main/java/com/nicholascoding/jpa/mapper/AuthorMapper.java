package com.nicholascoding.jpa.mapper;

import com.nicholascoding.jpa.dto.AuthorDto;
import com.nicholascoding.jpa.dto.AuthorResponseDto;
import com.nicholascoding.jpa.models.Author;

public class AuthorMapper {
    public Author toAuthor(AuthorDto authorDto) {
        if (authorDto == null) throw new NullPointerException("The author Dto should not be empty");
        Author author = new Author();
        author.setFirstName(authorDto.firstName());
        author.setLastName(authorDto.lastName());
        author.setEmail(authorDto.email());
        author.setAge(authorDto.age());

        return author;
    }

    public AuthorResponseDto AuthorResponseDto(Author author) {
        return new AuthorResponseDto(author.getFirstName(), author.getLastName(), author.getEmail());
    }
}
