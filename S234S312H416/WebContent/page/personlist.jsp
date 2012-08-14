<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>人员列表</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  		<table align="center" border="1">
			<tr>
				<th>序号</th>
				<th>姓名</th>
			</tr>
			 <s:iterator value="personlist">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="name"/></td>
			</tr>
			</s:iterator>
		</table>
  <input type="button" value="返回" onclick="javascript:location.href='<%=request.getContextPath() %>'">
  </body>
</html>
