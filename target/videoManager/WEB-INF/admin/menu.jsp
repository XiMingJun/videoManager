<%--
  Created by IntelliJ IDEA.
  User: wangjian
  Date: 2018/5/11
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Fixed navbar -->
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">智游视频网站后台管理</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">智游视频网站后台管理</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li <c:if test="${active =='video'}">class="active"</c:if>><a href="/videoManager/videos/all.do">视频管理</a></li>
                <li <c:if test="${active =='teacher'}">class="active"</c:if>><a href="/videoManager/teachers/all.do">主讲人管理</a></li>
                <li <c:if test="${active =='course'}">class="active"</c:if>><a href="/videoManager/course/all.do">课程管理</a></li>
                <li class="dropdown" <c:if test="${active =='stastic'}">class="active"</c:if>>
                    <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">统计分析 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/videoManager/admin/course_stastic.do">课程播放统计</a></li>
                        <li><a href="/videoManager/admin/course_stastic.do">视频播放统计</a></li>
                    </ul>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
