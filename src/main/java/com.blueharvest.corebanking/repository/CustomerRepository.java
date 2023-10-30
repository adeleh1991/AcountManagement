package com.blueharvest.corebanking.repository;

import com.blueharvest.corebanking.model.Account;
import com.blueharvest.corebanking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
