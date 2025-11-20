<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Contacts</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <h2>All Contacts</h2>

    <%
        String message = (String) session.getAttribute("message");
        String error = (String) session.getAttribute("error");
        if (message != null) {
    %>
        <div class="success"><%= message %></div>
    <%
            session.removeAttribute("message");
        }
        if (error != null) {
    %>
        <div class="error"><%= error %></div>
    <%
            session.removeAttribute("error");
        }
    %>

    <a class="button" href="addContact.jsp">Add New Contact</a>
    <table>
        <tr>
            <th>#</th><th>Name</th><th>Phone</th><th>Email</th><th>Actions</th>
        </tr>
        <%
            java.util.List contacts = (java.util.List) request.getAttribute("contacts");
            if (contacts != null && !contacts.isEmpty()) {
                for (int i = 0; i < contacts.size(); i++) {
                    com.contactmanager.model.Contact c = (com.contactmanager.model.Contact) contacts.get(i);
        %>
        <tr>
            <td><%= i %></td>
            <td><%= c.getName() %></td>
            <td><%= c.getPhone() %></td>
            <td><%= c.getEmail() %></td>
            <td class="action-cell">
                <a class="button small" href="editContact?id=<%= i %>">Edit</a>
                <a class="button small danger" href="deleteContact?id=<%= i %>" onclick="return confirm('Delete this contact?')">Delete</a>
            </td>
        </tr>
        <%
                }
            } else {
        %>
        <tr><td colspan="5">No contacts yet.</td></tr>
        <%
            }
        %>
    </table>
</div>
</body>
</html>
