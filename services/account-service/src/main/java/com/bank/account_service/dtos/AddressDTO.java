package com.bank.account_service.dtos;

import jakarta.validation.constraints.*;
import lombok.Builder;

@Builder
public record AddressDTO(
        @NotNull(message = "Street cannot be null")
        @NotBlank(message = "Street cannot be blank")
        @Size(max = 100, message = "Street must be at most 100 characters long")
        String street,

        @NotNull(message = "City cannot be null")
        @NotBlank(message = "City cannot be blank")
        @Size(max = 50, message = "City must be at most 50 characters long")
        String city,

        @NotNull(message = "Postal code cannot be null")
        @NotBlank(message = "Postal code cannot be blank")
        @Size(min = 5, max = 10, message = "Postal code must be between 5 and 10 characters")
        String postalCode,

        @NotNull(message = "State cannot be null")
        @NotBlank(message = "State cannot be blank")
        @Size(max = 50, message = "State must be at most 50 characters")
        String state,

        @NotNull(message = "Country cannot be null")
        @NotBlank(message = "Country cannot be blank")
        @Size(max = 50, message = "Country must be at most 50 characters")
        String country
) {
}
