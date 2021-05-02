package de.renemeier.udemy.timbuchalka.exercises.exercise44.mobilephone;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone("+5519984308466");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Choose your action: (6 to show available actions)");
            String option = scanner.nextLine();
            switch (option) {
                case "0" -> {
                    System.out.println("Shutting down...");
                    quit = true;
                }
                case "1" -> mobilePhone.printContacts();
                case "2" -> addNewContact();
                case "3" -> updateContact();
                case "4" -> removeContact();
                case "5" -> queryContact();
                case "6" -> printActions();
                default -> System.out.println("Invalid command. Please try again.");
            }
        }
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("Available actons:\nPress\n" +
                "0 - to shutdown\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - to query an existing contact\n" +
                "6 - to print a list of available actions.");
    }

    private static void addNewContact() {
        System.out.println("Add a new contact");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added:\nname: " + name + " , phone: " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.print("Update contact\nEnter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Add a new contact");
            System.out.print("Name: ");
            String newName = scanner.nextLine();
            System.out.print("Phone number: ");
            String phoneNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newName, phoneNumber);

            if (mobilePhone.updateContact(existingContactRecord, newContact)) {
                System.out.println("Successfully updated record");
            } else {
                System.out.println("Error updating record");
            }
        }
    }

    private static void removeContact() {
        System.out.print("Remove contact\nEnter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.print("Query a contact\nEnter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
        }
        assert existingContactRecord != null;
        System.out.println("Name: " + existingContactRecord.getName() + " Phone number: " + existingContactRecord.getPhoneNumber());
    }
}
