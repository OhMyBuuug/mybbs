<%--
  Created by IntelliJ IDEA.
  User: SiGen
  Date: 2016/12/21
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<base href="<%=basePath%>">
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8" >
    <link rel="stylesheet" type="text/css" href="/resources/css/mybbs.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/toastr.min.css">
</head>
<body>
<div class="bbs-main-container">
    <div class="navBar-list">
        <a class="navBar" href="#sectionList">sectionList</a>
        <a class="navBar" href="#articleList">articleList</a>
        <a class="navBar" href="#articleAndReply">articleAndReply</a>
    </div>
    <div class="reslut-list">
        <ul>
            <li id="sectionList">sectionList</li>
            <li id="articleList">articleList</li>
            <li id="articleAndReply">articleAndReply</li>
        </ul>
    </div>
</div>
<script type="text/javascript" src="/resources/js/lib/jquery-2.2.0.min.js" charset="UTF-8"></script>
<script type="text/javascript" src="/resources/js/lib/toastr.min.js"></script>
<script type="text/javascript" src="/resources/js/mybbs.js" charset="UTF-8"></script>
<script type="text/javascript" src="/resources/js/toastr-option.js"></script>
<script>
    $(function () {
        window.onload = function () {
            toastr.info("进来了:D");
            //插入回复
            $.ajax({
                url:"/mybbs/insertReply",
                type: "post",
                dataType: "json",
                data:{
                    articleId:"1",
                    replyerID: "1",
                    replyContent: "<h1>12楼回复哈哈哈<h1/>",
                    referenceFloor: "0",
                },
                success:function(data){
                    if(data){
                        toastr.success("回复成功");
                    }else{
                        toastr.info(JSON.stringify(data));
                    }

                },
                error:function () {
                    toastr.error("回复失败");
                }
            });

            // 发表文章
//            $.ajax({
//                url:"/mybbs/insertArticle",
//                type: "post",
//                dataType: "json",
//                data:{
//                    sectionID:"1",
//                    articleTitle: "测试文章标题",
//                    articleContent: "<h1>第一篇文章哈哈<h1/>",
//                    articleTag: "初创",
//                },
//                success:function(data){
//                    alert(JSON.stringify(data));
//                }
//            });
        }
//        window.onload = function () {
//            toastr.success("success");
//        }
        // 获取所有的父模块和子模块
//        $.ajax({
//            url: "/mybbs/getModulesAndSections",
//            type: "post",
//            success: function (resultmap) {
//                var sections = resultmap.sections;
//                var lengthOfSections = sections.length;
//                console.log("sections");
//                for (var i = 0; i < lengthOfSections; i++) {
//                    console.log(sections[i]);
////                    alert(JSON.stringify(sections[i]));
//                }
//                var modules = resultmap.modules;
//                var lengthOfModules = modules.length;
//                console.log("modules");
//                for (var i = 0; i < lengthOfModules; i++) {
//                    console.log(modules[i]);
////                    alert(JSON.stringify(modules[i]));
//                }
//            },
//            error: function () {
//                alert("error");
//            }
//        });
        // 根据当前模块ID获得符合条件的文章基本信息列表
//        $.ajax({
//            url:"/mybbs/selectArticleBaseInformationBySectionId",
//            type: "post",
//            dataType: "json",
//            data:{
//                sectionId: "1",
//                pageNumber: "0",
//                countPerPage: "20",
//            },
//            success:function(data){
//                alert(JSON.stringify(data.articleBaseInformation));
//            }
//        });
//        $.ajax({
//            url:"/mybbs/selectArticleContentById",
//            type: "post",
//            dataType: "json",
//            data:{
//               articleId:"1",
//            },
//            success:function(data){
//                alert(JSON.stringify(data.content));
//            }
//        });
        // 根据文章ID获得回复
//        $.ajax({
//            url:"/mybbs/selectReplyByArticleId",
//            type: "post",
//            dataType: "json",
//            data:{
//                articleId:"1",
//                pageNumber: "0",
//                countPerPage: "20",
//            },
//            success:function(data){
//                alert(JSON.stringify(data));
//            }
//        });

    });
</script>
</body>
</html>
