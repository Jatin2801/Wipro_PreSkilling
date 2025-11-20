<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Contact</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <h2>Edit Contact</h2>
    <form action="updateContact" method="post" class="form-card">
        <input type="hidden" name="id" value="${id}" />
        <label>Name:</label>
        <input type="text" name="name" value="${contact.name}" required />
        <label>Phone:</label>
        <input type="text" name="phone" value="${contact.phone}" required />
        <label>Email:</label>
        <input type="email" name="email" value="${contact.email}" required />
        <div class="button-group">
            <button type="submit">Update Contact</button>
            <a class="button" href="viewContacts">Cancel</a>
        </div>
    </form>
</div>
</body>
</html>
