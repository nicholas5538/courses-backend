package com.nicholascoding.jpa.controllers;

import com.nicholascoding.jpa.dto.AuthorResponseDto;
import com.nicholascoding.jpa.services.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/authors/{first-name}")
    public List<AuthorResponseDto> getAuthorsByFirstName(@PathVariable("first-name") String firstName) {
        return authorService.getAuthorsByFirstName(firstName);
    }

    @GetMapping("/authors/{first-name}")
    public List<AuthorResponseDto> getAuthorsByFirstNameIgnoreCase(@PathVariable("first-name") String firstName) {
        return authorService.getAuthorsByFirstNameIgnoreCase(firstName);
    }

    @GetMapping("/authors/{first-name}")
    public List<AuthorResponseDto> getAuthorsByFirstNameContainingIgnoreCase(@PathVariable("first-name") String firstName) {
        return authorService.getAuthorsByFirstNameContainingIgnoreCase(firstName);
    }

    @GetMapping("/authors/{first-name}")
    public List<AuthorResponseDto> getAuthorsByFirstNameStartingWithIgnoreCase(@PathVariable("first-name") String firstName) {
        return authorService.getAuthorsByFirstNameStartingWithIgnoreCase(firstName);
    }

    @GetMapping("/authors/{first-name}")
    public List<AuthorResponseDto> getAuthorsByFirstNameEndingWithIgnoreCase(@PathVariable("first-name") String firstName) {
        return authorService.getAuthorsByFirstNameEndingWithIgnoreCase(firstName);
    }

    @GetMapping("/authors")
    public List<AuthorResponseDto> getAuthorsByFirstNameInIgnoreCase(@RequestParam String firstNames) {
        return authorService.getAuthorsByFirstNameInIgnoreCase(firstNames);
    }

    @GetMapping("/authors/{age}/count")
    public int getCountByAge(@PathVariable("age") int age) {
        return authorService.getCountByAge(age);
    }

    @DeleteMapping("/authors/{age}")
    public void deleteAuthorsByAge(@PathVariable("age") int age) {
        authorService.deleteAllByAge(age);
    }

    @PatchMapping("/authors/{$id}")
    public void updateAuthorFirstName(@RequestBody String firstName, @PathVariable("id") String id) {
        authorService.updateAuthorFirstName(firstName, id);
    }
}
