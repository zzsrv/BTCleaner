%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" lang="zh">
<head>
<base href="<%=basePath%>">

<title>种子清洁[BT]-Java万维网</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="keywords" content="种子清洁[BT],种子清洁,Java万维网" />
<meta name="description" content="种子清洁[BT],种子清洁,Java万维网" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=basePath%>libSuite/defaultUI/css/style.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<!-- 面包屑 -->
	<div class="crumbs wrapper">
		当前位置：<a href="http://www.javaw.net" title="Java万维网" target="_top">首页</a> - <span>种子清洁[BT]</span>
	</div>

	<!-- 面包屑end -->

	<!-- 产品演示 -->

	<div class="wrapper">

		<div class="demo">

			<h2>种子清洁[BT]</h2>

			<dl>

				<dt>请上传种子文件</dt>

				<dd style="text-align:center">

					<form action="<%=basePath%>torrent.html" method="post" enctype="multipart/form-data">
						<input type="file" name="torrentFile" /><input type="submit" value="上传" />
					</form>

				</dd>

			</dl>

			<dl class="contact">

				<dt>索要源码，请联系作者！</dt>

				<dd>

					<a href="https://github.com/Helios4J/BTCleaner" target="_blank">请联系作者</a>

				</dd>

			</dl>

		</div>
	</div>
	<!-- 产品演示end -->
</body>
</html>
