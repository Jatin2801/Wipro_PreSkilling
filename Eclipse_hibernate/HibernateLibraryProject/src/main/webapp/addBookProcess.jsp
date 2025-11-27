<%@ page import="com.java.hibernatelibraryproject.resources.MainProg" %>
<%@ page import="javax.servlet.RequestDispatcher" %>
<%@ page import="com.java.hibernatelibraryproject.resources.Books" %>

<jsp:useBean id="bean1" class="com.java.hibernatelibraryproject.resources.Books"/>
<jsp:setProperty property="*" name="bean1"/>

<%
    MainProg obj = new MainProg();
    String msg = obj.addBook(bean1);
    
    request.setAttribute("msg", msg); 
    RequestDispatcher rd = request.getRequestDispatcher("addBook.jsp");
    rd.forward(request, response);
%>
