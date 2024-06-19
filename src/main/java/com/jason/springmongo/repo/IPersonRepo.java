package com.jason.springmongo.repo;

import com.jason.springmongo.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepo extends MongoRepository<Person,String> {
}
