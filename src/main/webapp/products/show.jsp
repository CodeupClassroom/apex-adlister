<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fer
  Date: 6/8/20
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>One Product</title>
</head>
<body>

<c:if test="${error != ''}">
    <h3>${error}</h3>
</c:if>


<h1>One product</h1>

<div>
    <h3>${product.name}</h3>
    <p>${product.price}</p>
</div>

</body>
</html>
