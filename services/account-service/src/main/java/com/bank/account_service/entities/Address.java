package com.bank.account_service.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Address {
    private Long id;

    private String street;

    private String city;

    private String postalCode;

    private String state;

    private String country;
}
