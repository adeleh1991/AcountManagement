package com.blueharvest.corebanking;

import com.blueharvest.corebanking.dto.AccountDTO;
import com.blueharvest.corebanking.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class CoreBankingApplication {

    public static void main(String[] args) {

      //  AccountDTO accountDTO = accountService.createAccount(1L, 0d);
     //   System.out.println(accountDTO.toString());
        SpringApplication.run(CoreBankingApplication.class,args);

    }

}
