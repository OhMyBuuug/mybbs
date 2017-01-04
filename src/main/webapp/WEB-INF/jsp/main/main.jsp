<%--
  Created by IntelliJ IDEA.
  User: SiGen
  Date: 2016/12/19
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html>
<html>
<!-- mybbs首页 -->
<head>
    <meta charset="UTF-8">
    <meta name="description" content="电脑硬件玩家的国度"/>
    <meta name="keywords" content="电脑硬件,电脑玩家,电脑,硬件,主板,硬盘,cpu,内存,机箱"/>
    <meta name="author" content="OhMyBuuug"/>
    <meta name="copyright" content="OhMyBuuug"/>
    <title>mybbs</title>
    <link rel="shortcut icon" href="<%=path%>/resources/image/mybbs.jpg"/>
    <link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/main.css"/>
    <link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/base.css"/>
    <link rel="stylesheet" type="text/css" href="<%=path%>/resources/css/toastr.min.css"/>
</head>

<body>
<base href="<%=basePath%>">
<div class="main">
    <!-- 顶部导航栏 -->
    <div class="topBar">
        <dl class="topBar-list">
            <dt class="topBar-item">
                <a>硬件技术论坛</a>&nbsp;&nbsp;&nbsp;<a>首页</a>
            </dt>
            <dt class="topBar-item">
                <a class="a4page" data-url="<%=path%>/regist">立即注册</a>
                &nbsp;<span>|</span>&nbsp;
                <a class="a4page" data-url="<%=path%>/login">登录</a>
            </dt>
        </dl>
    </div>
    <!--BBS logo-->
    <img src="<%=path%>/resources/image/BBS.jpg" class="logo"/>
    <div class="selectBar">
        <dl class="selectBar-list">
            <dt class="selectBar-item">
                <a class="selectAbleItem a4page" data-url="<%=path%>/homepage">首页</a><a
                    class="selectAbleItem a4page" data-url="<%=path%>/player">玩家</a><a
                    class="selectAbleItem a4page" data-url="<%=path%>/manufacturer">厂商</a><a
                    class="selectAbleItem selected a4page" data-url="<%=path%>/mybbs">技术论坛</a><a
                    class="selectAbleItem a4page" data-url="<%=path%>/living">评测直播</a>
            </dt>
            <dt class="selectBar-item">
                <input type="text" placeholder="请输入搜索内容" class="sortKey" id="sort-item"/>
                <!-- TODO -->
                <!--<select class="sortStrategy">
                        <option value="content">内容</option>
                        <option value="user">用户</option>
                    </select>-->
                <input type="button" class="sortButton" />
            </dt>

        </dl>
    </div>
    <!--<iframe src="../subpage/mybbs/mybbs.html" class="page"  frameborder="no" scrolling="no" marginheight="0" marginwidth="0"></iframe>-->
    <iframe src="<%=path%>/mybbs" class="page" frameborder="no" scrolling="no"
            marginheight="0" marginwidth="0"></iframe>
    <div class="footPageContainer">
        <div class="footZone-nav">
            <a class="unselect" style="cursor: pointer;">&ensp;&ensp;· 关于我们</a>
            <a class="unselect" style="cursor: pointer;">&ensp;&ensp;· 小黑屋</a>
            <a class="unselect" style="cursor: pointer;">&ensp;&ensp;· mybbs</a>
            <a class="unselect" style="cursor: pointer;">&ensp;&ensp;· 联系我 :)</a>
        </div>
    </div>
</div>
<script src="<%=path%>/resources/js/lib/jquery-2.2.0.min.js" type="text/javascript" charset="UTF-8"></script>
<script type="text/javascript" src="<%=path%>/resources/js/main.js" charset="UTF-8"></script>
<script type="text/javascript" src="<%=path%>/resources/js/lib/toastr.min.js"></script>
<%--<script type="text/javascript">
    $(function () {
        $(".a4page").click(function () {
            url = "<%=path%>/login/getTest";
            $.ajax({
                url: url,
                type: 'post',
                success: function (data) {
                    // var message = eval("("+data+")");
                    // var user = $.parseJSON(data);
                    // alert(user.age);
                    // alert(user.userName);
                    alert(JSON.stringify(data));
                    alert(data.age);
                    alert(data.userName);
                }
            })
        });
    });
</script>--%>
</body>

</html>
