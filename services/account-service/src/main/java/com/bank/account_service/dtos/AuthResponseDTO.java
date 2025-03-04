package com.bank.account_service.dtos;

public record AuthResponseDTO(
        String accessToken,
        String tokenType,
        int expiresIn
) {
}
