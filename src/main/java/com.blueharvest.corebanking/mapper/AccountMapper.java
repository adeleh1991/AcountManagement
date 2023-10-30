package com.blueharvest.corebanking.mapper;

import com.blueharvest.corebanking.dto.AccountDTO;
import com.blueharvest.corebanking.dto.TransactionDTO;
import com.blueharvest.corebanking.model.Account;
import com.blueharvest.corebanking.model.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
public class AccountMapper {

    private final CustomerMapper customerMapper;

    private final TransactionMapper transactionMapper;

    public AccountDTO toAccountDTO(Account account){
        AccountDTO accountDTO = new AccountDTO();
        accountDTO.setAccountNumber(account.getAccountNumber())
                .setName(account.getName())
                .setBalance(account.getBalance())
                .setInitialCredit(account.getInitialCredit());
        Set<TransactionDTO> transactionDTOSet = new HashSet<>();
        for (Transaction transaction: account.getTransactionSet()){
            transactionDTOSet.add(transactionMapper.toTransactionDTO(transaction));
        }
        accountDTO.setTransactionsSet(transactionDTOSet);
              //  .setCustomer(customerMapper.toCustomerDTO(account.getCustomer()));
        return accountDTO;
    }
}
