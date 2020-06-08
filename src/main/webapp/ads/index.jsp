<%--
  Created by IntelliJ IDEA.
  User: fer
  Date: 6/8/20
  Time: 4:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All the ads</title>
</head>
<body>

<c:forEach var="ad" items="${ads}">
    <div id="ad-${ad.id}">
        <h3>${ad.title}</h3>
        <p>${ad.description}</p>
        <span>posted by: ${ad.userId}</span>
    </div>
</c:forEach>

</body>
</html>
