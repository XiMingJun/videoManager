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

<jsp:include page="menu.jsp"/>

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
                    <input type="text" class="form-control" id="exampleInputName2" placeholder="请输入讲师姓名">
                </div>
                <div class="form-group">
                    <label >性别</label>
                    <select name="searchGender" class="form-control">
                        <option value="0" >女</option>
                        <option value="1" >男</option>
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
                    <div class="form-group">
                        <label>姓名：
                        <input type="text" id="name" name="name" class="form-control"  placeholder="请输入讲师姓名">
                        </label>
                        <label>职位：
                            <input type="text" id="job" name="job" class="form-control"  placeholder="请输入讲师职位">
                        </label>
                        <label>性别:
                            <select name="courseSelect">
                                <option value="0">女</option>
                                <option value="1" selected="selected">男</option>
                            </select>
                        </label>
                    </div>

                    <div class="form-group">
                        <label>头像：</label>
                        <input type="text" id="portrait" name="portrait" class="form-control"  placeholder="请输入讲师头像地址">
                    </div>
                    <div class="form-group">
                        <label>简介：</label>
                        <textarea class="form-control" id="description"  name="description" rows="5" cols="80"></textarea>
                    </div>
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
                <td>
                    ${teacher.gender}
                </td>
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
