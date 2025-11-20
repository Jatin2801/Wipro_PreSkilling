package com.contactmanager.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contactmanager.dao.ContactDao;
import com.contactmanager.model.Contact;

public class EditContactServlet extends HttpServlet {

    private final ContactDao dao = new ContactDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idx = request.getParameter("id");
        int id = -1;
        try { id = Integer.parseInt(idx); } catch (Exception e) { /* ignore */ }

        Contact c = dao.getContact(id);
        if (c != null) {
            request.setAttribute("contact", c);
            request.setAttribute("id", id);
            RequestDispatcher rd = request.getRequestDispatcher("/editContact.jsp");
            rd.forward(request, response);
        } else {
            response.sendRedirect(request.getContextPath() + "/viewContacts?error=Contact+not+found");
        }
    }
}
