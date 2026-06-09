package com.spring.practice.hsmlearningspring.patient;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Address {
    private String street;
    private String city;
    private String state;
    private String pincode;

    public String getFullAddress() {
        return street + ", " + city + ", " + state + ", " + pincode;
    }

}
