<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main20/sub10" method="post">
    <div>
        도시
        <input type="text" name="city">
        주소
        <input type="text" name="address">
    </div>
    <div>
        제목
        <input type="text" name="title">
    </div>
    <div>
        내용
        <textarea name="content" id="" cols="30" rows="10"></textarea>
    </div>
    <div>
        <input type="submit">
    </div>
</form>
</body>
</html>
