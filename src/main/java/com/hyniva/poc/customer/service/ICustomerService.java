package com.hyniva.poc.customer.service;

import com.hyniva.poc.customer.dto.CustomerResponseDTO;
import com.hyniva.poc.customer.dto.CustomerRequestDTO;
import reactor.core.publisher.Flux;

public interface ICustomerService {
    Flux<CustomerResponseDTO> searchCustomer(CustomerRequestDTO customerRequestDTO);
}
