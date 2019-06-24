<%--
  Created by IntelliJ IDEA.
  User: 张帅
  Date: 2019/6/24
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="toUserAddPage">添加</a>
    <br/>
    <c:forEach items="${list}" var="user">
        ${user.id}&nbsp;${user.userCode}&nbsp;${user.address}&nbsp;<br/>
    </c:forEach>
</body>
</html>
