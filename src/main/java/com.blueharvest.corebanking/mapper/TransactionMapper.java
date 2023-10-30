package com.blueharvest.corebanking.mapper;

import com.blueharvest.corebanking.dto.TransactionDTO;
import com.blueharvest.corebanking.model.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransactionMapper {

    public TransactionDTO toTransactionDTO(Transaction transaction){

        TransactionDTO transactionDTO = new TransactionDTO();
        transactionDTO.setId(transactionDTO.getId()).setAmount(transactionDTO.getAmount());
        return  transactionDTO;

    }
}
