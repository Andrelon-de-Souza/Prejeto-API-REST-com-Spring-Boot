package one.digitalinnovation.Controller;

import lombok.AllArgsConstructor;
import one.digitalinnovation.dto.request.PersonDTO;
import one.digitalinnovation.dto.response.MessageResponseDTO;
import one.digitalinnovation.exception.PersonNotFoundException;
import one.digitalinnovation.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
     }

     @PostMapping
     @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO){
        return personService.createPerson(personDTO);
     }

     public List<PersonDTO> listAll(){
        return  personService.listAll();
     }

     @GetMapping("/{id}")
     public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
     }

     @PutMapping("/{id}")
     public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody PersonDTO personDTO) throws PersonNotFoundException {
        return personService.updateById(id, personDTO);
     }

     @DeleteMapping("/{id}")
     @ResponseStatus(HttpStatus.NO_CONTENT)
     public  void deleteById(long id) throws PersonNotFoundException {
        personService.delete(id);
     }

}
