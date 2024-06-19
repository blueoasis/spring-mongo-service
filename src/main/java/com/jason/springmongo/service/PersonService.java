package com.jason.springmongo.service;

import com.jason.springmongo.model.Person;
import com.jason.springmongo.repo.IPersonRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PersonService implements IPersonService {

    @Autowired
    IPersonRepo personRepo;

    public Person save(Person person) {
        log.info("Attempting to save Person: {}",person);
        return personRepo.save(person);
    }
}
