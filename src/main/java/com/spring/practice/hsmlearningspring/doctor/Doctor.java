package com.spring.practice.hsmlearningspring.doctor;

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
public class Doctor {

    private int doctorId;
    private String doctorName;
    private String doctorAddress;
    private String doctorPhone;
    private String specialty;

    private Pharmacy pharmacy;

    private String Pricescription;

   public void writePrescribe(String pricsition){
       StringBuilder prescription =new StringBuilder();
       prescription.append(pricsition);
       prescription.append("\n");
       prescription.append("doctorId"+doctorId);

      setPricescription(prescription.toString());

    }





}
