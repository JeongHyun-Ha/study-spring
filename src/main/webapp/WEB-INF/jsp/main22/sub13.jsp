<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty message}">
    <div>${message}</div>
</c:if>
<form action="/main22/sub14" method="post">
    <div>
        id
        <input type="text" name="id">
    </div>
    <div>
        password
        <input type="password" name="password">
    </div>
    <div>
        <input type="submit" value="로그인">
    </div>
</form>
</body>
</html>
