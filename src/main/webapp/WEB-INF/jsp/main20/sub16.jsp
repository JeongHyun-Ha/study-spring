<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/main20/sub17" method="post">
    <div>
        아이디
        <input type="text" name="id">
    </div>
    <div>
        비밀번호
        <input type="password" name="password">
    </div>
    <div>
        자기소개
        <textarea name="info" id="" cols="30" rows="10"></textarea>
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form>
<hr>
<form action="/main20/sub18" method="post">
    <div>
        이름
        <input type="text" name="name">
    </div>
    <div>
        나이
        <input type="number" name="age" min="1" max="100">
    </div>
    <div>
        주소
        <input type="text" name="address">
    </div>
    <div>
        <input type="submit" value="Submit">
    </div>
</form>
</body>
</html>
