package com.blueharvest.corebanking.service;

import com.blueharvest.corebanking.dto.AccountDTO;
import com.blueharvest.corebanking.dto.CustomerDTO;
import com.blueharvest.corebanking.dto.CustomerInformationDTO;
import com.blueharvest.corebanking.mapper.AccountMapper;
import com.blueharvest.corebanking.model.Account;
import com.blueharvest.corebanking.model.Customer;
import com.blueharvest.corebanking.repository.AccountRepository;
import com.blueharvest.corebanking.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    private final AccountRepository accountRepository;

    private final AccountMapper accountMapper;

    public CustomerInformationDTO getCustomerInfo(Long customerId){

        CustomerInformationDTO customerInformationDTO = new CustomerInformationDTO();
        Customer customer = customerRepository.getReferenceById(customerId);
        customerInformationDTO.setName(customer.getName());
        customerInformationDTO.setSurname(customer.getSurname());
        List<Account> accountsList = accountRepository.findByCustomer(customer);
        List<AccountDTO> accountDTOList = new ArrayList<>();
        for (Account account:accountsList) {
            AccountDTO accountDTO = accountMapper.toAccountDTO(account);
            accountDTOList.add(accountDTO);
        }
        customerInformationDTO.setAccounts(accountDTOList);
        return customerInformationDTO;
    }

    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }
}
