package com.Bank.System.Controllers;

import com.Bank.System.Entities.Customer;
import com.Bank.System.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
    @GetMapping("getAll")
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }
    @GetMapping("getById")
    public Customer getById(@RequestParam Integer id) {
        return customerService.getCustomerByID(id);
    }

    @GetMapping("getByName")
    public Customer getByName(@RequestParam String name) {
        return customerService.getCustomerByName(name);
    }
}
