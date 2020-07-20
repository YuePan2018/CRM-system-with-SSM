<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>商品信息管理</title>   
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 导入easyui 的资源文件-->
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link id="themeLink" rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">


  </head>
  
  <body>
	<table id="list"></table>	
	<!-- 用java script 展示datagrid -->
	<script type="text/javascript">
		$(function(){
			$("#list").datagrid({
				//url:后台数据查询的地址
				url:"customer/list.action",
				//columns：填充的列数据,是一个二维数组,每个一维数组都是一列
				//field:后台对象的属性
				//tille:列标题
				columns:[[
				{
					field:"id",
					title:"客户编号",
					width:100,
					checkbox:true
				},
				{
					field:"name",
					title:"客户姓名",
					width:200
				},
				{
					field:"gender",
					title:"客户性别",
					width:200
				},
				{
				field:"telephone",
				title:"客户手机",
				width:200
				},
				{
				field:"address",
				title:"客户住址",
				width:200
				}
				]]
			});
		});
	</script>
  </body>
</html>
