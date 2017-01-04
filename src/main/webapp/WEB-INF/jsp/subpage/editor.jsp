<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>Thanks for edit(带图片上传)富文本编辑器</title>
    <link rel="stylesheet" href="/resources/assets/design/css/trumbowyg.css">
    <script src="/resources/assets/jquery.min.js"></script>
    <script src="/resources/assets/trumbowyg.js"></script>
    <script src="/resources/assets/plugins/base64/trumbowyg.base64.js"></script>

</head>

<body>

<div id="odiv" style="display:none;position:absolute;z-index:100;">
    <img src="/resources/assets/pic/sx.png" title="缩小" border="0" alt="缩小" onclick="sub(-1);"/>
    <img src="/resources/assets/pic/fd.png" title="放大" border="0" alt="放大" onclick="sub(1)"/>
    <img src="/resources/assets/pic/cz.png" title="重置" border="0" alt="重置" onclick="sub(0)"/>
    <img src="/resources/assets/pic/sc.png" title="删除" border="0" alt="删除" onclick="del();odiv.style.display='none';"/>
</div>
<div  onmousedown="show_element(event)" style="clear:both" id="customized-buttonpane" class="editor"></div>

</body>