<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>伊收</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
	<link rel="stylesheet" href="./projectvalue/css/bootstrap.min.css"  type="text/css">
    <link href="./projectvalue/owl-carousel/owl.carousel.css" rel="stylesheet">
    <link rel="stylesheet" href="./projectvalue/css/style.css">
        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">
 <script src="assets/js/ini.js"></script>
    </head>

    <body>
	    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="./upload.jsp">伊收-精简</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
					<li>
                        <a class="page-scroll" href="upload.jsp">主页</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="./projectvalue/htmlpackage/about.html">关于</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#">管理员登录</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
        <div class="page-container">
            <h1>YiSoo OA 文件收集</h1>
            <br>
            <br>
            <div class="connect">
                    <p><script>document.write(newfile);</script></p>
                    <br>
                    <br>

            </div>
			  <h1 class="heihei">成功上传 ：</h1>
				<c:forEach var="me" items="${fileNameMap}">
					<c:url value="/downLoad" var="downurl">
						<c:param name="filename" value="${me.key}">
						</c:param>
					</c:url>
					<h2 class="filelook">${me.value}</h2>
				</c:forEach>
        	</div>

        <div align="center">
            <br>
            <br>
            by：mmciel
        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>
	<script src="./projectvalue/js/classie.js"></script>
	<script src="./projectvalue/js/cbpAnimatedHeader.js"></script>
    </body>

</html>
