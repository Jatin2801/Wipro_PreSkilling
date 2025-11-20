package com.contactmanager.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.contactmanager.model.Contact;

public class ContactDao {

    // In-memory list to store contacts
    private static final List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public List<Contact> getAllContacts() {
        return Collections.unmodifiableList(contacts);
    }

    public Contact getContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            return contacts.get(index);
        }
        return null;
    }

    public boolean updateContact(int index, Contact contact) {
        if (index >= 0 && index < contacts.size()) {
            contacts.set(index, contact);
            return true;
        }
        return false;
    }

    public boolean deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            return true;
        }
        return false;
    }
}
