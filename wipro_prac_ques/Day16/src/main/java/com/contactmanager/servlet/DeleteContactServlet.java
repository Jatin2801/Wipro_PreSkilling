package com.contactmanager.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.contactmanager.dao.ContactDao;

public class DeleteContactServlet extends HttpServlet {

    private final ContactDao dao = new ContactDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idx = request.getParameter("id");
        int id = -1;
        try { id = Integer.parseInt(idx); } catch (Exception e) { /* ignore */ }

        HttpSession session = request.getSession();
        boolean ok = dao.deleteContact(id);
        if (ok) {
            session.setAttribute("message", "Contact deleted successfully.");
        } else {
            session.setAttribute("error", "Failed to delete contact. Invalid id.");
        }

        response.sendRedirect(request.getContextPath() + "/viewContacts");
    }
}
