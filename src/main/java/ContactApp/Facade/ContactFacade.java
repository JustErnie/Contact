package ContactApp.Facade;

import ContactApp.Contact;
import ContactApp.ContactDao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactFacade {

    ContactDao contactDao;

    public ContactFacade(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public ContactDto addContact(Contact contact) {
        contactDao.addContact(contact);
        return new ContactDto(contact);
    }

    public ContactDto getContact(long id) {
        return new ContactDto(contactDao.getContact(id));
    }

    public List<ContactDto> getAllContacts() {
        List<Contact> allContacts = contactDao.getAllContacts();
        List<ContactDto> allContactsDto = new ArrayList<>();
        for (Contact contact : allContacts) {
            allContactsDto.add(new ContactDto(contact));
        }
        return allContactsDto;
    }
}
