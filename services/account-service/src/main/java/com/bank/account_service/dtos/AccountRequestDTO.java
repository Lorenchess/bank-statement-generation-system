package com.bank.account_service.dtos;

import com.bank.account_service.enums.AccountStatus;
import com.bank.account_service.enums.AccountType;
import jakarta.validation.constraints.*;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record AccountRequestDTO(

        @NotNull(message = "Client id is required")
        Long clientId,

        @NotNull(message = "Account type is required")
        AccountType accountType,

        @NotNull(message = "Initial deposit cannot be null")
        @DecimalMin(value = "20.00", message = "Initial deposit needs to be at list $20")
        BigDecimal initialDeposit

) {
}
