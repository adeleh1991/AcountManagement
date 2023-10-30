package com.blueharvest.corebanking.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@RequiredArgsConstructor
@Accessors(chain = true)
public class AccountDTO {

    private Long accountNumber;
    private String name;
    private Double initialCredit;
    private Double balance;
    private Set<TransactionDTO> transactionsSet;
}
