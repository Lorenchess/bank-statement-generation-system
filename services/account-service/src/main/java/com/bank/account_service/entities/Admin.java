package com.bank.account_service.entities;

import com.bank.account_service.enums.Department;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Admins")
public class Admin extends BaseUser {
    private Department department;
}
