<%String header = "Andrey, zaimi kasar лалка ";%>
<%@ page import="java.util.Date" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>First JSP App</title>
</head>
<body>
<h2><%= header %>
</h2>
<p>Today <%= new java.util.Date()  %>
</p>
</body>
</html>