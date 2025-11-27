<%@ page language="java" %>
<%@ page import="com.java.hibernatelibraryproject.resources.MainProg" %>

<jsp:useBean id="bean1" class="com.java.hibernatelibraryproject.resources.LibUsers"/>
<jsp:setProperty property="*" name="bean1"/>

<%
    MainProg obj = new MainProg();
    String msg = obj.addLogin(bean1);

    out.println("<h3>" + msg + "</h3>");

    if(msg.equals("User Added Successfully")) {
%>
        <jsp:include page="login.jsp"/>
<%
    } else {
%>
        <jsp:include page="register.jsp"/>
<%
    }
%>
