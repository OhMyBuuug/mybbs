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
<script type="text/javascript" src="<%=path%>/resources/js/lib/jquery-2.2.0.min.js" charset="UTF-8"></script>
<script>
    window.onload=function () {
        $.ajax({
            url: "<%=path%>/mybbs/getModulesAndSections",
            type: "post",
            success:function (resultmap) {
                alert("1");
                alert("resultmap.toString:  "+ resultmap.toString());
                var sections = resultmap.sections;
                var lengthOfSections = sections.length;
                console.log("sections");
                for(var i = 0;i<lengthOfSections;i++){
                    console.log(sections[i]);
                    alert(sections[i]);
                }
                var modules = resultmap.modules;
                var lengthOfModules = modules.length;
                console.log("modules");
                for(var i = 0;i<lengthOfModules;i++){
                    console.log(modules[i]);
                    alert(modules[i]);
                }
            },
            error:function () {
                alert("error");
            }
        });
    }
</script>
</body>
</html>
