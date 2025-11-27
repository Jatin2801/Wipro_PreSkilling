<%@ page import="com.java.hibernatelibraryproject.resources.TransBook" %>
<%@ page import="com.java.hibernatelibraryproject.resources.TransReturn" %>
<%@ page import="com.java.hibernatelibraryproject.resources.MainProg" %>
<%@ page import="com.java.hibernatelibraryproject.resources.TransBook" %>
<%@ page import="com.java.hibernatelibraryproject.resources.TransReturn" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.ParseException" %>


<%
    String rbook[] = request.getParameterValues("bookid");
    String user = (String) session.getAttribute("user");
    int bid;

    try {
        MainProg obj = new MainProg(); 

        if (rbook != null) {
            for (String s : rbook) {
                bid = Integer.parseInt(s);

                int fine = obj.returnBooks(bid, user); 

                if (fine == -1) {
                    out.println("<h3>Book with ID " + bid + 
                        " could not be returned. Not found in your issued list.</h3>");
                } 
                else {
                    out.println("<h3>Book with ID " + bid + 
                        " returned successfully! " + 
                        (fine > 0 ? "Fine: Rs " + fine : "No fine") + 
                        "</h3>");

                    if (fine > 0) {
                        out.println("<script>showFine(" + fine + ");</script>");
                    }
                }
            }
        } 
        else {
            out.println("<h3>No books selected!</h3>");
        }
    } 
    catch(Exception e) {
        out.println("<h3>Error while returning books: " + e.getMessage() + "</h3>");
        e.printStackTrace();
    }
%>