package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddressBook addressBook = new AddressBookImpl();

        System.out.println("Create a Contact in Address Book: ");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        ContactPerson contact = new ContactPerson(
                firstName, lastName, address, city, state, zip, phoneNumber, email
        );

        addressBook.addContact(contact);

        System.out.println("\nContact created successfully:");
        for (ContactPerson c : addressBook.getAllContacts()) {
            System.out.println(c);
        }

    }
}
