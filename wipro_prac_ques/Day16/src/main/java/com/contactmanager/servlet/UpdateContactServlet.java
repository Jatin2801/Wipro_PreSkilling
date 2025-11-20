package com.contactmanager.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.contactmanager.dao.ContactDao;
import com.contactmanager.model.Contact;

public class UpdateContactServlet extends HttpServlet {

    private final ContactDao dao = new ContactDao();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idx = request.getParameter("id");
        int id = -1;
        try { id = Integer.parseInt(idx); } catch (Exception e) { /* ignore */ }

        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        HttpSession session = request.getSession();

        if (name != null && phone != null && email != null &&
                !name.isEmpty() && !phone.isEmpty() && !email.isEmpty()) {

            Contact contact = new Contact(name, phone, email);
            boolean ok = dao.updateContact(id, contact);
            if (ok) {
                session.setAttribute("message", "Contact updated successfully.");
            } else {
                session.setAttribute("error", "Failed to update contact. Invalid id.");
            }
        } else {
            session.setAttribute("error", "All fields are required. Contact was not updated.");
        }

        response.sendRedirect(request.getContextPath() + "/viewContacts");
    }
}
