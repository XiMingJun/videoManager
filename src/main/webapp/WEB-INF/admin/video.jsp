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


<jsp:include page="menu.jsp"/>
<div class="container theme-showcase" role="main">
    <div class="">
        <h5>后台 <small>视频管理</small></h5>
    </div>
    <div class="panel panel-success">
        <div class="panel-heading">
            <h3 class="panel-title">视频查询</h3>
        </div>
        <div class="panel-body">
            <form class="form-inline">
                <div class="form-group">
                    <label for="exampleInputName2">视频名称</label>
                    <input type="text" class="form-control" id="exampleInputName2" placeholder="请输入课程名称">
                </div>
                <div class="form-group">
                    <label >讲师</label>
                    <select name="searchTeacher">

                        <c:forEach items="${requestScope.teacherList}" var="teacher">
                            <option value="${teacher.teacherId}">${teacher.name}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label >课程</label>
                    <select name="searchCourse">
                        <c:forEach items="${requestScope.courseList}" var="course">
                            <option value="${course.courseId}">${course.title}</option>

                        </c:forEach>
                    </select>
                </div>
                <button type="submit" class="btn btn-primary">查询</button>
                <a class="btn btn-warning" data-toggle="modal" data-target="#myModal">新增</a>
            </form>
        </div>
    </div>
    <!-- Modal 添加视频，修改视频 -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">视频信息</h4>
                </div>
                <div class="modal-body">

                    <form action="/videoManager/course/saveCourse.do" id="courseForm">
                    <div class="form-group">
                        <label>课程名称：</label>
                        <input type="text" id="courseTitle" name="title" class="form-control"  placeholder="请输入课程名称">
                    </div>

                    <div class="form-group">

                        <label>课程所属学科： </label>

                        <select class="form-control" id="courseId" name="courseId">

                            <c:forEach items="${requestScope.courseList}" var="course">
                                <option value="${course.courseId}">${course.title}</option>
                            </c:forEach>

                        </select>
                    </div>


                    <div class="form-group">
                        <label>讲师：</label>
                        <select class="form-control" name="teacherId">

                            <c:forEach items="${requestScope.teacherList}" var="teacher">
                                <option value="${teacher.teacherId}">${teacher.name}</option>
                            </c:forEach>

                        </select>

                    </div>


                    <div class="form-group">

                        <label>视频地址：</label>
                        <input type="text" id="videoAddress" name="videoAddress" class="form-control"  placeholder="请输入课程视频地址">

                    </div>

                    <div class="form-group">

                        <label>封面：</label>
                         <input type="text" id="coverAddress" name="cover" class="form-control"  placeholder="请输入课程封面地址">
                    </div>

                    <div class="form-group">

                        <label>课程描述：</label>
                        <textarea class="form-control" id="description"  name="description" rows="5" cols="80"></textarea>
                    </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" onclick="$('#courseForm').submit()">保存</button>
                </div>
            </div>
        </div>
    </div>
    <table class="table tableSubHeadingColor" style="margin-bottom:0px;">
        <thead>
        <tr>
            <th>ID</th>
            <th>学科</th>
            <th>课程名称</th>
            <th>讲师</th>
            <th>时长</th>
            <th>封面</th>
            <th>视频地址</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
            <%--遍历视频数组--%>
            <c:forEach  var="aVideo" items="${requestScope.videoList}" >
            <tr>
                <th scope="row">${aVideo.videoId}</th>
                <td>${aVideo.courseId}</td>
                <td>${aVideo.title}</td>
                <td>${aVideo.teacherId}</td>
                <td>${aVideo.videoLength}</td>
                <td>${aVideo.cover}</td>
                <td>${aVideo.videoAddress}</td>
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