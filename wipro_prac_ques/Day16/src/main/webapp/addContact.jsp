<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Contact</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="container">
    <h2>Add New Contact</h2>
    <form action="addContact" method="post" class="form-card">
        <label>Name:</label>
        <input type="text" name="name" required>

        <label>Phone:</label>
        <input type="text" name="phone" required>

        <label>Email:</label>
        <input type="email" name="email" required>

        <button type="submit">Save Contact</button>
    </form>
    <button class="secondary" onclick="window.location.href='index.jsp'">Back to Home</button>
</div>
</body>
</html>
