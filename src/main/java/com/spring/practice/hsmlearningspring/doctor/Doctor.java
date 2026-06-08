package com.spring.practice.hsmlearningspring.doctor;

import com.spring.practice.hsmlearningspring.pharmacy.Pharmacy;
import lombok.*;


@Data
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {

    private int doctorId;
    private String doctorName;
    private String doctorAddress;
    private String doctorPhone;
    private String specialty;
    private Pharmacy phamarcy;

    void presribe(String pricrition){
        System.out.println("Presribing: " + pricrition);
    }

}
