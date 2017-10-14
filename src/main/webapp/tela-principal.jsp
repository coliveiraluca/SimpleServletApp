<%--
  Created by IntelliJ IDEA.
  User: LucaCDO
  Date: 13/10/17
  Time: 12:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String myLogin = (String) session.getAttribute("myLogin");
    String myPassword = (String) session.getAttribute("myPassword");
%>
<html>
<head>
    <title>Tela Principal</title>
</head>
<body>
    <h1>Login realizado com sucesso!</h1>
    <p>Username is: <%=myLogin%></p>
    <p>Password is: <%=myPassword%></p>

</body>
</html>
