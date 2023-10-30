package com.blueharvest.corebanking.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "TRANSACTION")
@SequenceGenerator(name = "TRNS_ID_SEQ_GEN", sequenceName = "TransactionIdSequenceGenerator", allocationSize = 1)
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRNS_ID_SEQ_GEN")
    private Long id;

    private Double amount;

    @ManyToOne(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private Account account;
}

