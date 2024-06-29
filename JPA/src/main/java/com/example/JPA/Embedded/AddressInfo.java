package com.example.JPA.Embedded;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class AddressInfo {
    private String street;
    private String city;
    private String zipCode;
}
