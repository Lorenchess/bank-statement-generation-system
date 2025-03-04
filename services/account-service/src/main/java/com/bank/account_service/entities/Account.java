package com.bank.account_service.entities;

import com.bank.account_service.enums.AccountStatus;
import com.bank.account_service.enums.AccountType;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private BigDecimal balance;

    @ElementCollection
    private List<Long> transactionsId;

    @Enumerated(EnumType.STRING)
    private AccountStatus status;

}
