<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main21/sub1" method="get">
    <input type="submit">
</form>
<form action="/main21/sub1" method="post">
    <input type="submit">
</form>
<hr>
<form action="/main21/sub3" method="get">
    <input type="submit" value="GET">
</form>
<form action="/main21/sub3" method="post">
    <input type="submit" value="POST">
</form>
<hr>
<form action="/main21/sub4" method="get">
    <input type="submit" value="GET">
</form>
<form action="/main21/sub4" method="post">
    <input type="submit" value="POST">
</form>
<hr>

<form action="/main21/sub5" method="get">
    <input type="submit" value="get 방식으로 sub5">
</form>
<form action="/main21/sub5" method="post">
    <input type="submit" value="post 방식으로 sub5">
</form>
</body>
</html>
