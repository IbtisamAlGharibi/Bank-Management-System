package com.Bank.System.Services;

import com.Bank.System.Entities.Customer;
import com.Bank.System.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Customer addCustomer(Customer newCustomer){
        Customer customerToAdd = new Customer();

        customerToAdd.setCustomerId(newCustomer.getCustomerId());
        customerToAdd.setCustomerName(newCustomer.getCustomerName());
        customerToAdd.setAccountNumber(newCustomer.getAccountNumber());
        customerToAdd.setEmail(newCustomer.getEmail());
        customerToAdd.setBalance(newCustomer.getBalance());
        customerToAdd.setPhoneNumber(newCustomer.getPhoneNumber());
        customerToAdd.setActive(newCustomer.isActive());

        return customerRepository.save(customerToAdd);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.getAllCustomers();
    }

    public Customer getCustomerByID(int id){
        return customerRepository.getCustomerById(id);
    }
}
