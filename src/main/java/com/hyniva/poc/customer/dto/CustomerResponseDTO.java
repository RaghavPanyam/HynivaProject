package com.hyniva.poc.customer.dto;

import lombok.Data;

@Data
public class CustomerResponseDTO {
    private Long customerId;
    private String cifKey;
    private String firstName;
    private String lastName;
    private String shortName;
    private String taxId;
}
