package com.example.pserver.persistence;

import com.example.pserver.entity.BuildingEntity;
import com.example.pserver.entity.PersonEntity;
import com.example.pserver.repository.BuildingRepository;
import com.example.pserver.repository.PersonRepository;

public class ManagerPersistence {

    private PersonRepository personRepository;
    private BuildingRepository buildingRepository;

    public ManagerPersistence(PersonRepository personRepository, BuildingRepository buildingRepository) {
        this.personRepository = personRepository;
        this.buildingRepository = buildingRepository;
    }

    public void save(PersonEntity personEntity) {
        try {
            System.out.println(personEntity);
            personRepository.save(personEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(BuildingEntity buildingEntity) {
        try {
            System.out.println(buildingEntity);
            buildingRepository.save(buildingEntity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
