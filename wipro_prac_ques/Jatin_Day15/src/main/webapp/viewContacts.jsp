<%@ page import="java.util.*, com.contactmanager.model.Contact" %>
<%
    List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
    if (contacts == null) {
        contacts = new ArrayList<Contact>();
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>All Contacts</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <h2>Saved Contacts</h2>

    <%
        if (contacts.isEmpty()) {
    %>
        <p>No contacts added yet.</p>
    <%
        } else {
    %>
    <table>
        <tr>
            <th>Name</th>
            <th>Phone</th>
            <th>Email</th>
        </tr>
        <%
            for (Contact c : contacts) {
        %>
        <tr>
            <td><%= c.getName() %></td>
            <td><%= c.getPhone() %></td>
            <td><%= c.getEmail() %></td>
        </tr>
        <%
            }
        %>
    </table>
    <%
        }
    %>

    <button class="secondary" onclick="window.location.href='index.jsp'">Back to Home</button>
</div>
</body>
</html>
