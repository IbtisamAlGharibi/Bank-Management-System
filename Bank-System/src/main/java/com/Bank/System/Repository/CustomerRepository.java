package com.Bank.System.Repository;

import com.Bank.System.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("SELECT c FROM Customer c WHERE c.isActive=true")
    List<Customer> getAllCustomers();

    @Query("SELECT c from Customer c WHERE c.isActive=true AND c.id=:customerId")
    Customer getCustomerById(@Param("customerId") Integer id);

    @Query(" SELECT c from Customer c WHERE c.isActive=true AND c.customerName=:customerName")
    Customer getCustomerByName(@Param("customerName") String customerName);
}
