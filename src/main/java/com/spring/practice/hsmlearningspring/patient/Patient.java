package com.spring.practice.hsmlearningspring.patient;

import lombok.*;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    private int patientId;

    private String patientName;

    private String patientGender;
    private int age;
    private Address address;


}
