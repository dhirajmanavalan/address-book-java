package com.addressbook;

import java.util.List;

public interface AddressBook {

    void addContact(ContactPerson contact);

    List<ContactPerson> getAllContacts();

    boolean editContactByName(String firstName, String lastName, ContactPerson updatedContact);

    boolean deleteContactByName(String firstName, String lastName);
}
