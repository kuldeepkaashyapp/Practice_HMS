package com.spring.practice.hsmlearningspring.patient;

import com.spring.practice.hsmlearningspring.doctor.Doctor;
import com.spring.practice.hsmlearningspring.pharmacy.Pharmacy;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Patient {
    private int patientId;

    private String patientName;

    private String patientGender;
    private int age;

    private Address address;

    private Doctor doctor;


    private Pharmacy pharmacy;





}
