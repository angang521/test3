<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="//apps.bdimg.com/libs/angular.js/1.4.6/angular.min.js"></script>
<script src="//libs.baidu.com/jquery/1.10.2/jquery.min.js"></script>

</head>
<body>
success ! showUser !
<div ng-app="">
  <p>名字 : <input type="text" ng-model="name"></p>
  <h1>Hello {{name}}</h1>
</div>
</body>
</html>