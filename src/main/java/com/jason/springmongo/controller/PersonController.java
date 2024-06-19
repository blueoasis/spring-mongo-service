package com.jason.springmongo.controller;

import com.jason.springmongo.model.Person;
import com.jason.springmongo.service.IPersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.jason.springmongo.constants.Constants.PERSON_DATA_ERROR;

@RestController
@Slf4j
@RequestMapping("/person")
public class PersonController {

    @Autowired
    IPersonService personService;

    @PostMapping("/save")
    public ResponseEntity<?> savePerson(@RequestBody Person person) {
        try {
            Person savedPerson = personService.save(person);
            return ResponseEntity.status(HttpStatus.OK).body(savedPerson);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.OK).body(PERSON_DATA_ERROR);
        }
    }
}
