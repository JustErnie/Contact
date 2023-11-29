package ContactApp;

import ContactApp.Facade.ContactDto;
import ContactApp.Facade.ContactFacade;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/contacts")
public class Controller {
    ContactFacade contactFacade;

    public Controller(ContactFacade contactFacade) {
        this.contactFacade = contactFacade;
    }

    @GetMapping
    public Collection<ContactDto> getAllContacts() {
        return contactFacade.getAllContacts();
    }

    @GetMapping("/{id}")
    public ContactDto getContact(@PathVariable long id) {
        return contactFacade.getContact(id);
    }

    @PostMapping
    public ContactDto addContact(@RequestBody ContactDto contactDto) {
        return contactFacade.addContact(new Contact(contactDto.getName(), contactDto.getNumber(), contactDto.getEmail()));
    }
}

