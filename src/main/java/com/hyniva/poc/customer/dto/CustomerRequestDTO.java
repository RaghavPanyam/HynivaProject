package com.hyniva.poc.customer.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CustomerRequestDTO {
    private Long customerId;
    private String firstName;
    private String lastName;
}
