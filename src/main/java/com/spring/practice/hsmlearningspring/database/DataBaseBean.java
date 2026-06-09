package com.spring.practice.hsmlearningspring.database;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor

public class DataBaseBean {
    private String url;
    private String driver;

    public void  init(){
        System.out.println("-".repeat(5));
        System.out.println("DataBase Initialized");
        System.out.println("-".repeat(5));


    }

    public void  destroy(){
        System.out.println("DataBase connection closed");
    }
}
