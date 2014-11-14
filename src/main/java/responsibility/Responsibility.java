package responsibility;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
public class Responsibility extends process.Process {
    private Set<String> contacts;

    public Set<String> getContacts() {
        return contacts;
    }

    public void setContacts(Set<String> contacts) {
        this.contacts = contacts;
    }
}
