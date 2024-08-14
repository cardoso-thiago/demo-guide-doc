package br.com.cardoso.service.impl;

import br.com.cardoso.model.Person;
import br.com.cardoso.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Person getPerson() {
        return new Person("Stephen King", 76);
    }
}
