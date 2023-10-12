package com.hyniva.poc.customer.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "customer_info")
public class Customer {
    @Id
    @Column("customer_id")
    private Long customerId;
    @Column( "cif_key")
    private String cifKey;
    @Column("first_name")
    private String firstName;
    @Column("last_name")
    private String lastName;
    @Column("short_name")
    private String shortName;
    @Column("tax_id")
    private String taxId;
}
