package com.example.pserver.persistence;

import com.example.pserver.entity.PersonEntity;
import com.example.pserver.repository.PersonRepository;

public class ManagerPersistence {

    private PersonRepository personRepository;

    public ManagerPersistence(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void save(PersonEntity personEntity) {
        try {
            System.out.println(personEntity);
            personRepository.save(personEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
