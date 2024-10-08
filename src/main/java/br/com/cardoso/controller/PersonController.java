package br.com.cardoso.controller;

import br.com.cardoso.model.Person;
import br.com.cardoso.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

        // highlight-next-line
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // highlight-start
    @GetMapping("/person")
    public ResponseEntity<Person> test() {
        System.out.println("Teste final com atualização de submódulos");
        return ResponseEntity.ok(personService.getPerson());
    }
    // highlight-end
}
