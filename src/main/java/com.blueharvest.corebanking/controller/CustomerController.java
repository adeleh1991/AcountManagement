package com.blueharvest.corebanking.controller;

import com.blueharvest.corebanking.dto.CustomerInformationDTO;
import com.blueharvest.corebanking.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/getInfo/{customerId}")
    public CustomerInformationDTO getCustomerInfo(@PathVariable Long customerId){
        return customerService.getCustomerInfo(customerId);
    }
}
