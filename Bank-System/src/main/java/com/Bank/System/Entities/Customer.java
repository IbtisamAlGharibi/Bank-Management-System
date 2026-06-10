package com.Bank.System.Entities;

import lombok.*;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
public class Customer {
    private int customerId;
    private String customerName;
    private int accountNumber;
    private int balance;
    private String email;
    private int phoneNumber;
    private boolean isActive;

}
