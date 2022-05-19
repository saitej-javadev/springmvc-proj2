<%--
  Created by IntelliJ IDEA.
  User: abhinay
  Date: 5/19/2022
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Info page</title>
</head>
<body>
   <h1>${page}</h1>
   <h2>current time : ${time}</h2>
    <h3>${cars}</h3>

   <c:forEach items="${movies}" var="item">
       <strong>${item}</strong><br>
   </c:forEach>

</body>
</html>
