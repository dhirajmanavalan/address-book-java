package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookImpl implements AddressBook {

    private List<ContactPerson> contacts;

    public AddressBookImpl() {
        this.contacts = new ArrayList<>();
    }

    @Override
    public void addContact(ContactPerson contact) {
        contacts.add(contact);
    }

    @Override
    public List<ContactPerson> getAllContacts() {
        return contacts;
    }

    @Override
    public boolean editContactByName(String firstName, String lastName, ContactPerson updatedContact) {
        for (int i = 0; i < contacts.size(); i++) {
            ContactPerson current = contacts.get(i);
            if (current.getFirstName().equalsIgnoreCase(firstName) && current.getLastName().equalsIgnoreCase(lastName)) {
                contacts.set(i, updatedContact);
                return true;
            }
        }
        return false; // not found
    }
}
