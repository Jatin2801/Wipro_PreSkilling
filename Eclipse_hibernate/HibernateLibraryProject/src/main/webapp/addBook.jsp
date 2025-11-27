<jsp:include page="menu.jsp" />

<%
    String msg = (String) request.getAttribute("msg");
    if(msg != null){
%>
    <center><h3 style="color:green;"><%= msg %></h3></center>
<%
    }
%>

<form method="post" action="addBookProcess.jsp">
<center>
    <h2>Add Book</h2>

    Book ID: <input type="number" name="id" required /><br/><br/>
    Book Name: <input type="text" name="name" required /><br/><br/>
    Author: <input type="text" name="author" required /><br/><br/>
    Edition: <input type="text" name="edition" /><br/><br/>
    Department: <input type="text" name="dept" /><br/><br/>
    No of Copies: <input type="number" name="totalbooks" required /><br/><br/>

    <input type="submit" value="Add Book"/>
</center>
</form>
