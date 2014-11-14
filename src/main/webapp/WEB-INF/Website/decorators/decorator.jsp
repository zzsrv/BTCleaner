<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="zh">
<head>
<base href="<%=basePath%>">

<title><sitemesh:write property='title' /></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="keywords" content="种子清洁,Java万维网" />
<meta name="description" content="种子清洁,Java万维网" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=basePath%>libSuite/defaultUI/css/style.css" type="text/css" rel="stylesheet" />
<!-- 从被装饰页面获取head start-->
<sitemesh:write property='head' />
<!-- 从被装饰页面获取head end-->
</head>
<body>
	<jsp:include page="../header.jsp" flush="true"></jsp:include>
	<!-- 从被装饰页面获取body标签内容  start-->
	<sitemesh:write property='body' />
	<!-- 从被装饰页面获取body标签内容  end-->
	<jsp:include page="../footer.jsp" flush="true"></jsp:include>
</body>
</html>
