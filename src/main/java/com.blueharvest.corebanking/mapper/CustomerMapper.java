package com.blueharvest.corebanking.mapper;

import com.blueharvest.corebanking.dto.CustomerDTO;
import com.blueharvest.corebanking.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerMapper {

    public CustomerDTO toCustomerDTO(Customer customer){

        CustomerDTO customerDTO = new CustomerDTO().setId(customer.getId())
                .setName(customer.getName())
                .setSurname(customer.getSurname());
        return customerDTO;
    }
}
