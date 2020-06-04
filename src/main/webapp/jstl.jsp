<%--
  Created by IntelliJ IDEA.
  User: douglashirsh
  Date: 6/4/20
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
    <% request.setAttribute("isAdmin", false); %>
    <% request.setAttribute("numbers", new int[]{1, 2, 3, 4, 5, 6, 7}); %>

    <c:choose>
        <c:when test="${isAdmin}">
            <p>Welcome Admin User</p>
        </c:when>
        <c:otherwise>
            <p>Welcome User</p>
        </c:otherwise>
    </c:choose>

    <c:if test="${isAdmin}">
        <p>
            Secret Admin Stuff
        </p>
    </c:if>
    <ul>
        <c:forEach items="${numbers}" var="number" >
            <li>${number}</li>
        </c:forEach>
    </ul>
</body>
</html>
