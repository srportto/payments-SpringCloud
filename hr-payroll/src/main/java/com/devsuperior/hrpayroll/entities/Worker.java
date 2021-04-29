package com.devsuperior.hrpayroll.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data                                               //add toString, equalsAndHascode, getters , setters via lombok
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Worker implements Serializable {

    public static final long serialVerionUID = 1L;

    @EqualsAndHashCode.Include  //informacao ao lombok que esse atributo deve ser considerado pra gerar equals and hashcode
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  Double dailyIncome;        //quanto que o cara ganha por dia
}
