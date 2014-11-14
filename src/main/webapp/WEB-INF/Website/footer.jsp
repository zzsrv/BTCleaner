<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<!-- 页脚 -->

<div class="footer">

	<div class="wrapper">

		<div class="footer-nav">
			<a href="http://www.javaw.net" target="_top">首页</a><i></i> <a href="http://blog.javaw.net" target="_blank">博客</a><i></i> <a href="http://btcleaner.javaw.net" target="_top">种子清洁</a><i></i> <a href="http://httpproxy.javaw.net" target="_top">HTTP代理</a><i></i> <a href="http://www.javaw.net/about.html" target="_top">关于作者</a>
		</div>

		<div class="clearfix"></div>

		<div class="copyright">
			Copyright © 2014 <a href="http://www.javaw.net" target="_top">Java万维网</a> 豫ICP备14003862号
		</div>

	</div>

</div>

<!-- 页脚end -->