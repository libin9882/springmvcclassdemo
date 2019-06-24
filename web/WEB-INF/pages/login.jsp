<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/24
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>张帅</title>
</head>
<body>
<from action="login">
    <<input name="userName"/>
    <input name="userPassword" type="password"/>
    <input type="submit" value="登录"/>
</from>

</body>
</html>
