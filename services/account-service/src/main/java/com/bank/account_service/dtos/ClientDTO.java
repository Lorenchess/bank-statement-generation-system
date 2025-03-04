package com.bank.account_service.dtos;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Builder;

@Builder
public record ClientDTO(
        @NotNull(message = "Name cannot be null")
        @NotBlank(message = "Name cannot be blank")
        @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters long")
        String name,

        @NotNull(message = "Last name cannot be null")
        @NotBlank(message = "Last name cannot be blank")
        @Size(min = 2, max = 20, message = "Last name must be between 2 and 20 characters long")
        String lastName,

        @NotNull(message = "Phone number cannot be null")
        @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
        String phoneNumber,

        @NotNull(message = "Email cannot be null")
        @Email(message = "Invalid email format")
        String email,

        @Valid
        @NotNull(message = "Address cannot be null")
        AddressDTO addressDTO,

        @NotBlank(message = "Password cannot be blank")
        String password
) {
}
