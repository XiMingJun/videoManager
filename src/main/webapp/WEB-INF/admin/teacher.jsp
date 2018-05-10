<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="/videoManager/css/bootstrap.min.css" rel="stylesheet">
    <link href="/videoManager/css/theme.css" rel="stylesheet">
    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script src="/videoManager/js/jquery.min.js"></script>
    <script src="/videoManager/js/bootstrap.min.js"></script>
    <title>后台管理</title>
</head>
<body>
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
                <li ><a href="/videoManager/videos/all.do">视频管理</a></li>
                <li class="active"><a href="/videoManager/teacher/all.do">主讲人管理</a></li>
                <li><a href="/videoManager/course/all.do">课程管理</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">统计分析 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">课程播放统计</a></li>
                        <li><a href="#">视频播放统计</a></li>
                    </ul>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container theme-showcase" role="main">
    <div class="">
        <h5>后台 <small>主讲人管理</small></h5>
    </div>
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">主讲人查询</h3>
        </div>
        <div class="panel-body">
            <form class="form-inline">
                <div class="form-group">
                    <label for="exampleInputName2">讲师名字</label>
                    <input type="text" class="form-control" id="exampleInputName2" placeholder="请输入课程名称">
                </div>
                <div class="form-group">
                    <label >讲师</label>
                    <select name="searchTeacher">
                        <option value="1">teacherA</option>
                        <option value="2">teacherA</option>
                        <option value="3">teacherA</option>
                    </select>
                </div>
                <div class="form-group">
                    <label >课程</label>
                    <select name="searchCourse">
                        <option value="1">courseA</option>
                        <option value="2">courseB</option>
                        <option value="3">courseC</option>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">查询</button>
                <a class="btn btn-warning" data-toggle="modal" data-target="#myModal">新增</a>
            </form>
        </div>
    </div>
    <!-- Modal 讲师-->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">讲师信息</h4>
                </div>
                <div class="modal-body">
                    <label>课程名称： <input type="text" class="form-control"  placeholder="请输入课程名称"></label>
                    <label>
                        <p>课程所属学科：</p>
                        <select name="courseSelect">
                            <option value="1">大数据</option>
                            <option value="2">UI</option>
                            <option value="3">VR</option>
                        </select>
                    </label>

                    <label>
                        <p>讲师：</p>
                        <select name="teacherSelect">
                            <option value="1">龙伟虎</option>
                            <option value="2">张奇</option>
                            <option value="3">石添添</option>
                        </select>
                    </label>
                    <label>
                        视频地址： <input type="text" class="form-control"  placeholder="请输入课程视频地址">
                    </label>
                    <p>课程描述： <textarea rows="5" cols="80"></textarea></p>
                    <p>封面： <input type="text" class="form-control"  placeholder="请输入课程封面地址"></p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary">保存</button>
                </div>
            </div>
        </div>
    </div>
    <table class="table tableSubHeadingColor" style="margin-bottom:0px;">
        <thead>
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>性别</th>
            <th>头像</th>
            <th>简介</th>
            <th>职位</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <%--遍历视频数组--%>
        <c:forEach  var="teacher" items="${requestScope.teacherList}" >
            <tr>
                <th scope="row">${teacher.teacherId}</th>
                <td>${teacher.name}</td>
                <td>${teacher.gender}</td>
                <td>${teacher.portrait}</td>
                <td>${teacher.description}</td>
                <td>${teacher.job}</td>
                <td>
                    <button type="button" class="btn btn-xs btn-warning" data-toggle="modal" data-target="#myModal">修改</button>
                    <button type="button" class="btn btn-xs btn-danger" onclick="confirm('确认删除么')">删除</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li>
                <a href="#" aria-label="Previous">
                    <span aria-hidden="true">«</span>
                </a>
            </li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li>
                <a href="#" aria-label="Next">
                    <span aria-hidden="true">»</span>
                </a>
            </li>
        </ul>
    </nav>
</div> <!-- /container -->

</body>
</html>
