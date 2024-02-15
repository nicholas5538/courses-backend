package com.nicholascoding.jpa.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

public record AuthorDto(
        @NotEmpty(message="First name should not be empty")
        String firstName,
        @NotEmpty(message="Last name should not be empty")
        String lastName,
        @NotEmpty(message="Email should not be empty")
        String email,
        @Min(10)
        Integer age
) {
}
