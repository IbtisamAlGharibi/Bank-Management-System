package com.Bank.System.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Data
@Getter
@Setter
public class Customer {
    private int customerId;
    private String customerName;
    private int accountNumber;
    private int balance;
    private String email;
    private int phoneNumber;

}
