package com.devsuperior.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@Data                                               //add toString, equalsAndHascode, getters , setters via lombok
@AllArgsConstructor
public class Payment implements Serializable {

    public static final long serialVerionUID = 1L;


    private String name;
    private Double dailyIncome;        //quanto que o cara ganha por dia
    private Integer days;

    public double getTotal(){
        return days * dailyIncome;
    }

}
