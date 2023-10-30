package com.blueharvest.corebanking.repository;

import com.blueharvest.corebanking.model.Account;
import com.blueharvest.corebanking.model.Customer;

import java.util.List;

public interface AccountRepositoryCustom {

    public List<Account> findByCustomer(Customer customer);
}
