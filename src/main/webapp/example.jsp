<%--
  Created by IntelliJ IDEA.
  User: douglashirsh
  Date: 6/4/20
  Time: 9:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Example</title>
</head>
<body>
    <%@ include file="partials/navbar.jsp"%>
    <%! int counter = 0; %>
    <!-- This is an html comment -->
    <% counter += 1; %>
    <h1>This as an example page! <%= counter %></h1>

    <h1>Implicit JSP objects</h1>
    <%-- Implicit objects in JSP --%>
    <p>Path: <%= request.getRequestURL() %></p>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>"name" parameter: <%= request.getParameter("name") %></p>
    <p>"method" attribute: <%= request.getMethod() %></p>
    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>

    <h1>JSP Expression Language EL</h1>
    <%-- JSP Expression Language EL --%>
    <p>User-Agent header: ${header["user-agent"]}</p>
    <p>"page_no" parameter: ${param.page_no}</p>

    <% request.setAttribute("name", "Fernando"); %>
    <p>Hello ${name}!</p>

    <%@ include file="partials/thebestfooterever.jsp" %>
</body>
</html>
