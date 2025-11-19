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
}
