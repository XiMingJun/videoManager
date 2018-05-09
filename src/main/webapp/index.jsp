<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                <li class="active"><a href="#">视频管理</a></li>
                <li><a href="#about">主讲人管理</a></li>
                <li><a href="#contact">课程管理</a></li>
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
                    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail3">讲师</label>
                    <input type="email" class="form-control" id="exampleInputEmail3" placeholder="jane.doe@example.com">
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail4">课程</label>
                    <input type="email" class="form-control" id="exampleInputEmail4" placeholder="jane.doe@example.com">
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
                    <label>课程名称： <input type="text" class="form-control"  placeholder="请输入课程名称"></label>

                    课程所属学科： <input type="text" class="form-control"  placeholder="请输入所属学科">
                    讲师： <input type="text" class="form-control"  placeholder="讲师">
                    课程描述： <input type="text" class="form-control"  placeholder="请输入课程描述">
                    封面： <input type="text" class="form-control"  placeholder="请输入课程封面">
                    视频地址： <input type="text" class="form-control"  placeholder="请输入课程视频地址">
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
            <th>#</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Username</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
            <td>
                <button type="button" class="btn btn-xs btn-warning" data-toggle="modal" data-target="#myModal">修改</button>
                <button type="button" class="btn btn-xs btn-danger" onclick="confirm('确认删除么')">删除</button>
            </td>
        </tr>
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