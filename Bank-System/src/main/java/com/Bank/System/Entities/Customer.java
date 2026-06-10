package com.Bank.System.Entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    @Nonnull
    private String customerName;
    private int accountNumber;
    private int balance;
    private String email;
    private int phoneNumber;
    private boolean isActive;

}
