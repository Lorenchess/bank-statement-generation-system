package com.bank.account_service.dtos;

import com.bank.account_service.enums.AccountStatus;
import com.bank.account_service.enums.AccountType;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record AccountResponseDTO(
        Long accountId,
        String accountNumber,
        AccountType accountType,
        BigDecimal balance,
        AccountStatus status,
        LocalDateTime createdAt
) {
}
