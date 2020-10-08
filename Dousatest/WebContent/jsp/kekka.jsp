<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
p{
	color:red;
}
</style>
</head>
<body>
<%
	//エラーメッセージ取得
	String err = (String)request.getAttribute("err");
	if(err != null){%>
	<p><%=err %></p>
<%
	}
%>


<h1>計算結果！！</h1>
<h2><%=request.getAttribute("result") %></h2>

<button onclick="location.href='/Dousatest/jsp/Keisan.jsp'">最初に戻る</button>
</body>
</html>