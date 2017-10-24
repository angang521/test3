<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="//apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script src="//libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>
<meta http-equiv="refresh" content="30">

<script>
function displayDate(){
	document.getElementById("demo").innerHTML=Date();
}
</script>

</head>
<body>

<p>show user!</p>
<p>show user!!!!!!!!</p>

	
<script>
function changeImage()
{
	element=document.getElementById('myimage')
	if (element.src.match("bulbon"))
 	{
  		element.src="/statics/images/course/pic_bulboff.gif";
  	}
	else
   {
  		element.src="/statics/images/course/pic_bulbon.gif";
   }
}
</script>
<img id="myimage" onclick="changeImage()"
src="/statics/images/course/pic_bulboff.gif" width="100" height="180">
<p>点击灯泡就可以打开或关闭这盏灯</p>
	<p id="demo">这是一个段落</p>

<button type="button" onclick="displayDate()">显示日期</button>

</body>
</html>