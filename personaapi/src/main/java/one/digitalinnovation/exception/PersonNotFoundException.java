package one.digitalinnovation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class PersonNotFoundException extends Exception {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public PersonNotFoundException(Long id) {
        super("Person not found with ID" + id);
    }
}
