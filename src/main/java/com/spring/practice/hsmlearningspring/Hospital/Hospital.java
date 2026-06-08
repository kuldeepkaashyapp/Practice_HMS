package com.spring.practice.hsmlearningspring.Hospital;

import com.spring.practice.hsmlearningspring.doctor.Doctor;
import com.spring.practice.hsmlearningspring.patient.Patient;
import lombok.*;


@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hospital {
    //Name of Hospial
    private String hospitalName;
    private String hospitalAddress;
    private Doctor doctor;
    private Patient patient;

    void displayHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Address: " + hospitalAddress);
        System.out.println("Doctor: " + doctor);


    }

}
