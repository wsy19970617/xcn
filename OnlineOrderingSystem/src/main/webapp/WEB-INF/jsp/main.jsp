<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>小菜鸟火锅官网</title>
<link rel="stylesheet" href="src/main/resources/static/bower_components/layui/dist/css/layui.css">
</head>
<body class="layui-layout-body">
	<div class="layui-layout layui-layout-admin">
	
		<!-- *************************** -->
		<div class="layui-header">
			<!-- 1、头部区域（可配合layui已有的水平导航） -->
			<div class="layui-logo">小菜鸟火锅</div>
			<ul class="layui-nav layui-layout-left">
				<li class="layui-nav-item"><a href="">首页</a></li>
			      <li class="layui-nav-item">
			        <a href="javascript:;">服务管理</a>
			        <dl class="layui-nav-child">
			          <dd><a href="">菜单更新</a></dd>
			          <dd><a href="">菜单添加</a></dd>
			        </dl>
			      </li>
			</ul>
			<ul class="layui-nav layui-layout-right">
				<li class="layui-nav-item"><a href="javascript:;"> <img
						src="http://t.cn/RCzsdCq" class="layui-nav-img">小菜鸟
				</a>
					<dl class="layui-nav-child">
						<dd>
							<a href="">基本资料</a>
						</dd>
						<dd>
							<a href="">安全设置</a>
						</dd>
					</dl></li>
				<li class="layui-nav-item"><a href="">狠心离开</a></li>
			</ul>
		</div>

		<!-- *************************** -->
		<div class="layui-side layui-bg-black">
			<div class="layui-side-scroll">
				<!-- 2、左侧导航区域（可配合layui已有的垂直导航） -->
				<ul class="layui-nav layui-nav-tree" lay-filter="test">
					<li class="layui-nav-item layui-nav-itemed">
					<a class="" href="javascript:;">欢迎你</a>
					<a class="" href="javascript:;">所有服务</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;">选餐服务</a>
							</dd>
							<dd>
								<a href="">超链接</a>
							</dd>
						</dl>
					</li>
				</ul>
			</div>
		</div>
		
		<!-- *************************** -->
		<div class="layui-body">
			<!-- 3、内容主体区域 -->
			<div style="padding: 15px;">内容主体区域</div>
		</div>

		<!-- *************************** -->
		<div class="layui-footer">
			<!-- 4、底部固定区域 -->
			© xcn.cn - 底部固定区域
		</div>
	</div>
	
	<!-- *************************** -->
	<script src="../src/layui.js"></script>
	<script>
		//JavaScript代码区域
		layui.use('element', function() {
			var element = layui.element;

		});
	</script>
</body>
</html>