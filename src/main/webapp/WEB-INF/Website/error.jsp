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

<title>文件上传错误-Java万维网</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="keywords" content="文件上传错误,种子清洁,Java万维网" />
<meta name="description" content="文件上传错误,种子清洁,Java万维网" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=basePath%>libSuite/defaultUI/css/style.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<h1>文件过大，请重新选择</h1>
</body>
</html>
