package com.hector.apirest.Persona;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonControler {
    //publica los endpoints para el acceso de datos o funcionalidades
    //inyectamos el servicio
    private final PersonService personService;
    @PostMapping
    public void createPersona(@RequestBody Person person)
    {
        personService.createPersona(person);
    }
    
}
