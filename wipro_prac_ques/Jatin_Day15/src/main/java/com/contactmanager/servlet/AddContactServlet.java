package com.contactmanager.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contactmanager.dao.ContactDao;
import com.contactmanager.model.Contact;

public class AddContactServlet extends HttpServlet {

    private final ContactDao dao = new ContactDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");

        if (name != null && phone != null && email != null &&
                !name.isEmpty() && !phone.isEmpty() && !email.isEmpty()) {

            Contact contact = new Contact(name, phone, email);
            dao.addContact(contact);
        }

        // Redirect to the servlet that shows all contacts
        response.sendRedirect(request.getContextPath() + "/viewContacts");
    }
}
