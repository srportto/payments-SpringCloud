package com.devsuperior.hroauth.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Data                                               //add toString, equalsAndHascode, getters , setters via lombok
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {

    public static final long serialVerionUID = 1L;

    @EqualsAndHashCode.Include  //informacao ao lombok que esse atributo deve ser considerado pra gerar equals and hashcode

    private Long id;
    private String name;


    private String email;
    private String password;


    private Set<Role> roles = new HashSet<>();

    public User() {
        super();
    }
}
