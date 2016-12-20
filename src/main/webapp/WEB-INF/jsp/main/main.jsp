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
    <link rel="shortcut icon" href="<%=path%>/resources/imagine/mybbs.jpg"/>
    <link rel="stylesheet" type="text/css" href="<%=path%>/resources/html/main/main.css"/>
</head>

<body>
<div class="main">
    <!-- 顶部导航栏 -->
    <div class="topBar">
        <dl class="topBar-list">
            <dt class="topBar-item">
                <a>硬件技术论坛</a>&nbsp;&nbsp;&nbsp;<a>首页</a>
            </dt>
            <dt class="topBar-item">
                <a class="a4page" data-url="<%=path%>/resources/html/subpage/regist/regist.html">立即注册</a>
                &nbsp;<span>|</span>&nbsp;
                <a class="a4page" data-url="<%=path%>/resources/html/subpage/login/login.html">登录</a>
            </dt>
        </dl>
    </div>
    <!--BBS logo-->
    <img src="<%=path%>/resources/imagine/BBS.jpg" class="logo"/>
    <div class="selectBar">
        <dl class="selectBar-list">
            <dt class="selectBar-item">
                <a class="selectAbleItem a4page" data-url="<%=path%>/resources/html/subpage/homepage/homepage.html">首页</a><a
                    class="selectAbleItem a4page" data-url="<%=path%>/resources/html/subpage/player/player.html">玩家</a><a
                    class="selectAbleItem a4page" data-url="<%=path%>/resources/html/subpage/manufacturer/manufacturer.html">厂商</a><a
                    class="selectAbleItem selected a4page" data-url="<%=path%>/resources/html/subpage/mybbs/mybbs.html">技术论坛</a><a
                    class="selectAbleItem a4page" data-url="<%=path%>/resources/html/subpage/living/living.html">评测直播</a>
            </dt>
            <dt class="selectBar-item">
                <input type="text" placeholder="请输入搜索内容" class="sortKey" id="sort-item"/>
                <!-- TODO -->
                <!--<select class="sortStrategy">
                        <option value="content">内容</option>
                        <option value="user">用户</option>
                    </select>-->
                <input type="button" class="sortButton"></input>
            </dt>

        </dl>
    </div>
    <!--<iframe src="../subpage/mybbs/mybbs.html" class="page"  frameborder="no" scrolling="no" marginheight="0" marginwidth="0"></iframe>-->
    <iframe src="<%=path%>/resources/html/subpage/regist/regist.html" class="page" frameborder="no" scrolling="no"
            marginheight="0" marginwidth="0"></iframe>
</div>
<script src="<%=path%>/resources/js/jquery-2.2.0.min.js" type="text/javascript" charset="UTF-8"></script>
<script type="text/javascript" src="<%=path%>/resources/html/main/main.js" charset="UTF-8"></script>
<%--<script type="text/javascript">
    $(function () {
        $(".a4page").click(function () {
            url = "<%=path%>/getUserMessage?id=1";
            $.ajax({
                url: url,
                type: 'get',
                success: function (data) {
                    // var message = eval("("+data+")");
                    var user = $.parseJSON(data);
                    alert(user.age);
                    alert(user.userName);
                }
            })
        });
    });
</script>--%>
</body>

</html>
