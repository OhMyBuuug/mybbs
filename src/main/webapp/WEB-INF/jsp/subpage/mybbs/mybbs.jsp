<%--
  Created by IntelliJ IDEA.
  User: SiGen
  Date: 2016/12/21
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+path;
%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/mybbs.css">
</head>
<body>
这是论坛 :)
<script>
    window.onload=function () {
        alert("<%=basePath%>");
    }
</script>
</body>
</html>
