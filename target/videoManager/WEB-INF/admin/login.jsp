<%--
  Created by IntelliJ IDEA.
  User: wangjian
  Date: 2018/5/9
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Bootstrap -->
    <link href="/videoManager/css/bootstrap.min.css" rel="stylesheet">
    <link href="/videoManager/css/signin.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="/videoManager/js/jquery.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="/videoManager/js/bootstrap.min.js"></script>

    <title>视频网站后台登录</title>
</head>
<body>


<div class="container">

    <form class="form-signin" action="login.do" method="post">
        <h2 class="form-signin-heading">视频网站后台登录</h2>
        <label  class="sr-only">Email address</label>
        <input  name="name" class="form-control" placeholder="用户名" required="" autofocus="" type="text">

        <label for="inputPassword" class="sr-only">Password</label>
        <input id="inputPassword" name="password" class="form-control" placeholder="密码" required="" type="password">
        <div class="checkbox">
            <label>
                <input value="checkbox" type="checkbox"> 记住我
            </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登 录</button>
    </form>

</div> <!-- /container -->


<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>



</body>
</html>
