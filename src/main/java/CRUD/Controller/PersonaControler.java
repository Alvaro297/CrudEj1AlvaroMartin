package CRUD.Controller;

import CRUD.Controller.Person.Persona;
import CRUD.Controller.dto.PersonaInputDTO;
import CRUD.Controller.dto.PersonaOutputDTO;
import CRUD.Controller.servicios.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaControler {

    @Autowired
    PersonaService personaService;

    @Autowired
    PersonaRepository personaRepository;

    @PostMapping("/addPersona")
    public String addPersona(@RequestBody PersonaInputDTO persona) throws Exception{
        personaService.addPersona(persona);
        return "Persona creada correctamente";
    }

    @GetMapping("/getPerson/{id}")
    public Persona getPersonById(@PathVariable Integer id) throws Exception {
        return personaRepository.findById(id).orElseThrow(()->new Exception("No encontrado"));
    }

    @GetMapping("/getPersona")
    public List<Persona> getPersona(){
        return personaRepository.findAll();
    }

    @GetMapping("/getPerson/name/{name}")
    public List<PersonaOutputDTO> deletePersonaByName(@PathVariable String name) {
        return personaRepository.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePersonaById(@PathVariable Integer id) throws Exception {
        personaService.deletedById(id);
        return "El id "+id+" ha sido borrado";

    }



}
