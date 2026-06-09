package com.spring.practice.hsmlearningspring.pharmacy;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;



@Data
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Component
public class Pharmacy {

/*
    PharmacyBean
- medicines: List<String>
- stock: Map<String,Int>
- departments: Set<String>
+ getMedicine(): String
+ isAvailable(): boolean

*/

    private List<String> pharmacies;

    private Map<String, Integer> stock;
    private Set<String> department;


    public String getMedicine(String medicinePriscription) {
        StringBuilder medicines = new StringBuilder();

        String[] prescribedMedicines=medicinePriscription.split("\\R");

        for (String prescribedMedicine : prescribedMedicines) {
            prescribedMedicine=prescribedMedicine.trim().trim().toLowerCase();
            if(isAvailable(medicinePriscription)){
                medicines.append(prescribedMedicine).append(" : Dispensed\n");
                stock.put(prescribedMedicine,stock.get(medicinePriscription)-1);

            }else {
                medicines.append(prescribedMedicine).append(" : Not Available\n");
            }
        }


        return medicines.toString();

    }

    public boolean isAvailable(String prescription){
        String[] medicines =
                prescription.split("\\R");

        for (String medicine : medicines) {
            medicine = medicine.trim().toLowerCase();

            if(stock.containsKey(medicine) && stock.get(medicine) > 0){
                return true;
            }

        }


        return false;
    }

}
