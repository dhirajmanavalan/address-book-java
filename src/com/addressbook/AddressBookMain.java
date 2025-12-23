package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBookImpl();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Address Book Menu ===");
            System.out.println("1. Create contact");
            System.out.println("3. Edit contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-4): ");

            String choice = scanner.nextLine();

            if ("1".equals(choice)) {
                // CREATE
                ContactPerson contact = readContactFromConsole(scanner);
                addressBook.addContact(contact);
                System.out.println("Contact created.");
            } else if ("3".equals(choice)) {
                // EDIT
                System.out.print("Enter FIRST NAME of contact to edit: ");
                String searchFirstName = scanner.nextLine();
                System.out.print("Enter LAST NAME of contact to edit: ");
                String searchLastName = scanner.nextLine();

                System.out.println("Enter NEW details:");
                ContactPerson updated = readContactFromConsole(scanner);

                boolean updatedOk = addressBook.editContactByName(
                        searchFirstName, searchLastName, updated
                );
                if (updatedOk) {
                    System.out.println("Contact updated.");
                } else {
                    System.out.println("Contact not found.");
                }
            }
            else if ("4".equals(choice)) {
                // === UC-4 delete by name ===
                System.out.print("Enter FIRST NAME of contact to delete: ");
                String searchFirstName = scanner.nextLine();
                System.out.print("Enter LAST NAME of contact to delete: ");
                String searchLastName = scanner.nextLine();

                boolean deleted = addressBook.deleteContactByName(
                        searchFirstName, searchLastName
                );
                System.out.println(deleted ? "Contact deleted." : "Contact not found.");
            }
            else if ("5".equals(choice)) {
                running = false;        // EXIT
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static ContactPerson readContactFromConsole(Scanner scanner) {
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("Zip: ");
        String zip = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        return new ContactPerson(
                firstName, lastName, address, city, state, zip, phoneNumber, email
        );
    }
}
