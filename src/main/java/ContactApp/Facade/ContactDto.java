package ContactApp.Facade;

import ContactApp.Contact;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContactDto {
    @JsonProperty("name")
    private String name;
    @JsonProperty("number")
    private String number;
    @JsonProperty("email")
    private String email;

    public ContactDto(Contact contact) {
        this.name = contact.name();
        this.number = contact.number();
        this.email = contact.email();
    }

    public ContactDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
