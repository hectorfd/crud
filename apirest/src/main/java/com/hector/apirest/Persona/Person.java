package com.hector.apirest.Persona;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data//para los getters y setter
@AllArgsConstructor
@NoArgsConstructor
@Entity//la priumera fase de la api es la entidad
public class Person {
    //para mapear
    @Id
    @GeneratedValue
    private Integer id;
    @Basic
    private String firsName;
    private String lastName;
    private String email;
}
