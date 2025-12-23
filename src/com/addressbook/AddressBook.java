package com.addressbook;

import java.util.List;

public interface AddressBook {

    void addContact(ContactPerson contact);

    List<ContactPerson> getAllContacts();
}
