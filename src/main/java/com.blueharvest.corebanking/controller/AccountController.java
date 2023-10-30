package com.blueharvest.corebanking.controller;

import com.blueharvest.corebanking.dto.AccountDTO;
import com.blueharvest.corebanking.model.Customer;
import com.blueharvest.corebanking.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/account")
public class AccountController {

    private final AccountService accountService;

    @PostMapping( "/create/{customerId}/{initialCredit}")
    public AccountDTO createAccount(@RequestBody Customer customer, @PathVariable Double initialCredit){
        return accountService.createAccount(customer,initialCredit);
    }
}
