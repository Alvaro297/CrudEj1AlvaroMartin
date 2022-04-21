package CRUD.Controller.servicios;

import CRUD.Controller.dto.PersonaInputDTO;
import CRUD.Controller.dto.PersonaOutputDTO;

import java.util.List;

public interface PersonaI {
    PersonaOutputDTO addPersona(PersonaInputDTO personaDTO) throws Exception;

    List<PersonaOutputDTO> findByName(String name) throws Exception;


    PersonaOutputDTO findById(Integer id) throws Exception;
    String deletedById(Integer id) throws Exception;
}
