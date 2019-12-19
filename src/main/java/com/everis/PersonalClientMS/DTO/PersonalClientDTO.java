package com.everis.PersonalClientMS.DTO;

// import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class PersonalClientDTO {

    private String dni;
    
    private String name;
    
    public PersonalClientDTO(String dni, String name)
    {
        this.dni = dni;
        this.name = name;
    }

}