<%@ page import="org.example.demo6.ModulRepo" %>
<%@ page import="org.example.demo6.Modul" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 12/3/2024
  Time: 2:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <%
        List<Modul> moduls = ModulRepo.getModulsByCourseId(Integer.parseInt(request.getParameter("courseId")));

        for (Modul modul : moduls) {
            %>
    <h3<%modul.getName();%></h3>
    <h3>SALOM</h3>
            <%
        }
    %>
</div>
</body>
</html>
