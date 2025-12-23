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
}
