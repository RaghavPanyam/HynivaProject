package com.hyniva.poc.customer.controller;

import com.hyniva.poc.customer.dto.CustomerResponseDTO;
import com.hyniva.poc.customer.model.Customer;
import com.hyniva.poc.customer.service.ICustomerService;
import com.hyniva.poc.customer.dto.CustomerRequestDTO;
import com.hyniva.poc.customer.repository.ICustomerDataProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
public class CustomerController {
    @Autowired
    ICustomerDataProvider iCustomerDataProvider;
    @Autowired
    ICustomerService customerService;

    @GetMapping("/config")
    public String getConfig() {
        return "Customer Controller class";
    }

    @PostMapping("/searchall")
    public ResponseEntity<Flux<CustomerResponseDTO>> customerSearch() {
        Flux<CustomerResponseDTO> customerInfo = iCustomerDataProvider.customerSearch();
        System.out.println(customerInfo.blockFirst());
        return ResponseEntity.ok(customerInfo);
    }

    @PostMapping("/searchcustomer")
    public Flux<CustomerResponseDTO> searchCustomer(@RequestBody CustomerRequestDTO customerRequestDTO) {
        System.out.println(customerRequestDTO);
        return customerService.searchCustomer(customerRequestDTO);
    }

    @PostMapping("/add")
    public Mono<Customer> customerAdd(@RequestBody Customer customer) {
        return iCustomerDataProvider.save(customer);
    }
}
