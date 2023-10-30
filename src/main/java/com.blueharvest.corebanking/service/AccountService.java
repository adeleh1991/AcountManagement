package com.blueharvest.corebanking.service;

import com.blueharvest.corebanking.dto.AccountDTO;
import com.blueharvest.corebanking.mapper.AccountMapper;
import com.blueharvest.corebanking.model.Account;
import com.blueharvest.corebanking.model.Customer;
import com.blueharvest.corebanking.model.Transaction;
import com.blueharvest.corebanking.repository.AccountRepository;
import com.blueharvest.corebanking.repository.CustomerRepository;
import com.blueharvest.corebanking.repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    private final CustomerRepository customerRepository;

    private final AccountMapper accountMapper;

    private final TransactionRepository transactionRepository;

    public AccountDTO createAccount(Long customerId, Double initialCredit){
        Customer customer=customerRepository.getReferenceById(customerId);
        Account account = new Account().setAccountNumber(1L) .setInitialCredit(initialCredit)
                .setName("CurrentAccount-"+customer.getName())
                .setBalance(initialCredit)
                .setCustomer(customer);
        if(initialCredit>0){
            Transaction transaction = new Transaction().setAmount(initialCredit).setAccount(account);
            Set<Transaction> transactionSet = new HashSet<>();
            transactionSet.add(transaction);
            account.setTransactionSet(transactionSet);
            transactionRepository.save(transaction);
        }
        accountRepository.save(account);
        AccountDTO accountDTO = accountMapper.toAccountDTO(account);
        return accountDTO;
    }
}
