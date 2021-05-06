package com.devsuperior.hroauth.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Role implements Serializable {
    public static final long serialVerionUID = 1L;

    @EqualsAndHashCode.Include  //informacao ao lombok que esse atributo deve ser considerado pra gerar equals and hashcode
    private Long id;
    private String roleName;

    public Role() {
        super();
    }
}
