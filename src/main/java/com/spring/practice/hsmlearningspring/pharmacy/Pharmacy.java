package com.spring.practice.hsmlearningspring.pharmacy;

import java.util.List;
import java.util.Map;
import java.util.Set;

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


    public String getMedicine(){
        String medicine = "";
        for(Map.Entry<String, Integer> entry : stock.entrySet()){
            medicine += entry.getKey() + ": " + entry.getValue() + "\n";
        }
        return medicine;
    }

    public boolean isAvailable(String medicine){
        if(stock.containsKey(medicine) && stock.get(medicine) >= 0){
            return true;
        }
        return false;
    }

}
