package com.hyniva.poc.controller;

import com.hyniva.poc.customer.controller.CustomerController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CustomerControllerTest {
    @InjectMocks
    CustomerController customerController;
    String msg = "Customer Controller class";

    @Test
    @DisplayName("getConfig invoked")
    public void getConfig() {
        assertEquals(customerController.getConfig(), msg);
    }
}
