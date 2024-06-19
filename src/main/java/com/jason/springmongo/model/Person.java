package com.jason.springmongo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document
public class Person {

    @Id
    private String id;
    private String name;
    private String city;
    private String state;
    private String zipCode;

    @Indexed(unique = true)
    private String email;
}
