package com.hyniva.poc.customer.repository;

import com.hyniva.poc.customer.dto.CustomerResponseDTO;
import com.hyniva.poc.customer.model.Customer;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Flux;

public interface ICustomerDataProvider extends R2dbcRepository<Customer,Long> {
    @Query(value = "Select * from customer_info")
    Flux<CustomerResponseDTO> customerSearch();
    @Query(value = "Select * from customer_info where customer_id=:customerId and first_name=:firstName and last_name=:lastName")
    Flux<CustomerResponseDTO> searchCustomerByCustomerIdandFirstNameandLastName(@PathVariable("customerId") Long customerId,@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName);
}
