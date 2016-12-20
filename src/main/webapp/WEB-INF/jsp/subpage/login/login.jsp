<%--
  Created by IntelliJ IDEA.
  User: SiGen
  Date: 2016/12/20
  Time: 17:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="<%=path%>/resources/css/login.css" />
</head>
<body>
<div class="login-container">
    <dl class="login-list">
        <dt class="login-item-title">
            <a>&nbsp;&nbsp;登录</a>
        </dt>
        <dt class="login-item-title">
            <%--TODO: change path to url--%>
            <a class="login-item-title-login" href="<%=path%>/regist">没有账号？注册</a>
        </dt>
        <div class="login-container-list">
            <!--TODO: 前端校验-->
            <dt class="login-item-container">
                <label class="login-item-label"><label style="color: red;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>&nbsp;账号:&nbsp;&nbsp; <input
                        class="login-item" id="username" type="text" required="required" /> </label>
            </dt>
            <dt class="login-item-container">
                <label class="login-item-label"><label style="color: red;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>&nbsp;密码:&nbsp;&nbsp; <input
                        class="login-item" id="password" type="text" required="required" /> </label>
            </dt>
            <!--TODO: 自动登录-->
            <dt class="login-item-container">
                <label class="login-item-label" style="float: left; margin-left: 9.38rem;"><input type="checkbox" />自动登录</label>
            </dt>
            <div class="login-submit-container">
                <input class="login-submit-button" type="button" value="登录" /> <label
                    style="font-size: 0.9rem; -moz-user-select: none; -ms-user-select: none; -webkit-user-select: none;"><a style="letter-spacing: 0.025rem;">&nbsp;&nbsp;忘记密码？</a></label>
            </div>
        </div>
    </dl>
</div>
</body>
</html>

