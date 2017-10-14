<%--
  Created by IntelliJ IDEA.
  User: LucaCDO
  Date: 13/10/17
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Formulario Login</title>
</head>
<body>
    <form id="simple-form" method="post" action="/LoginServlet">
        Usermame: <input type="text" name="username" value="">
        <br>
        Password: <input type="password" name="password" value="">
        <br>
        <input type="submit" value="login" >
    </form>
</body>
</html>
