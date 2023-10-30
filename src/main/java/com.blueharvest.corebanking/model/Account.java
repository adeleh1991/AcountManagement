package com.blueharvest.corebanking.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Set;

@Data
@RequiredArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;

    private String name;

    private Double initialCredit;

    private Double balance;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
    private Customer customer;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "account", orphanRemoval = true)
    private Set<Transaction> transactionSet;

}
