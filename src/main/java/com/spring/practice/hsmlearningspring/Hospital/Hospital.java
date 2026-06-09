package com.spring.practice.hsmlearningspring.Hospital;

import com.spring.practice.hsmlearningspring.doctor.Doctor;
import com.spring.practice.hsmlearningspring.patient.Address;
import com.spring.practice.hsmlearningspring.patient.Patient;
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
public class Hospital {
    //Name of Hospial
    private String hospitalName;

    private Address hospitalAddress;
    @Autowired
    @Qualifier("doctor")

    private Doctor doctor;
    private Patient patient;

   public void displayHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Address: " + hospitalAddress);
        System.out.println("Doctor: " + doctor);


    }

}
