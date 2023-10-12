package com.hyniva.poc.customer.service;

import com.hyniva.poc.customer.dto.CustomerRequestDTO;
import com.hyniva.poc.customer.dto.CustomerResponseDTO;
import com.hyniva.poc.customer.repository.ICustomerDataProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    ICustomerDataProvider iCustomerDataProvider;

    @Override
    public Flux<CustomerResponseDTO> searchCustomer(CustomerRequestDTO customerRequestDTO) {
        return iCustomerDataProvider.searchCustomerByCustomerIdandFirstNameandLastName(customerRequestDTO.getCustomerId(), customerRequestDTO.getFirstName(), customerRequestDTO.getLastName());
    }
}
