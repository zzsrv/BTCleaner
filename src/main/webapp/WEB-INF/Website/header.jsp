<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<div class="header">

	<div class="wrapper">

		<div class="logo left">
			<a href="http://www.javaw.net" target="_top"><img src="<%=basePath%>libSuite/defaultUI/images/logo.png" alt="Java万维网"></a>
		</div>

		<div class="nav right">

			<ul>

				<li><a href="http://www.javaw.net" target="_top">首页</a></li>
				<li><a href="http://blog.javaw.net" target="_blank">博客</a></li>
				<li><a href="http://btcleaner.javaw.net" target="_top">种子清洁</a></li>
				<li><a href="http://httpproxy.javaw.net" target="_top">HTTP代理</a></li>
				<li><a href="http://www.javaw.net/about.html" target="_top">关于作者</a></li>

			</ul>

		</div>

	</div>

</div>

<!-- 导航与LOGOend -->
