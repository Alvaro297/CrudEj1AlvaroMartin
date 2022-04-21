package CRUD.Controller.servicios;

import CRUD.Controller.Person.Persona;
import CRUD.Controller.PersonaRepository;
import CRUD.Controller.dto.PersonaInputDTO;
import CRUD.Controller.dto.PersonaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements PersonaI{


    @Autowired
    private PersonaRepository personaRepository;


    @Override
    public PersonaOutputDTO addPersona(PersonaInputDTO personaDTO) throws Exception{
        if(personaDTO.getUser().length()< 0 || personaDTO.getUser().length()>10){
            throw new Exception("El usuario debe tener entre 0 y 10 caracteres");
        } else {
            Persona person = new Persona(personaDTO);
            personaRepository.save(person);
            PersonaOutputDTO saveOutputDTO = new PersonaOutputDTO(person);
            return saveOutputDTO;

        }
    }
    @Override
    public List<PersonaOutputDTO> findByName(String name) throws Exception{
        try{
            List<PersonaOutputDTO> peopleByName = personaRepository.findByName(name);
            return peopleByName;
        } catch(Exception e){
            throw new Exception("No se ha podido encontrar el usuario");
        }
    }

    @Override
    public PersonaOutputDTO findById(Integer id) throws Exception{

        Persona peopleById = personaRepository.findById(id).orElseThrow(()-> new Exception("No se ha encontrado"));
        return new PersonaOutputDTO(peopleById);

    }
    @Override
    public String deletedById(Integer id) throws Exception{
        personaRepository.findById(id).orElseThrow(() -> new Exception("NO se ha encontrado a la persona cuyo id es: "+id));
        personaRepository.deleteById(id);
        return "La persona cuyo es id es "+id+" ha sido borrada";
    }

}
