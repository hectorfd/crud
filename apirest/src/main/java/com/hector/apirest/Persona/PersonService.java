package com.hector.apirest.Persona;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    //inyectar el objeti que se encargara de hacer el crud
    private final PersonRepository personRepo;
    public void createPersona(Person person){
        personRepo.save(person);
    }
    
}
