<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>計算するよ！</h1>
二つの値をそれぞれのテキストボックスに入れて、計算方法を選択してください。<br>
<form action="http://localhost:8080/Dousatest/Keisan" method="post">
<input type="text" name="su1"><br>
<input type="text" name="su2"><br>

<select name="keihou">
<option value="tasu"selected>+</option>
<option value="hiku">-</option>
<option value="kakeru">×</option>
<option value="waru">÷</option>
</select>

<input type="submit" value="計算する！">

</form>
</body>
</html>