<%--
  Created by IntelliJ IDEA.
  User: SiGen
  Date: 2016/12/20
  Time: 17:51
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
    <link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/regist.css" />
    <!--<link rel="stylesheet" href="../../../css/base.css" />-->
</head>

<body>
<div class="register-container">
    <dl class="register-list">
        <dt class="register-item-title">
            <a>&nbsp;&nbsp;注册</a>
        </dt>
        <dt class="register-item-title">
            <a class="register-item-title-login" href="<%=path%>/login">已有账号？现在登录</a>
        </dt>
        <div class="register-container-list">
            <!--TODO: 前端校验-->
            <dt class="register-item-container">
                <label class="register-item-label"><label style="color: red;">&nbsp;&nbsp;&nbsp;&nbsp;*</label>&nbsp;用户名:&nbsp;&nbsp; <input
                        class="register-item" id="username" type="text" required="required" autocomplete="off" placeholder="请输入3-15位中文、英文、数字或下划线"
                        pattern="^[\u4e00-\u9fa5_a-zA-Z0-9_]{3,15}$" /> </label>
            </dt>
            <dt class="register-item-container">
                <label class="register-item-label"><label style="color: red;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</label>&nbsp;密码:&nbsp;&nbsp; <input
                        class="register-item" id="password" name="password" type="password" required="required" placeholder="请输入6-10位英文、数字、下划线" pattern="^\w{6,10}$" /> </label>
            </dt>
            <dt class="register-item-container">
                <label class="register-item-label"><label style="color: red;">*</label>&nbsp;确认密码:&nbsp;&nbsp; <input class="register-item" id="makeSurePassword" name="makeSurePassword" type="password" required="required" pattern="^\w{6,10}$" /> </label>
            </dt>
            <dt class="register-item-container">
                <label class="register-item-label"><label style="color: red;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*</label>&nbsp;Email:&nbsp;&nbsp; <input
                        class="register-item" id="Email" type="text" required="required" /> </label>
            </dt>
            <!--TODO: 添加 《网站服务条款》 伪连接-->
            <div class="register-submit-container">
                <input class="register-submit-button" type="button" value="提交" /> <label
                    style="font-size: 0.9rem; -moz-user-select: none; -ms-user-select: none; -webkit-user-select: none;"><input class="submit-checkbox" type="checkbox" value="" />同意<a href="">《网站服务条款》</a></label>
            </div>
        </div>
    </dl>
</div>
<script type="text/javascript" src="<%=path%>/resources/js/lib/jquery-2.2.0.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="<%=path%>/resources/js/regist.js" charset="UTF-8"></script>
<script type="text/javascript" src="<%=path%>/resources/js/main.js" charset="UTF-8"></script>
</body>
</html>
