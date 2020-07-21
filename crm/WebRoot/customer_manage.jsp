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
  
  <!-- when this jsp is loaded, a tool bar and a table(filled by datagrid of easyui) will show up-->
  <!-- when clicking tool bar, a window will pop up to edit table-->
  <body>
	<table id="list"></table>
	
	<!-- 1. a toolbar of easyUI to create, update and delete -->
	<div id="tb">
		<!-- <a> is hyperlink tag, -->
		<!-- data-option determines the appearance of button -->
		<a id="addBtn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-add',plain:true">添加</a>
		<a id="editBtn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-edit',plain:true">修改</a>
		<a id="deleteBtn" href="#" class="easyui-linkbutton"
		data-options="iconCls:'icon-remove',plain:true">删除</a>
	</div>
	
	<!-- 2. a window of eaysUI to edit customer-->
	<!-- "closed:true" config: window not pop up at first-->
	<div id="win" class="easyui-window" title="客户数据编辑"
		style="width:500px;height:300px"
		data-options="iconCls:'icon-save',modal:true,closed:true">
		<!-- input as a form -->
		<form id="editForm" method="post">
			<!-- validatebox is a class which verifies required texts -->
			客户姓名：<input type="text" name="name" class="easyui-validatebox"
			data-options="required:true"/><br/>
			客户性别：
			<input type="radio" name="gender" value="男"/>男
			<input type="radio" name="gender" value="女"/>女
			<br/>
			客户手机：<input type="text" name="telephone" class="easyui-validatebox"
			data-options="required:true"/><br/>
			客户住址：<input type="text" name="address" class="easyui-validatebox"
			data-options="required:true"/><br/>
			<a id="saveBtn" href="#" class="easyui-linkbutton"
			data-options="iconCls:'icon-save'">保存</a>
		</form>
	</div>
	
	<!-- 3.a function of filling table and clicking button-->
	<script type="text/javascript">
		$(function(){
			// 3.1 datagrid to fill the table "list"
			$("#list").datagrid({
				//url:back-end data query path
				url:"customer/list.action",
				//columns：format of returned data
				//field:name of data
				//tille:column title
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
				]],
				// toolbar of easyUI
				toolbar:"#tb"
			});
			// 3.2 click "addBtn" to "open" the window "win"
			$("#addBtn").click(function(){
				$("#win").window("open");
			});
			// 3.2 click "saveBtn" to save the the window "win" to back-end
			$("#saveBtn").click(function(){
				$("#editForm").form("submit",{
					//url
					url:"customer/save.action",
					// 3.2.1 onSubmit: call onsSumit before submitting form
					onSubmit:function(){
						// if validate function is true, submit form
						return $("#editForm").form("validate");
					},
					// 3.2.2 success: call success after submitting form
					success:function(data){ 
						//data: char[] data returned from server (Controller.java)
						//transform char[] to an Object
						data = eval("("+data+")");
						// print the status of saving
						if(data.success){
							// close window and refresh datagrid
							$("#win").window("close");
							$("#list").datagrid("reload");
							// print success
							$.messager.alert("提示","保存成功","info");
						}else{
							// print fail 
							$.messager.alert("提示","保存失败："+data.msg,"error");
						}
					}
				});
			});
		});
	</script>
  </body>
</html>
