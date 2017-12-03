<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
    pageContext.setAttribute("basePath", basePath);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
<h1>${basePath}</h1>
</body>
</html>
