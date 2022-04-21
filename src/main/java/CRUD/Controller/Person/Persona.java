package CRUD.Controller.Person;


import CRUD.Controller.dto.PersonaInputDTO;
import CRUD.Controller.dto.PersonaOutputDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue
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

    public Persona(PersonaInputDTO personaInputDTO){
        if (personaInputDTO==null){
            return;
        }
        setPersonId(personaInputDTO.getPersonId());
        setActive(personaInputDTO.getActive());
        setCity(personaInputDTO.getCity());
        setCompanyEmail(personaInputDTO.getCompanyEmail());
        setImagenUrl(personaInputDTO.getImagenUrl());
        setName(personaInputDTO.getName());
        setSurname(personaInputDTO.getSurname());
        setPassword(personaInputDTO.getPassword());
        setPersonalEmail(personaInputDTO.getPersonalEmail());
        setUser(personaInputDTO.getUser());
        setTerminationDate(personaInputDTO.getTerminationDate());
    }
}