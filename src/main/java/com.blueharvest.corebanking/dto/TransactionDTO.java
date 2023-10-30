package com.blueharvest.corebanking.dto;

import com.blueharvest.corebanking.model.Account;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@RequiredArgsConstructor
@Accessors(chain = true)
public class TransactionDTO {
    private Long id;
    private Double amount;
}
