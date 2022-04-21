package CRUD.Controller;

import CRUD.Controller.Person.Persona;
import CRUD.Controller.dto.PersonaInputDTO;
import CRUD.Controller.dto.PersonaOutputDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona,Integer>{

    List<PersonaOutputDTO> findByName(String name);
}
