<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en" class="no-js">

    <head>

        <meta charset="utf-8">
        <title>YiSoo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
            <div class="navbar-header page-scroll">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand page-scroll" href="./upload.jsp">伊收-YiSoo</a>
            </div>
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
        </div>
    </nav>
        <script type="text/javascript">
            var flag = 0;
            var studentnumber=0;
            function checkname(argument) {
                var str = document.getElementById('ok').value;
                if(str == ""){
                    flag = 0;
                    alert("校验失败！请重新输入！");
                }
                else{
                    flag = 1;
                    studentnumber = str;
                    document.getElementById("filenamekey").value = studentnumber;
                    alert("校验成功！请选择文件！");
                }
                
            }
            function sub(argument) {
                if(flag == 1){
                	flag = 0;
                    var s = document.getElementById("file").value.length;
                    if(s == 0){
                        alert("请选择文件！");
                        return false;
                    }else{
                        if(document.getElementById('ok').value != document.getElementById("filenamekey").value){
                        	alert("校验异常！");
                        	return false;
                        }else{
                        	if(confirm("请确认文件名："+studentnumber)){
                        		return true;
                        	}else{
                        		return false;
                        	}
                        }
                    }
                }
                else{
                    alert("校验失败！");
                    return false;
                }
            }
        </script>
        <div class="page-container">
            <h1>YiSoo OA 文件收集</h1>
            <br>

            <marquee><span>
				<h2 class="filelook" ><script>document.write(gundongtongzhi);</script></h2>	
			</span></marquee>
			<br>
            <form action="<%=basePath%>/name"  id = "da2" name = "f" target="hidden_frame">
                <input type="text"  style="display:none" name="filenamekey1" id="filenamekey" />
				<input type="text"  name="namedata" id="ok" />
				<input type="submit" onclick="checkname()" value="校验文件名">
			</form>
			<iframe name='hidden_frame' id="hidden_frame" src="about:blank" style="display:none"></iframe>
            <form action="<%=basePath%>/upload" enctype="multipart/form-data" method="post" id = "da" onsubmit="return sub()" >
                <input type="file" name="file1" class = "username" id="file"   style="height: 42px;">
				<input type="submit" value="提交" onclick="upload();">
			</form> 
			<input type="submit" onclick="window.location.href='<%=basePath%>listFile'"  value = "查看文件">
			<br>
        </div>
    
        <div align="center">
            <br>
			<p class="filelook">by：mmciel</p>
			
			<p class="filelook">V1.3</p>
            
        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>
			<script src="./projectvalue/js/classie.js"></script>
	<script src="./projectvalue/js/cbpAnimatedHeader.js"></script>
	    <script>
!function(){function n(n,e,t){return n.getAttribute(e)||t}function e(n){return document.getElementsByTagName(n)}function t(){var t=e("script"),o=t.length,i=t[o-1];return{l:o,z:n(i,"zIndex",-1),o:n(i,"opacity",.5),c:n(i,"color","0,0,0"),n:n(i,"count",99)}}function o(){a=m.width=window.innerWidth||document.documentElement.clientWidth||document.body.clientWidth,c=m.height=window.innerHeight||document.documentElement.clientHeight||document.body.clientHeight}function i(){r.clearRect(0,0,a,c);var n,e,t,o,m,l;s.forEach(function(i,x){for(i.x+=i.xa,i.y+=i.ya,i.xa*=i.x>a||i.x<0?-1:1,i.ya*=i.y>c||i.y<0?-1:1,r.fillRect(i.x-.5,i.y-.5,1,1),e=x+1;e<u.length;e++)n=u[e],null!==n.x&&null!==n.y&&(o=i.x-n.x,m=i.y-n.y,l=o*o+m*m,l<n.max&&(n===y&&l>=n.max/2&&(i.x-=.03*o,i.y-=.03*m),t=(n.max-l)/n.max,r.beginPath(),r.lineWidth=t/2,r.strokeStyle="rgba("+d.c+","+(t+.2)+")",r.moveTo(i.x,i.y),r.lineTo(n.x,n.y),r.stroke()))}),x(i)}var a,c,u,m=document.createElement("canvas"),d=t(),l="c_n"+d.l,r=m.getContext("2d"),x=window.requestAnimationFrame||window.webkitRequestAnimationFrame||window.mozRequestAnimationFrame||window.oRequestAnimationFrame||window.msRequestAnimationFrame||function(n){window.setTimeout(n,1e3/45)},w=Math.random,y={x:null,y:null,max:2e4};m.id=l,m.style.cssText="position:fixed;top:0;left:0;z-index:"+d.z+";opacity:"+d.o,e("body")[0].appendChild(m),o(),window.onresize=o,window.onmousemove=function(n){n=n||window.event,y.x=n.clientX,y.y=n.clientY},window.onmouseout=function(){y.x=null,y.y=null};for(var s=[],f=0;d.n>f;f++){var h=w()*a,g=w()*c,v=2*w()-1,p=2*w()-1;s.push({x:h,y:g,xa:v,ya:p,max:6e3})}u=s.concat([y]),setTimeout(function(){i()},100)}();
</script>
    </body>

</html>
