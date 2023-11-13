package ContactApp;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ContactDao {
    private long id = 1L;
    private final Map<Long, Contact> contactMap = new HashMap<>();

    public void addContact(Contact contact) {
        contactMap.put(id, contact);
        id++;
    }

    public void removeContact(long id) {
        contactMap.remove(id);
    }

    public Contact getContact(long id) {
        return contactMap.get(id);
    }

    public List<Contact> getAllContacts() {
        return new ArrayList<>(contactMap.values());
    }
}
