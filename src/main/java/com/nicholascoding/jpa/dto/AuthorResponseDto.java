package com.nicholascoding.jpa.dto;

public record AuthorResponseDto(
        String firstName,
        String lastName,
        String email
) {
}
