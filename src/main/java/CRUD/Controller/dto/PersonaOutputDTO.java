package CRUD.Controller.dto;

import CRUD.Controller.Person.Persona;
import lombok.*;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaOutputDTO {
    private Integer personId;

    private String user;
    private String password;
    private String name;
    private String surname;
    private String companyEmail;
    private String personalEmail;
    private String city;
    private Boolean active;
    private Date createDate;
    private String imagenUrl;
    private Date terminationDate;

    public PersonaOutputDTO(Persona persona){
        setPersonId(persona.getPersonId());
        setActive(persona.getActive());
        setCity(persona.getCity());
        setCompanyEmail(persona.getCompanyEmail());
        setImagenUrl(persona.getImagenUrl());
        setName(persona.getName());
        setSurname(persona.getSurname());
        setPassword(persona.getPassword());
        setPersonalEmail(persona.getPersonalEmail());
        setUser(persona.getUser());
        setTerminationDate(persona.getTerminationDate());

    }

}