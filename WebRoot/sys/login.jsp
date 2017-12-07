<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
    pageContext.setAttribute("basePath", basePath);
%>

<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="renderer" content="webkit" />
    <title>系统登录</title>
    <script src="${basePath}/static/js/jquery-3.2.1.min.js"></script>
</head>
<body>
<form id="login_form" >
    <input type="text" id="username" placeholder="用户名" />
    <input type="password" id="password" placeholder="密码" />
    <select id="type">
        <option value="0">前台</option>
        <option value="1">系统管理员</option>
    </select>
    <input type="button" value="登 录" id="login" />
</form>

<script>
    $("#login").click(function() {
        var username = $("#username").val();
        var password = $("#password").val();
        var type = $("#type").val();
        if(!!!username) {
            $("#username").focus();
            return;
        }

        if(!!!password) {
            $("#password").focus();
            return;
        }

        $.ajax({
            type : "post",
            url : "${basePath}/sys/login/logincheck.action",
            data : {
                "username" : username,
                "password" : password,
                "type" : type
            },
            dataType : "json",
            success : function(data) {
                if(data.msg=="success") {
                    window.location.href="${basePath}/sys/index.jsp";
                }
                else {
                    alert("用户名密码错误！")
                }
            },
            error : function() {
                alert("系统异常请稍后重试");
            }
        })
    });
</script>
</body>
</html>