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
    <link rel="stylesheet" href="${basePath}/lib/layui/css/layui.css" media="all">
</head>
<body>
<button type="button" class="layui-btn" id="test1">
    <i class="layui-icon">&#xe67c;</i>上传图片
</button>

<div class="layui-upload-drag" id="test10">
    <i class="layui-icon">&#xe67c;</i>
    <p>点击上传，或将文件拖拽到此处</p>
</div>

<script src="${basePath}/lib/layui/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script>
    layui.use('upload', function(){
        var upload = layui.upload;

        //执行实例
        var uploadInst = upload.render({
            elem: '#test10' //绑定元素
            ,url: '${basePath}/sys/room/upload.action' //上传接口
            ,drag: true //支持拖拽上传
            ,accept: "images" //仅仅支持文件上传
            ,before: function(obj){ //obj参数包含的信息，跟 choose回调完全一致，可参见上文。
                layer.load(); //上传loading
            }
            ,done: function(res, index, upload){
                layer.closeAll('loading'); //关闭loading
            }
            ,error: function(index, upload){
                layer.closeAll('loading'); //关闭loading
            }
        });
    });
</script>
</body>
</html>
