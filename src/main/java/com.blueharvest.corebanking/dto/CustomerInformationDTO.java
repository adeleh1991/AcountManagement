package com.blueharvest.corebanking.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@RequiredArgsConstructor
@Accessors(chain = true)
public class CustomerInformationDTO {

    private String name;
    private String surname;
    private List<AccountDTO> accounts;
}
