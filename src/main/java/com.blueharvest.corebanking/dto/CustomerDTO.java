package com.blueharvest.corebanking.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@Data
@RequiredArgsConstructor
@Accessors(chain = true)
public class CustomerDTO {

    private Long id;
    private String name;
    private String surname;
}
